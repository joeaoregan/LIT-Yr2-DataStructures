/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe
 */
public class TestArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int N=2;
        //int i=3;        // width
        //int j=3;        // height
            
           //int[3] grid = {1,2,3};
           String[] blah = {"1","2","3"};
           
           /*
            for(int k=0; k<N;k++)
            {
                for (int l=0;l<N;l++)
                {
                    grid[k][l]=1;
                }
            }
            */
           
        /*
        // set every element in the array to x (0) + 1   
        int M = 10;
        int N = 3;
        int x = 0;
        
        int[][] a = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                x++;
                a[i][j] = x;
                
                System.out.println(a[i][j]);
            }
        }
        */
        // boolean array
        int O=3; 
        int P=3;
        
        boolean[][] testBoolean = new boolean[O][P];
        
        for (int i = 0; i < O; i++) 
        {            
            for (int j = 0; j < P; j++) 
            {
                testBoolean[i][j] = true; 
                
                testBoolean[0][0] = false;
                testBoolean[1][2] = false;
                testBoolean[2][2] = false;                
                               
                System.out.println(testBoolean[i][j]);
            }
        }
    }
}
 
