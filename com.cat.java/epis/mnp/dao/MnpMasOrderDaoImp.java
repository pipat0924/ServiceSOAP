package epis.mnp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;

import com.google.gson.Gson;

import epis.mnp.model.M1_OrderModel;
import epis.mnp.model.MnpMasOderModel;
import epis.mnp.model.Request_M1;
import epis.mnp.util.JDBCService;
import epis.mnp.util.SqlUtils;
import epis.mnp.util.StringUtil;

public class MnpMasOrderDaoImp implements MnpMasOrderDao{
	private static final Logger logger = LogManager.getLogger(MnpMasOrderDaoImp.class);
	StringUtil notEn = new StringUtil();
	SqlUtils sqlutils = new SqlUtils();
	Gson gson = new Gson();
	StringUtil util = new StringUtil();
	Map parammap = new HashMap<>();
	@Override
	public List<M1_OrderModel> SelectMasOrder(Request_M1 re_m1) throws Exception {
		logger.info("M01_FindOrderDetail INPUT =="+re_m1.getCustomerSurname());
		List<M1_OrderModel>listOrder = new ArrayList<M1_OrderModel>();
		
		String chk ="Y" ,sqlMnd ="",sqlOrderId ="",sqlName ="",sqlsurN ="",sql ="";
		
			if(null != re_m1.getOrderId() && !re_m1.getOrderId().equalsIgnoreCase("null")){sqlOrderId =" AND TB.ORDERID LIKE '%"+re_m1.getOrderId()+"%'";}
			if(null != re_m1.getMdn() && !re_m1.getMdn().equalsIgnoreCase("null")){sqlMnd = " AND TNF.SERVICENO LIKE'%"+re_m1.getMdn()+"%' ";chk = "N";}
			if(null != re_m1.getCustomerName() && !re_m1.getCustomerName().equalsIgnoreCase("null") ){sqlName = " AND TB.NAME LIKE '%"+re_m1.getCustomerName().toString()+"%' ";}
			if(null != re_m1.getCustomerSurname()&& !re_m1.getCustomerSurname().equalsIgnoreCase("null")){sqlsurN = " AND TB.SURNAME LIKE'%"+re_m1.getCustomerSurname().toString()+"%' ";}
				
		if(chk == "N") {
			sql = "SELECT TB.ORDERID, TB.TITLE ,TB.NAME ,TB.SURNAME,TB.ADDRESS, TB.CATEGORYNAME FROM TBMNPMASSERVICENO TNF LEFT JOIN  TBMNPMASORDER TB  ON TNF.ORDERID = TB.ORDERID "
				+ " WHERE TB.FLAG ='A' AND TNF.ISACTIVE='A' AND TNF.FLAG='A' "+ sqlOrderId+" "+sqlMnd+" "+sqlName+" "+sqlsurN;
		}else{
			sql ="";
			sql = "SELECT TB.ORDERID, TB.TITLE ,TB.NAME ,TB.SURNAME,TB.ADDRESS, TB.CATEGORYNAME FROM TBMNPMASORDER TB WHERE TB.FLAG ='A' "+sqlOrderId+""+sqlMnd+""+sqlsurN;
		}
		logger.info("M01_FindOrderDetail sql=="+sql);
		try {
			List<Map<String,Object>> list = null;
			list = JDBCService.getInstance().getJdbcTemplate().queryForList(sql);
			
			for(int i =0 ;i < list.size(); i++){
				M1_OrderModel masOderset = new M1_OrderModel();
				masOderset.setOrderId(notEn.Isnull(list.get(i).get("ORDERID")));
				masOderset.setCustomerName(notEn.Isnull(list.get(i).get("NAME")));
				masOderset.setCustomerSurname(notEn.Isnull(list.get(i).get("SURNAME")));
				masOderset.setTitle(notEn.Isnull(list.get(i).get("TITLE")));
				masOderset.setAddress(notEn.Isnull(list.get(i).get("ADDRESS")));
				masOderset.setCategoryName(notEn.Isnull(list.get(i).get("CATEGORYNAME")));
				listOrder.add(i, masOderset);
			}
		}catch (DataAccessException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("M01_FindOrderDetail Output==="+listOrder);
		return listOrder;
	}

	@Override
	public List<MnpMasOderModel> ListMasOderIdOrder(String orderId) throws Exception {
			List<MnpMasOderModel> masorderlist =new ArrayList<MnpMasOderModel>();
			try {

					parammap.put("orderId", orderId);
					List<Map<String,Object>> list = JDBCService.getInstance().getJdbcTemplate().queryForList(sqlutils.getSql("M2", "listFindOrderDetail", parammap));
					logger.info("M02_FindOrderDetail 2222 list=="+list.size());
					if(!list.isEmpty()) {
						for(int i = 0 ;i < list.size() ;i++) {
							MnpMasOderModel masOderset = new MnpMasOderModel();
							masOderset.setIccd(notEn.Isnull(list.get(i).get("ICCD")));
							masOderset.setMdn(notEn.Isnull(list.get(i).get("MDN")));
							masOderset.setTotalFeeAmount(notEn.Isnull(list.get(i).get("TOTALFEEAMOUNT")));
							masOderset.setOrderId(notEn.Isnull(list.get(i).get("ORDERID")));
							masOderset.setName(notEn.Isnull(list.get(i).get("NAME")));
							masOderset.setSurname(notEn.Isnull(list.get(i).get("SURNAME")));
							masOderset.setBranchCode(notEn.Isnull(list.get(i).get("BRANCHCODE")));
							masOderset.setBranchName(notEn.Isnull(list.get(i).get("BRANCHNAME")));
							masOderset.setCategoryId(notEn.Isnull(list.get(i).get("CATEGORYID")));
							masOderset.setCategoryName(notEn.Isnull(list.get(i).get("CATEGORYNAME")));
							masOderset.setPortFee(notEn.Isnull(list.get(i).get("PORTFEE")));
							masOderset.setQtyPort(notEn.Isnull(list.get(i).get("QTYPORT")));
							masOderset.setAddress(notEn.Isnull(list.get(i).get("ADDRESS")));
							masOderset.setTaxId(notEn.Isnull(list.get(i).get("TAXID")));
							masOderset.setTtile(notEn.Isnull(list.get(i).get("TITLE")));
							masOderset.setVatAddress1(notEn.Isnull(list.get(i).get("ADDRESS1")));
							masOderset.setVatAddress2(notEn.Isnull(list.get(i).get("ADDRESS2")));
							masOderset.setVatAddress3(notEn.Isnull(list.get(i).get("ADDRESS2")));
							masOderset.setZipcode(notEn.Isnull(list.get(i).get("ZIPCOD")));
							masOderset.setVatRate(notEn.Isnull(list.get(i).get("VATRATE")));
							masOderset.setOrderIdRef(notEn.Isnull(list.get(i).get("ORDERID_REF")));
							masorderlist.add(masOderset);
						}
					}
			}catch (DataAccessException se) {
				se.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
		logger.info("M02_FindOrderDetail OutPut=="+masorderlist.size());
		return masorderlist;
	}

	@Override
	public String RepeatOrder(String orderId) throws Exception {
		String sql="SELECT ORDERID FROM TBMNPMASSERVICENO WHERE ISACTIVE != 'A' AND ORDERID ="+orderId;
		logger.info("M05_FindOrder sql=="+sql);
		List<Map<String, Object>> chkOrder = JDBCService.getInstance().getJdbcTemplate().queryForList(sql);

		logger.info("M05_FindOrder Output=="+chkOrder.size());
		return chkOrder.size() == 0 ? null :chkOrder.get(0).get("ORDERID").toString();
	}


}
