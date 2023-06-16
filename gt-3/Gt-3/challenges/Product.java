/*Write the Java program that implements the above requirements, including input validation and displaying the product data.

Example Input and Output:
Sample Input:
Enter data for product 1:
Product ID: P001
Product Name: Laptop
Price: 1500.0
Category: Electronics
Quantity in Stock: 10

Enter data for product 2:
Product ID: P002
Product Name: T-Shirt
Price: -34.4
Category: Clothing
Quantity in Stock: 50

Output:
Product ID: P001
Product Name: Laptop
Price: 1500.0
Category: Electronics
Quantity in Stock: 10

Product ID: P002
Product Name: T-Shirt
InvalidPriceException : Invalid price format, please enter a positive value
Category: Clothing
Quantity in Stock: 50*/
import java.util.Scanner;
class Products
  {
    int id;
    String name;
    String price;
    String category;
    int quantity;
     public void  Products(int id,String name,String price,String category,int quantity) 
    {
      this.id=id;
      this.name=name;
      this.price=price;
      this.category=category;
      this.quantity=quantity;
    }
    public void description()
    {
      System.out.println("Product id is :"+id);
       System.out.println("Product name is :"+name);
       System.out.println("Product price is :"+price);
       System.out.println("Product category is :"+category);
       System.out.println("Product quantity available is :"+quantity);
     }
  }
    class Product
      {
    public static void main(String args[])
        {
         
          Products obj=new Products(5245,"Laptop","$450","Electronics",26);
          obj.description();
          Products obj2=new Products(7859,"Shirts","$23","Clothing",3);
          obj2.description();
            
          
        }
  }
