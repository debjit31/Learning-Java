import java.util.Scanner;
class VoteCounter
{
    public void main(String[] args)
    {
        int count[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to cast a vote ??");
        char c = sc.next().charAt(0);
        while(c == 'y' || c == 'Y')
        {
            System.out.println("Enter your vote:- ");
            int vote = sc.nextInt();
            if(vote>=1 && vote <= 5)
                count[vote]++;
            else
                count[0]++;
            System.out.println("Do you want to enter again ??");
            c = sc.next().charAt(0);
        }
        System.out.println("The Final  votes are :- ");
        for(int i = 1; i<=5; i++)
            System.out.println(count[i]);
        System.out.println("No. of spoilt votes are :- " + count[0]);
    }
} 