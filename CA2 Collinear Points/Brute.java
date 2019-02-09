/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joe O'Regan
 * K00203642
 */
public class Brute {

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
        
        // N^4 - 4 nested for loops
        for (int p = 0; p < N; p++)
            for (int q = p + 1; q < N; q++)
                for (int r = q + 1; r < N; r++)
                    if (arrPoints[p].slopeTo(arrPoints[q]) == arrPoints[p].slopeTo(arrPoints[r])) // works faster when slope check separated from 4th for loop
                    for (int s = r + 1; s < N; s++)
                        if (arrPoints[p].slopeTo(arrPoints[q]) == arrPoints[p].slopeTo(arrPoints[s])) 
                        {
                            StdOut.println(arrPoints[p].toString()+" -> "+arrPoints[q].toString()+" -> "+arrPoints[r].toString()+" -> "+arrPoints[s].toString());
                            arrPoints[p].drawTo(arrPoints[s]); // Draw each line segment discovered
                        }
        
        // display to screen all at once
        StdDraw.show(0);
    }
    
}
