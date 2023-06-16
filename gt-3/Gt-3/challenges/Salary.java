/*You are building a payroll system for a company that has two types of employees: salaried employees and hourly employees. The payroll system needs to calculate the monthly salary for each employee based on their specific type and hours worked. Additionally, the system should demonstrate polymorphism by calculating the monthly salary for different types of employees.
Sample Input:
For Salary Base Employee
Enter Employee Name: John Doe
Enter Employee Id : 1001, 
Enter Employee Salary: 5000.0

For hourly Based Employee
Enter Employee Name: Jane Smith
Enter Employee Id : 1002
Enter Employee Salary: 5000.0
Enter Hourly Rate:  200.0
Enter hoursWorked : 150.0
Sample Output:
Employee Name: John Doe
Employee ID: 1001
Monthly Salary:  5000.0
Employee Name: Jane Smith
Employee ID: 1002
Monthly  Salary: 30000.0*/

class SalaryEmployee
  {
    String name;
    int id;
    float salary;
    float hourlyrate;
    float hoursworked;
     void SalaryEmployee(String name,int id,float salary)
    {
      this.name=name;
      this.id=id;
      this.salary=salary;
    }
     void SalaryEmployee(String name,int id1,float salary, float hourlyrate,float hoursworked)
    {
      this.name=name;
      this.id=id;
      this.salary=salary;
      this.hourlyrate=hourlyrate;
      this.hoursworked=hoursworked;
    }
      public  void details()
    {
      system.out.println("Employee name is"+name);
      system.out.println("Employee id is"+id);
       system.out.println("Employee salary is"+salary);
      system.out.println("Employee hourlyrate is"+hourlyrate);
      system.out.println("Employee hoursworked is"+hoursworked);
    }
      }
    class Salary
      {
        public static void main(String args[])
        {
          SalaryEmployee obj1=new SalaryEmployee("vikas",443,45000.0f);
            obj1.details();
             SalaryEmployee obj2=new SalaryEmployee("pavan",441,56000.0f,300.0f,150.0f);
            obj2.details();
        }
      }
  