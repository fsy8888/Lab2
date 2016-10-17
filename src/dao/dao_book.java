package dao;
public class dao_book {
    private	String ISBN;
    private	String Title;
    private String AuthorID;
    private	String Publisher;
    private	String PublishDate;
    private	String Price;
    
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
}
