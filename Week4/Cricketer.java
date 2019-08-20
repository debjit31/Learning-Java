import java.io.*;
import java.util.Scanner;
class Cricketer
{
    private int age;
    private int runsScored;
    private int matchesPlayed;
    public Cricketer(int age, int runsScored, int matchesPlayed)
    {
        this.age = age;
        this.runsScored = runsScored;
        this.matchesPlayed = matchesPlayed;
    }
    public void print()
    {
        System.out.println(age + runsScored + matchesPlayed);
    }
}

class Bowler extends Cricketer
{
    private double economy;
    private int numberofWickets;
    public Bowler(int age, int runsScored, int matchesPlayed, double economy, int numberofWickets)
    {
        super(age, runsScored, matchesPlayed);
        this.economy = economy;
        this.numberofWickets = numberofWickets;
    }
    
    public void print1()
    {
        print();
        System.out.println(economy+numberofWickets);
    }
}

class Driver
{
    public void main(String[] args)
    {
           Scanner sc  = new Scanner(System.in);
           int age = sc.nextInt();
           int runs = sc.nextInt();
           int matches = sc.nextInt();
           double eco = sc.nextDouble();
           int wickets = sc.nextInt();
           Bowler b = new Bowler(age, runs, matches, eco, wickets);
           b.print1();
    }
}



