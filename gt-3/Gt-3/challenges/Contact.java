interface ContactMangement
  {
    int id=134;
    String name="vikas";
    String emai="vikas@gmail.com";
    long phoneno=274758930;
    public description();
    
  }
class Contact implements ContactMangement
  {
    public description()
    {
      System.out.println("The id is :"+id);
      System.out.println("The address is :"+vijayawada123);
      System.out.println("The name is :"+name);
      System.out.println("The email is :"+email);
      System.out.println("The PHONE NO is :"+phoneno);
      
    }
  }
class contact
  {
    public static void main(String args[])
    {
      ContactMangement obj=new ContactMangement();
      obj.description();
    }
  }

  