import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <p>MySQLに接続する為のユーティリティクラスです。
 * ルートアカウントにてDBに接続されます。@author internousdev
 */
public class DBConnector {

	//JDBCドライバー名
	private static String driverName="com.mysql.jdbc.Driver";

	//データベース接続URL
	private static String url="jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	//データベース接続ユーザ名
	private static String user="root";

	//データベース接続パスワード
	private static String password="mysql";

	public Connection getConnection(){
		Connection con=null;
		try{
			//JDBC Driverのロード
			Class.forName(driverName);
			//指定されたデータベース(mysql)のURLへの接続を試みる
			con=DriverManager.getConnection(url, user, password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return con;


	}







}
