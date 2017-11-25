package epis.mnp.dao;


import java.sql.SQLException;

import epis.mnp.model.MnpReceiptDetailModel;
import epis.mnp.model.MnpReceiptModel;
import epis.mnp.model.MnpReverseReceiptModel;
import epis.mnp.model.ReponseM4;


public interface MnpReceiptDao {
	public String InsertReceiptDetail(MnpReceiptDetailModel detail)throws Exception;
	public ReponseM4 UpdateReceipt(MnpReceiptModel model);
}
