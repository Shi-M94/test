package com.internousdev.ecsite02.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite02.dto.BuyItemCompleteDTO;
import com.internousdev.ecsite02.util.DBConnector;
import com.internousdev.ecsite02.util.DateUtil;

public class BuyItemCompleteDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private DateUtil dateUtil=new DateUtil();
	private BuyItemCompleteDTO buyItemCompleteDTO=new BuyItemCompleteDTO();
	/*private int stock=0;
	private String errorMassage;
	*/


	public void buyItemInfo(String item_transaction_id,String user_master_id,String total_price,String total_count,String pay) throws SQLException{
		String sql="INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date) VALUES(?,?,?,?,?,?)";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, total_count);
			ps.setString(4, user_master_id);
			ps.setString(5, pay);
			ps.setString(6, dateUtil.getDate());
			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public void decreseItemStock(int total_count,String item_transaction_id) throws SQLException{
		String update="UPDATE item_info_transaction SET item_stock=item_stock-? WHERE id=?";
		String select="SELECT item_stock FROM item_info_transaction WHERE id=?";

		try{
			PreparedStatement pss=con.prepareStatement(select);
			pss.setString(1, item_transaction_id);
			ResultSet rs=pss.executeQuery();

			  if(rs.next()){
				  buyItemCompleteDTO.setStock(rs.getInt("item_stock"));
				  if(buyItemCompleteDTO.getStock() <= total_count){
					  buyItemCompleteDTO.setErrorMassage("在庫がありません。");
				  }else{
					  PreparedStatement psu=con.prepareStatement(update);
					  psu.setInt(1, total_count);
					  psu.setString(2, item_transaction_id);
					  psu.execute();
					  }
			  }
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}

	}


	/*public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getErrorMassage() {
		return errorMassage;
	}
	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
	*/



}
