package epis.mnp.dao;

import java.util.ArrayList;
import java.util.List;

import epis.mnp.model.M1_OrderModel;
import epis.mnp.model.MnpMasOderModel;
import epis.mnp.model.Request_M1;



public interface MnpMasOrderDao {
	public List<M1_OrderModel> SelectMasOrder(Request_M1 masOderModel) throws Exception;
	public List<MnpMasOderModel> ListMasOderIdOrder(String orderId) throws Exception;
	public String RepeatOrder(String orderId)throws Exception;
	
}
