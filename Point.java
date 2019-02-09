/*************************************************************************
 * Name: Joe O'Regan
 * Email: K00203642@student.lit.ie
 *
 * Compilation:  javac Point.java
 * Execution:
 * Dependencies: StdDraw.java
 *
 * Description: An immutable data type for points in the plane.
 *
 *************************************************************************/

import java.util.Comparator;

public class Point implements Comparable<Point> {
    public final Comparator<Point> SLOPE_ORDER;
    private final int x;                                // x coordinate
    private final int y;                                // y coordinate

    // create the point (x, y)
    public Point(int x, int y) {
        this.SLOPE_ORDER = (Point x1y1, Point x2y2) -> {        // lamda expression instead of anonymous inner class (netbeans did this)
            if (slopeTo(x1y1) == slopeTo(x2y2)) return 0;       // Slope is equal
            else if (slopeTo(x1y1) < slopeTo(x2y2)) return -1;  // Slope is less than
            else return 1;                                      // Slope is greater than
        };
        /* DO NOT MODIFY */
        this.x = x;
        this.y = y;
    }

    
    // plot this point to standard drawing
    public void draw() {
        /* DO NOT MODIFY */
        StdDraw.point(x, y);
    }

    // draw line between this point and that point to standard drawing
    public void drawTo(Point that) {
        /* DO NOT MODIFY */
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // slope between this point and that point
    public double slopeTo(Point that) {
        double slope;
        if (this.x == that.x && this.y == that.y) slope = Double.NEGATIVE_INFINITY;
        else if (this.x == that.x) slope = Double.POSITIVE_INFINITY;
        else if (this.y == that.y) slope = +0.0;
        //else slope = (that.y - this.y) / (that.x - this.x); // draws lines everywhere
        else slope = (double) (that.y - this.y) / (that.x - this.x); // need to cast to double
        return slope;       
    }
    
    // is this point lexicographically smaller than that one?
    // comparing y-coordinates and breaking ties by x-coordinates
    /* What it means for 1 point to be bigger than another point */
    /* x and y coordinate */
    public int compareTo(Point that) {
        if (this.y == that.y && this.x == that.x) return 0; // equal
        else if (this.y > that.y) return 1;                 // greater than
        else if (this.y < that.y) return -1;                // less than
        else if (this.y == that.y && x < that.x) return -1; // less than
        else return 1;                                      // greater than
    }

    // return string representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // unit test
    public static void main(String[] args) {
        /* YOUR CODE HERE */
        Point p = new Point(0,0);
        Point q = new Point(5,0);
        Point r = new Point(0,6);
        Point s = new Point(1,3);
        Point t = new Point(1,0);
        Point u = new Point(2,3);
        
        StdOut.println("slopeTo:");
        StdOut.println(p.slopeTo(q));
        StdOut.println(p.slopeTo(r));
        StdOut.println(p.slopeTo(s));
        StdOut.println(t.slopeTo(u)); // parallel to p->s
        
        StdOut.println("compareTo:");
        StdOut.println(p.compareTo(q)); // y equal, x less
        StdOut.println(r.compareTo(r)); // same
        StdOut.println(r.compareTo(s)); // greater
        StdOut.println(p.compareTo(r)); // y less
    }
}
