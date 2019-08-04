import java.util.Scanner;
import java.io.*;
class FloydWarshall
{
    int V = 4;
    public void ShortestPath(int a[][], int V)
    {
        int solution[][] = new int[V][V];
        for(int i = 0;i<V;i++) 
            for(int j = 0;j<V;j++)
                solution[i][j] = a[i][j];
        
        for(int k =0; k< V; k++)
        {
            for(int i=0;i<V;i++)
            {
                for(int j=0;j<V;j++)
                {
                    if(solution[i][k] + solution[k][j] < solution[i][j])
                        solution[i][j] = solution[i][k] + solution[k][j];
                }
            }
        }
        
        for(int i = 0;i<V;i++)
            for(int j = 0;j<V;j++)
                System.out.println(solution);
    }
    
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int graph[][] = new int[][] { {0,   5,  99999, 10}, 
                          {99999, 0,   3, 99999}, 
                          {99999, 99999, 0,   1}, 
                          {99999, 99999, 99999, 0} 
                        }; 
        /*for(int i = 0;i<V;i++)
            for(int j = 0;j<V;j++)
                graph[i][j] = sc.nextInt();*/                
        ShortestPath(graph,V);
    }
}