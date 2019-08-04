import java.util.Scanner;
class Grading
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int perc  = sc.nextInt();
        if(perc >= 90)
            System.out.println("Grade A");
        else if(perc >= 80)
            System.out.println("Grade B");
        else if(perc >= 70)
            System.out.println("Grade C");
        else if(perc >= 60)
            System.out.println("Grade D");
        else if(perc >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
            
    }
}