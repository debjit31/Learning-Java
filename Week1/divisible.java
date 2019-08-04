import java.util.Scanner;
class divisible
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        if(a % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 5");
        
    }
}