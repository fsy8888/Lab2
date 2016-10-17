package dao;
public class dao_author {
    private String AuthorID;
    private String Name;
    private String Age;
    private String Country;
    
    
    public void setAuthorID(String AuthorID)
    {
    	this.AuthorID=AuthorID;
    }
	
	public String getAuthorID()
	{
		return this.AuthorID;
	}
	
	public void setName(String Name)
	{
    	this.Name=Name;
    }		
	public String getName()
	{
		return this.Name;
	}
		
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
				
	
	
}

