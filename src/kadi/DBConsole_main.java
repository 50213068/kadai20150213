package kadi;


import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ローカル変数用意
		int id;
		String month;
		double average_maximum_temperature,average_temperature,average_minimum_temperature;
		ResultSet rs;
		
		//MySQLクラスのインスタンス生成
		MySQL mysql = new MySQL();

		//テーブルから情報を持ってくる
		rs = mysql.selectAll();
		
		try {
			while(rs.next()){
				id = rs.getInt("id");
				month = rs.getString("month");
				average_maximum_temperature = rs.getDouble("average_maximum_temperature");
				average_temperature = rs.getDouble("average_temperature");
				average_minimum_temperature = rs.getDouble("average_minimum_temperature");
				System.out.println("ID：" + id);
				System.out.println("月：" + month);
				System.out.println("平均最高気温：" + average_maximum_temperature);
				System.out.println("平均気温：" + average_temperature);
				System.out.println("平均最低気温：" + average_minimum_temperature);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Graph_View graph = new Graph_View();
		graph.setBounds(5,5,655,455);
		graph.setVisible(true);
	}

}
