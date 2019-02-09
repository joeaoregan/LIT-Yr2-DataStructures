
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k00203642
 * Joe O'Regan
 */
public class Fast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // rescale coordinates and turn on animation mode
        StdDraw.setXscale(0, 32768); // min coordinate 0, max 32768 (creates a window of a this size)
        StdDraw.setYscale(0, 32768);
        //StdDraw.show(0); // looks cooler opening with this commented out (works fine either way)

        // read in the input
        //String filename = args[0];
        //String filename = "input50.txt"; // Name of file to be read    
        String filename = "input400.txt";
        In in = new In(filename);
        int N = in.readInt(); // N = number of points (First line in each input*.txt file)
        
        Point[] arrPoints = new Point[N]; // read all points into array
        
        for (int i = 0; i < N; i++) {
            int x = in.readInt(); // read x coordinate from file
            int y = in.readInt(); // read y coordinate from file
            //Point p = new Point(x, y);
            //arrPoints[i] = p; // add each point to the array
            arrPoints[i] = new Point(x,y);
            arrPoints[i].draw(); // draws each point in the input file
        }
        
        Arrays.sort(arrPoints); // sort the array
        
        Point[] arrCopy = new Point[N-1]; // copy of array without origin point, to hold sorted slopes of origin
        
        
        for(int i = 0; i < N; i++) // for every point (as origin) check how many points are collinear to it
        {
            int k = 0;
            for(int j=i;j<N;j++)
                if(j!=i) // copy all points except the origin point to a new array
                {
                    arrCopy[k] = arrPoints[j];  // copy all points except i to copy array 
                    k++;                        // increment j
                    
                    // sort copied array by slope -- no idea
                    // find 3 or more points with same slope from origin
                                       
                    // if 3 or more points found, draw them
                    
                    
                    
                }
        }
        
        // display to screen all at once
        StdDraw.show(0);
    }
    
}
