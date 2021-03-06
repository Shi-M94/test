package com.internousdev.ecsite02.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite02.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite02.dto.BuyItemCompleteDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private BuyItemCompleteDAO buyItemCompleteDAO=new BuyItemCompleteDAO();
	private BuyItemCompleteDTO buyItemCompleteDTO=new BuyItemCompleteDTO();
	private String errorMassage;

	public String execute() throws SQLException{
		buyItemCompleteDAO.buyItemInfo(
				session.get("id").toString(),
				session.get("login_user_id").toString(),
				session.get("total_price").toString(),
				session.get("count").toString(),
				session.get("pay").toString());


		buyItemCompleteDAO.decreseItemStock(
					Integer.parseInt(session.get("count").toString()),
					session.get("id").toString());

			/*if(!(buyItemCompleteDTO.getErrorMassage()).equals("")){
				String result=ERROR;
				buyItemCompleteDTO.getErrorMassage();
				return result;
			}else{
			*/
				String result=SUCCESS;
				return result;
			//}
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}
