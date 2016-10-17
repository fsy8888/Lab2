package com.info.action;
import java.sql.*;
import java.util.*;

import org.apache.struts2.ServletActionContext;

import dao.Dao;
import dao.dao_author;
import dao.dao_book;
public class LoginAction {

	private String Name;//
    private Dao dao=new Dao();
    public List<dao_book> Reportlist=new  ArrayList<dao_book>();
    int j=0;
    
    dao_author author=new dao_author();
    dao_book book=new dao_book();
    
    private	String ISBN;
    private	String Title;
    private String AuthorID;
    private	String Publisher;
    private	String PublishDate;
    private	String Price;
    /*private String authorname;
    
    public  void setAuthorname(String authorname)
   	{
   		this.authorname=authorname;
   	}
   	public String getAuthorname()
   	{
   		return this.authorname;
   	}*/
    //private String AuthorID;
    //private String Name;
    private String Age;
    private String Country;
    
    
  
		
    public void setAge(String Age)
    {
	  	this.Age=Age;
    }
			
	public String getAge()
	{
     	return this.Age;
    }
			
	 public void setCountry(String Country)
   {
	 	this.Country=Country;
   }
				
	public String getCountry()
	{
		return this.Country;
	}
	
	
	
    public void setISBN(String ISBN)
    {
   	 this.ISBN=ISBN;
    }
       
    public String getISBN()
    {
   	 return this.ISBN;
    }

    public void setTitle(String Title)
    {
   	 this.Title=Title;
    }
    
    public  String   getTitle()
    {
   	 return this.Title;
    }
    
    public void setAuthorID(String AuthorID)
    {
   	 this.AuthorID=AuthorID;
    }
    
    public String getAuthorID()
    {
   	 return this.AuthorID;
    }
    
    public void setPublisher(String Publisher)
    {
   	 this.Publisher=Publisher;
    }
    
    public String getPublisher()
    {
   	 return this.Publisher;
    }
    
    public void setPublishDate(String PublishDate)
    {
   	 this.PublishDate=PublishDate;
    }
    
    public String getPublishDate()
    {
   	 return this.PublishDate;
    }
    
    public void setPrice(String Price)
    {
   	 this.Price=Price;
    }
    
    public String getPrice()
    {
   	 return this.Price;
    }
    
    

    public String getName() 
  {
       return Name;
  }
	 
	public void  setName(String Name) 
  {
	         this.Name = Name;
  }

	public void setContentList(List<dao_book> Reportlist)
	{
		this.Reportlist=Reportlist;
	}
	public List<dao_book> getContentlist()
	{
		return this.Reportlist;
	}
	
	
	
	
	public String execute() throws Exception
     //分成三类     作者名字不存在   作者名字存在但是没有作品    作者名字存在且有作品
     //第一：作者名字不存在的情况：
	{
     String noone="select* from author where Name="+"'"+getName()+"'";//找名字  
	 ResultSet noll=dao.executeQuery(noone); 	
	 if(noll.next())//存在人员
	 {
    	 
    	 String sql ="select * from Book where AuthorID=(select AuthorID from author where name= '" +getName()+"' )";//找名字又找
    	 ResultSet nll = dao.executeQuery(sql);
    	 while(nll.next())
		 {
    	   dao_book book1=new dao_book();
		   book1.setISBN( nll.getString(1));
		   book1.setTitle(nll.getString(2));
		   book1.setAuthorID(nll.getString(3));
		   book1.setPublisher(nll.getString(4));
		   book1.setPublishDate(nll.getString(5));
		   book1.setPrice( nll.getString(6));
		   Reportlist.add(j,book1);
		   j=j+1;
		   System.out.println("这是更改的地方");
		   
		 }

    	 if(j!=0)//有人有书
       {
    		 
    		  return "success";
       }
	 
    	 else//有人没书
    	 {
    		 return "nobook";
    	 }
	 }
    	 
    else 
	 {
		 return "error";
	 }
}
	public String xiangxi() throws Exception
	{
		
		setAuthorID(ServletActionContext.getRequest().getParameter("AuthorID"));
		setISBN(ServletActionContext.getRequest().getParameter("ISBN"));
		//数据库进行查询
		String author_cunzai ="select * from author where AuthorID="+"'"+getAuthorID()+"'";
		//System.out.println(getName());
		//System.out.println(author_cunzai);
        ResultSet cunzai = dao.executeQuery(author_cunzai);//从author表中获取作者详细信息
		
		 while(cunzai.next())
		 {
			 
			 author.setAuthorID(cunzai.getString(1));
			 author.setName(cunzai.getString(2));
			 author.setAge(cunzai.getString(3));
			 author.setCountry(cunzai.getString(4));
			 
		 }
		 
		 String book_cunzai ="select * from Book where ISBN="+"'"+getISBN()+"'";
		 ResultSet cunzai1 = dao.executeQuery(book_cunzai);//从book表中获取图书详细信息
		 while(cunzai1.next())
		 {
		
 		   book.setISBN( cunzai1.getString(1));
 		   book.setTitle(cunzai1.getString(2));
 		   book.setAuthorID(cunzai1.getString(3));
 		   book.setPublisher(cunzai1.getString(4));
 		   book.setPublishDate(cunzai1.getString(5));
 		   book.setPrice(cunzai1.getString(6));
		 }
		   ServletActionContext.getRequest().setAttribute("author", author);//zheshi ?????????
		   ServletActionContext.getRequest().setAttribute("book", book);//????BOOK?
		  return "xiangxixinxi";
		 

    }
	public String shanchu() throws Exception
	{
		 String BOOKNAME;
		 
		 BOOKNAME=ServletActionContext.getRequest().getParameter("bookname");
		 String delete_sql="delete from Book where Title="+"'"+BOOKNAME+"'";
	
		 dao.executeUpdate(delete_sql);
		 return "deletesuccess";
    }
	public String xinzengxinxi() throws Exception
	{
		//System.out.println(getISBN());
		 //String IsBN;
		 //IsBN=getISBN();
		//String xinzeng="insert into Book values(getISBN(), getTitle(), getAuthorID(),getPublisher(),getPublishDate(),getPrice())";
		int temp=1;
		String no_authorid="select* from author where AuthorID="+"'"+getAuthorID()+"'";//找名字  
		ResultSet mll=dao.executeQuery(no_authorid);
		if(mll.next())
		{
			temp=0;
		}
		System.out.println(temp);
		if(temp==0)
		
		{
		String xinzeng="insert into Book values("+getISBN()+","+"'"+getTitle()+"'"+","+ getAuthorID()+","+"'"+getPublisher()+"'"+","+"'"+getPublishDate()+"'"+","+"'"+getPrice()+"'"+")";

		dao.executeUpdate(xinzeng);
		 return "xinzengchenggong";
		 }
		else
		{
			String xinzeng1="insert into Book values("+getISBN()+","+"'"+getTitle()+"'"+","+ getAuthorID()+","+"'"+getPublisher()+"'"+","+"'"+getPublishDate()+"'"+","+"'"+getPrice()+"'"+")";

			dao.executeUpdate(xinzeng1);
			return "tianjiazuozhe";
		}
		
	}
	public String tianjiazuo() throws Exception
	{
		String xinzeng2="insert into author values("+ getAuthorID()+","+"'"+getName()+"'"+","+ getAge()+","+"'"+getCountry()+"'"+")";

		dao.executeUpdate(xinzeng2);
		return "tianjiazuozhechenggong";
	}
	public String gengxintushu () throws Exception
	{
		
		String delete_sql="delete from Book where Title="+"'"+getTitle()+"'";
		dao.executeUpdate(delete_sql);
		String xinzeng3="insert into Book values("+getISBN()+","+"'"+getTitle()+"'"+","+ getAuthorID()+","+"'"+getPublisher()+"'"+","+"'"+getPublishDate()+"'"+","+"'"+getPrice()+"'"+")";

		dao.executeUpdate(xinzeng3);
		return "genxintushuchenggong";
		
	}
	
}