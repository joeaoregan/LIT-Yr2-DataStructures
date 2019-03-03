/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.*;
import java.util.Random;
/**
 *
 * @author Joe O'Regan
 */
public class RandomNumber {
    //int number;
    //int r=0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        int r=0;
        // TODO code application logic here
        //Random r = new Random();
        number = (int) Math.random() * 5 + 3;
        //number = r;
        System.out.println("test: " + r);
        System.out.println("number: " + number);
        //Random random = new Random();
        Random random = new Random();
        //number = (int) random;
        System.out.println("random: " + random);
        //int x = (int) math.Random();
        double x = Math.random();
        System.out.println("double random: " + x);
        
        int y = (int) x;
        System.out.println("int random: " + y);
        
        
	int N = 5;
        int x2,x3,x4;
        
        for(int i=0;i<10;i++)
        {
            x2 = (int) ((Math.random() * 10) % N);
            System.out.println("int random N: " + x2);
        }
        for(int j=0;j<10;j++)
        {
            x3 = (int) ((Math.random() * 10) % N) +1;  // this one
            System.out.println("int random N + 1: " + x3);
        }
        
        
        for(int k=0;k<10;k++)
        System.out.println("K: " + StdRandom.uniform());
        
        for(int k=0;k<10;k++)
        {
            x4 = (int) ((StdRandom.uniform() * 10) % N) + 1;
            System.out.println("K: " + x4);
        }
    }
    
}
