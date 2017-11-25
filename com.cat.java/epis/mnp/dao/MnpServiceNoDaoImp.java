package epis.mnp.dao;

import java.util.List;
import java.util.Map;

import epis.mnp.util.JDBCService;

public class MnpServiceNoDaoImp implements MnpServiceNoDao{

	@Override
	public String ListOderId(int orderId) throws Exception {
		String sql ="";
		List<Map<String,Object>> list = null;
		list = JDBCService.getInstance().getJdbcTemplate().queryForList(sql);
		return null;
	}

}
