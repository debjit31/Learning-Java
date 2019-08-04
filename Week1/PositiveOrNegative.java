import java.util.Scanner;
class PositiveOrNegative
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = (a > 0) ? "Positive" : "Negative";
        System.out.println(s);
    }
}
