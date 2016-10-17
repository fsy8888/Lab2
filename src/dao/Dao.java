package dao;
import java.sql.*;
public class Dao {
	Connection con =null;
	Statement stat=null;
	ResultSet rs=null;
	
	public Dao()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");//连接驱动 driver
			con=DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_fsyflh","041ml54mxx","zjm5yz0yxkzyilm14z0ykhm1244lxkh1h3wwizzy");//连接数据库   java与sql
			stat=con.createStatement();
		}
		
		catch(Exception e)
		{
			con=null;
		}
	
	}
	
	public ResultSet executeQuery(String sql)
	{
		try
		{
			
			rs=stat.executeQuery(sql);
		}
		
		catch(Exception e)
		{
			rs=null;
		}
		return rs;
	}
	
	public int executeUpdate(String sql)
	{
		try
		{
			stat.executeUpdate(sql);
			return 0;
		}
		catch(Exception e)
		{
			return -1;
		}
	}
}

