import java.util.Scanner;
class Fibonacci
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c, n;
        n = sc.nextInt();
        System.out.print(a+", "+b);
        for(int i=2;i<n;i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(", "+c);
        }   
    }
}