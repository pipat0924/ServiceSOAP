package epis.main.test;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import epis.mnp.control.MnpServiceController;
import epis.mnp.model.M1_OrderModel;
import epis.mnp.model.MnpMasOderModel;
import epis.mnp.model.MnpReceiptDetailModel;
import epis.mnp.model.MnpReceiptModel;
import epis.mnp.model.MnpReverseReceiptModel;
import epis.mnp.model.Request_M1;
import epis.mnp.util.SqlUtils;
import epis.mnp.util.StringUtil;

public class TestAction {
	private static final Logger logger = Logger.getLogger(TestAction.class);
	public void urlTest(URL url) {

	}
	public static void main(String[] arg) throws Exception {
		MnpMasOderModel model = new MnpMasOderModel();
		MnpServiceController cont = new MnpServiceController() ;
		MnpReverseReceiptModel rever = new MnpReverseReceiptModel();
		MnpReceiptDetailModel redetail = new MnpReceiptDetailModel();
		MnpReceiptModel rem4 = new MnpReceiptModel();
		Request_M1 re_m1 = new Request_M1();
		rever.setReceiptId("543170017");
		rever.setServiceNo("818490041");
		redetail.setReceiptId("3333");
		redetail.setAccountName("BIGC");
		redetail.setTotalAmount("799");
		redetail.setVatAmount("599");
		redetail.setRepeatOrderID("22222");
		redetail.setOfficerName("IT GOT Test");
		redetail.setOrderId("021312091117188");

		rem4.setReceiptId("3333");
		rem4.setCancelNote("NO THANK CAT");
		rem4.setOfficerName("CAT");
		rem4.setAccountName("SCB BY");
		rem4.setServiceNo("818490041");
		rem4.setReceiptNo("33333");
		redetail.setOrderId("021312091117188");
		re_m1.setOrderId("021312091117188");
//		re_m1.setCustomerName("null");
		re_m1.setMdn("818490042");
//		re_m1.setCustomerSurname("null");
//		logger.info("Output ===="+cont.M01_FindOrder(re_m1));

		logger.info("Output ===="+cont.M05_FindOrder("021312091117188"));
//		logger.info("Output ===="+cont.M02_FindOrderDetail("021312091117188"));
//		logger.info("Output ===="+cont.M04_ReverseReceipt(rever));
//		logger.info("Output ===="+cont.M04_UpdateReceipt(rem4));
		logger.info("Output ===="+cont.M03_CreateReceipt(redetail));
//		Gson gson = new Gson();
//		StringUtil util = new StringUtil();
		
//		String json = gson.toJson(rever);
//		Map parammap = new HashMap<>();
//		parammap = new Gson().fromJson(json, HashMap.class);
//		logger.info(parammap);
//		logger.info(util.getMultipleSql("", "", parammap));
	}
	
}
