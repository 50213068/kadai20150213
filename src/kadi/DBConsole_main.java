package kadi;


import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���[�J���ϐ��p��
		int id;
		String month;
		double average_maximum_temperature,average_temperature,average_minimum_temperature;
		ResultSet rs;
		
		//MySQL�N���X�̃C���X�^���X����
		MySQL mysql = new MySQL();

		//�e�[�u��������������Ă���
		rs = mysql.selectAll();
		
		try {
			while(rs.next()){
				id = rs.getInt("id");
				month = rs.getString("month");
				average_maximum_temperature = rs.getDouble("average_maximum_temperature");
				average_temperature = rs.getDouble("average_temperature");
				average_minimum_temperature = rs.getDouble("average_minimum_temperature");
				System.out.println("ID�F" + id);
				System.out.println("���F" + month);
				System.out.println("���ύō��C���F" + average_maximum_temperature);
				System.out.println("���ϋC���F" + average_temperature);
				System.out.println("���ύŒ�C���F" + average_minimum_temperature);
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
