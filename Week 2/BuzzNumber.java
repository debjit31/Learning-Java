import java.util.Scanner;
class BuzzNumber
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s;
        int n = Integer.parseInt(s1);
        if(s.charAt(s.length()-1) == '7' || n % 7 == 0)
            System.out.println("BuzzNumber");
        else
            System.out.println("Not a BuzzNumber");
    }
}
