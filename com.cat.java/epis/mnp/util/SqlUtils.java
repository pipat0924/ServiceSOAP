package epis.mnp.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;


public class SqlUtils {
	final static Logger logger = Logger.getLogger(SqlUtils.class);
	public StringBuffer readSQLfile(String pathname ,String sqlname){
		StringBuffer datasql = new StringBuffer();
		InputStream is = null ;
		try{

			is = SqlUtils.class.getResource("/sql/"+pathname+"/"+sqlname+".sql").openStream();
			InputStreamReader reader = new InputStreamReader(is);
			char[] charbuffer = new char[1024];
			int forint = -1;

			while ((forint = reader.read(charbuffer)) >0) {
				
				datasql.append(charbuffer, 0, forint);
			}
		}catch(Exception e){
			logger.error("readFile", e);
			e.printStackTrace();
		}
		return datasql;
	}
	public String getSql(String dir, String src, Map m) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql = readSqlFile(dir, src);
		String s = replaceMatcher(sql, m);		
		System.out.println("/" + dir + "/" + src + ".sql ===> [ " + s.toString() +" ]");
		return s.replaceAll(";", "");
	}
	private StringBuffer readSqlFile(String pathname, String sqlname){
		StringBuffer sql = new StringBuffer();
		try {
			InputStream is = SqlUtils.class.getResource("/sql/"+pathname+"/"+sqlname+".sql").openStream();
			InputStreamReader reader = new InputStreamReader(is);
			char[] charBuffer = new char[1024];
			int bytesRead = -1;
			while ((bytesRead = reader.read(charBuffer)) > 0) {
				sql.append(charBuffer, 0, bytesRead);
			}
			reader.close();
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sql;
	}
	public List<String> getMultipleSql(String dir, String src, Map m) throws Exception {
		List<String> sqlList = new ArrayList<String>();
		StringBuffer sql = new StringBuffer();
					sql = readSQLfile(dir,src);
		String s = replaceMatcher(sql, m);
		StringTokenizer st = new StringTokenizer(s, ";", false);
		while (st.hasMoreElements()) {
			String sn = st.nextElement().toString();
			if (sn.trim().length() > 0) {
				logger.info("/sql/" + dir + "/" + src + ".sql ===> [ " + sn +" ]");
				sqlList.add(sn.replaceAll(";", ""));
			}
		}
		System.out.println("sqlList=="+sqlList);
		return sqlList;
	}
	private String replaceMatcher(StringBuffer sql, Map m) {
		// Create pattern of the format ":(%X%)"
		String patternString = ":(\\b.+?\\b)";
		Pattern pattern = Pattern.compile(patternString);
		String sqlGen = sql.toString();
		if ( m.containsKey("COMPID") ) {
			sqlGen = StringUtils.replace(sqlGen, "@COMP", m.get("COMPID").toString());
		}
		Matcher matcher = pattern.matcher(sqlGen);	
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			String sqlParam = matcher.group(1);
			if (m.get(sqlParam) != null) {
				String sqlValue = m.get(sqlParam).toString();
				String v = sqlValue.replaceAll("\'", "\"");
				if(	v.toUpperCase().indexOf("@WHERE ")>0 ||
					v.toUpperCase().indexOf("@AND ")>0 ||
					v.toUpperCase().indexOf("@OR ")>0 ||
					v.toUpperCase().indexOf("@IN ")>0 ||
					v.toUpperCase().indexOf("@ORDER ")>0 ||
					v.toUpperCase().indexOf("@>")>0 ||
					v.toUpperCase().indexOf("@<")>0 ||
					v.toUpperCase().indexOf("@=")>0 ||
					v.toUpperCase().indexOf("@NOQUOTE")==0){
					matcher.appendReplacement(sb,
						v.replaceAll("(?i)@WHERE ", "WHERE ")
						 .replaceAll("(?i)@AND ", "AND ")
						 .replaceAll("(?i)@OR ", "OR ")
						 .replaceAll("(?i)@IN ", "IN ")
						 .replaceAll("(?i)@ORDER ", "ORDER ")
						 .replaceAll("@>", ">")
						 .replaceAll("@<", "<")
						 .replaceAll("@=", "=")
 						 .replaceAll("@NOQUOTE", "")
					);
				} else if(v.trim().isEmpty()){
					matcher.appendReplacement(sb, "null");
				} else {
					matcher.appendReplacement(sb, "'" + v + "'");
				}
			} else {
				matcher.appendReplacement(sb, "null");
			}
		}
		matcher.appendTail(sb);
		String val = sb.toString();		
		return val;
	}
}
