import java.io.*;
import java.util.Scanner;
class Employee
{
    //Scanner sc = new Scanner(System.in);
    private int emp_id;
    private String emp_name;
    private float basic_sal;
    Employee(int eid,String ename,float bs)
    {
        this.emp_id = eid;
        this.emp_name = ename;
        this.basic_sal = bs;
    }
    public void display(float ca, float hra ,float sa, float ea, float ma)
    {
        float gs = this.basic_sal + ca + hra + sa + ea + ma;
        System.out.println("Gross Salary = " + gs);
    }
}
class Driver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EID :- ");
        int eid = sc.nextInt();
        System.out.println("Enter EMPLOYEE NAME :- ");
        String ename = sc.next();
        System.out.println("ENTER BASIC SALARY :- ");
        float bs = sc.nextFloat();
        System.out.println("Enter Conveyance Allowance :- ");
        float ca = sc.nextFloat();
        System.out.println("Enter House Rent Allowance :- ");
        float hra = sc.nextFloat();
        System.out.println("Enter Special Allowwance :- ");
        float sa = sc.nextFloat();
        System.out.println("Enter Educational Allowance :- ");
        float ea = sc.nextFloat();
        System.out.println("Enter Medical Allowance :- ");
        float ma = sc.nextFloat();
        Employee e = new Employee(eid, ename, bs);
        e.display(ca,hra,sa,ea,ma);        
    }
}
