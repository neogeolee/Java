package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2020/05/26
 * �̸� : ������
 * ���� : JDBC DELETE �ǽ��ϱ�
 */
public class DeleteTest {
	public static void main(String[] args) throws Exception{
		
		//DB����
		String host = "jdbc:mysql://192.168.44.7:3306/lth";
		String user = "lth";
		String pass = "1234";
		
		//1�ܰ� - JDBC ����̹��ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - �����ͺ��̽�����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		//3�ܰ� - SQL���ఴü����
		Statement stmt = conn.createStatement();
		
		//4�ܰ� - SQL����
		String sql = "DELETE FROM `USER1` WHERE `uid` = 'j101' ";
		stmt.executeUpdate(sql);
		
		//5�ܰ� - ����� ���� (SELECT�� ���)
		//6�ܰ� - �����ͺ��̽� ����
		conn.close();
		System.out.println("DELETE �Ϸ�...");
		
	}//main end

}