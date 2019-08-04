import java.util.Scanner;
class cTof
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int f = (c * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit :- " + f);      
    }
}