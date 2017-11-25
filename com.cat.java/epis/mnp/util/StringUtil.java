package epis.mnp.util;


public class StringUtil {
	public String nullToEmpty(String c) {
		return  c == "" ? null : c;
	}
	public String chknull(String k) {
		return  k.equalsIgnoreCase("null")? "'%%'" : "'%"+k+"%'";
	}
	public String Isnull(Object object) {
		return  object == null ? null : object.toString();
	}
	public String orString(String or) {
		return  or == null ? null : " AND "+or;
	}
}
