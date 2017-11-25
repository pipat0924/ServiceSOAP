package epis.mnp.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import com.google.gson.Gson;

import epis.mnp.model.MnpReceiptDetailModel;
import epis.mnp.model.MnpReceiptModel;
import epis.mnp.model.ReponseM4;
import epis.mnp.util.JDBCService;
import epis.mnp.util.SqlUtils;
import epis.mnp.util.StringUtil;


public class MnpReceiptDaoImp implements MnpReceiptDao{
	private static final Logger logger = Logger.getLogger(MnpReceiptDaoImp.class);
	SqlUtils sqlutils = new SqlUtils();
	Gson gson = new Gson();
	StringUtil util = new StringUtil();
	Map parammap = new HashMap<>();
	@Override
	public String InsertReceiptDetail(MnpReceiptDetailModel detail) throws Exception {
		
			int res = 0;
			try {					
					String json = gson.toJson(detail);
					parammap = new Gson().fromJson(json, HashMap.class);
					List<String> sql3 = sqlutils.getMultipleSql("M3", "insertReceipt", parammap);
					for(String sql :sql3) {
						logger.info("M03_CreateReceipt Insert==="+sql3);
						JDBCService.getInstance().getJdbcTemplate().execute(sql);
						res = 1;
					}
			}catch (Exception e) {
					e.printStackTrace();
					res = 0;
			}
			String rs = null;
			if(res == 1){
				rs = "SUCCESS";
				logger.info("M03_CreateReceipt InsertReceiptDetail SUCCESS");
			}else {
				rs = "NOT SUCCESS";
				logger.info("M03_CreateReceipt InsertReceiptDetail NOT SUCCESS");
			}
		return rs;
	}
	@Override
	public ReponseM4 UpdateReceipt(MnpReceiptModel modelM4) {
		int res = 0;
		ReponseM4 reponesM4 = new ReponseM4();
		try {	
				String json = gson.toJson(modelM4);
				parammap = new Gson().fromJson(json, HashMap.class);
				List<Map<String,Object>> getOrderId = JDBCService.getInstance().getJdbcTemplate().queryForList(sqlutils.getSql("M4", "selectOrderId", parammap));
				logger.info("M04_updateReceipt GET OrderId sql =="+getOrderId);
				
				parammap.put("orderId", getOrderId.get(0).get("ORDERID"));
				List<String> listsql = sqlutils.getMultipleSql("M4", "updateReceipt", parammap);
				for(String sql:listsql) {
					 logger.info("M04_updateReceipt  sql =="+sql);
					 JDBCService.getInstance().getJdbcTemplate().execute(sql);
					 res = 1;
				}
				
		}catch (DataAccessException sqlex) {
				sqlex.printStackTrace();
				res = 0;
		}catch (Exception e) {
				e.printStackTrace();
				res = 0;
		}
		if(res != 0){
			reponesM4.setStatus("1");
			reponesM4.setNote("SUCCESS");
			logger.info("M04_updateReceipt SUCCESS");
		}else {
			logger.info("M04_updateReceipt NOT SUCCESS");
			reponesM4.setStatus("0");
			reponesM4.setNote("NOT SUCCESS");
		}
		return reponesM4;
	}

}
