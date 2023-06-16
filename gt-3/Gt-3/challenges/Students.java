import java.util.*;
class InvalidMarkException extends Exception
  {
int id;
String name;
int sb1;
int sb2;
int sb3;
int sb4;
int sb5;
    void InvalidMarkException(int id,String name,int sb1,int sb2,int sb3,int sb4,int sb5)
    {
      this.id=id;
      this.name=name;
      this.sb1=sb1;
          this.sb2=sb2;
          this.sb3=sb3;
          this.sb4=sb4;
          this.sb5=sb5;
    }
    InvalidMarkException(String s)
    {
      super(s);
    }
    
  }

class Student
  {
    public static void main(String args[])
    {
    try{
       InvalidMarkException obj=new InvalidMarkException(443,"vikas",45,34,78,65,89);
if(sb1 <0 || sb1 >100)
{
    throw new InvalidMarkException("Invalid marks") ;
}
       else if(sb2 <0 || sb2 >100)
{
    throw new InvalidMarkException("Invalid marks") ;
}
        else if(sb3 <0 || sb3 >100)
      {
         throw new InvalidMarkException("Invalid marks") ;
      }
      else if(sb4 <0 || sb4 >100)
      {
         throw new InvalidMarkException("Invalid marks") ;
      }
      else if(sb5 <0 || sb5 >100)
      {
         throw new InvalidMarkException("Invalid marks") ;
      }
      else 
      {
        System.out.println( System.out.println("Average is :"+ (sb1+sb2+sb3+sb4+sb5)/5));
      }
    }
      catch(InvalidMarkException e)
      {
        System.out.println("Entered marks are "+e.getMessage());
      }
     
    }
          }
    
      
    
        

      
        

     
     
  

  