import java.util.Scanner;
class MaximumThree
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b)
        {
            if(b > c)
                System.out.println("Maximum is " + a);
            else if(b<c && a>c)  
                System.out.println("Maximum is " + a);
            else
                System.out.println("Maximum is " + c);
        }
        else
        {
            if(b<c)
                System.out.println("Maximum is " + c);
            else if(b>c && a<b)
                System.out.println("Maximu is " + b);
            else 
                System.out.println("Maximum is " + a);
        }
    }
}
