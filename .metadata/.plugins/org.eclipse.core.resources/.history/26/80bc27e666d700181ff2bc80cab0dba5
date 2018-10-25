package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private ArrayList<ItemInfoDTO> itemInfoDTO=new ArrayList<ItemInfoDTO>();

	public ArrayList<ItemInfoDTO> getItemInfo() throws SQLException{

		String sql="SELECT id,item_name,item_price,item_stock,insert_date FROM item_info_transaction";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				ItemInfoDTO dto=new ItemInfoDTO();
				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("itemName"));
				dto.setItemPrice(rs.getString("itemPrice"));
				dto.setItemStock(rs.getString("itemStock"));
				dto.setInsertDate(rs.getString("insertDate"));
				itemInfoDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}

		return itemInfoDTO;

	}


}
