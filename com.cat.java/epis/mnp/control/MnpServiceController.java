package epis.mnp.control;

import java.util.List;


import org.apache.log4j.Logger;

import epis.mnp.dao.MnpMasOrderDaoImp;
import epis.mnp.dao.MnpReceiptDaoImp;
import epis.mnp.model.M1_OrderModel;
import epis.mnp.model.MnpMasOderModel;
import epis.mnp.model.MnpReceiptDetailModel;
import epis.mnp.model.MnpReceiptModel;
import epis.mnp.model.ReponseM4;
import epis.mnp.model.Request_M1;



public class MnpServiceController {

	private static final Logger logger = Logger.getLogger(MnpServiceController.class);
	MnpMasOrderDaoImp serviceOder = new MnpMasOrderDaoImp();
	MnpReceiptDaoImp nmpRecep = new MnpReceiptDaoImp();

    public List<M1_OrderModel> M01_FindOrder(Request_M1 finOrder) throws Exception{
		logger.info("M01_FindOrderDetail");
        return serviceOder.SelectMasOrder(finOrder);
    }
	
	public List<MnpMasOderModel> M02_FindOrderDetail(String orderId ) throws Exception{
		logger.info("M02_FindOrderDetail");
        return serviceOder.ListMasOderIdOrder(orderId);	
	}

    public String M03_CreateReceipt(MnpReceiptDetailModel receippt) throws Exception{
		logger.info("M03_CreateReceipt");

        return nmpRecep.InsertReceiptDetail(receippt);
    }
    
    public ReponseM4 M04_UpdateReceipt(MnpReceiptModel reqm4) throws Exception{
		logger.info("M04_UpdateReceipt");
        return nmpRecep.UpdateReceipt(reqm4);
    }
    
	public String M05_FindOrder(String orderId ) throws Exception{
		logger.info("M05_FindOrder");
		
        return serviceOder.RepeatOrder(orderId);	
	}

}
