import java.util.Scanner;
class fToc
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (f-32) * 5/9 ;
        System.out.println("Temperature in Celsius :- " + c);      
    }
}