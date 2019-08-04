import java.util.Scanner;
class MilesTokm
{
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double km = m /5 * 8;
        System.out.println("Distance in kms :- " + km);      
    }
}