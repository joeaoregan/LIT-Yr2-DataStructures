/**
 *
 * @author Joe O'Regan
 * K00203642
 */
public class PercolationStats {
  private double [] arrPercThreshold;                                           // Array to hold fraction (percentage) of sites open
  int numberOfTimes,gridsize,sites_opened;

    // Perform T independent computational experiments on an N-by-N grid
    public PercolationStats(int N, int T){
        // The constructor should throw a java.lang.IllegalArgumentException if either N = 0 or T = 0.
        //if(N<=0 || T<=0) java.lang.illegalArgumentException                   // Haven't a notion how that would work (java.lang.illegalArgumentException)
        gridsize = N;
        numberOfTimes = T;
        //Percolation P1 = new Percolation(gridsize);
        arrPercThreshold = new double [numberOfTimes];

        for(int i = 0; i < numberOfTimes; i++){
            Percolation P1 = new Percolation(gridsize);
            sites_opened = 0;                                                   // Set / reset number of open sites to 0

            while(P1.percolates() == false){                                    // Do until the system percolates
                // Choose a site (row i, column j) uniformly at random among all blocked sites.
                int row = StdRandom.uniform(gridsize) + 1;                      // Random row
                int column = StdRandom.uniform(gridsize) + 1;                   // Random column
                // Open the site (row i, column j).
                if(P1.isOpen(row, column) == false){
                  P1.open(row, column);                                         // Open the random blocked site
                  sites_opened++;                                               // Increment the number of sites opened
                } // end if
            } // end while

          // The fraction of sites that are opened when the system percolates provides an estimate of the percolation threshold.
          arrPercThreshold[i] = (double) sites_opened / (gridsize * gridsize);  // add percentage to array to get mean / standard deviation
        } // end for
    }

    // Sample mean of percolation threshold
    public double mean(){
        double mean = StdStats.mean(arrPercThreshold);                          // mean
        return mean;
    }

    // Sample standard deviation of percolation threshold
    public double stddev(){
        double standarddeviation = StdStats.stddev(arrPercThreshold);           // standard deviation
        return standarddeviation;
    }

    // Returns lower bound of the 95% confidence interval
    public double confidenceLo(){
        double cLo = mean()-((1.96 * stddev()) / Math.sqrt(numberOfTimes));     // mean MINUS 1.96 times the standard deviation over the square root of T (number of times repeated)
        return cLo;
    }

    // Returns upper bound of the 95% confidence interval
    public double confidenceHi(){
        double cHi = mean()+((1.96 * stddev()) / Math.sqrt(numberOfTimes));     // mean PLUS 1.96 times the standard deviation over the square root of T (number of times repeated)
        return cHi;
    }

    // Test client
    public static void main(String[] args){

                if (args.length != 2){
			System.out.println( "Usage: java PercolationStats <N> <T> \n");
			System.out.println( "where N is the size of the grid to use");
			System.out.println( "and T is the number of experiments to run");
			System.exit(1);
		}
		int N = Integer.parseInt( args[0]);
		int T = Integer.parseInt( args[1]);

		PercolationStats ps = new PercolationStats( N, T);
		//PercolationStats ps = new PercolationStats( 200, 100);
        //PercolationStats ps = new PercolationStats(20,20);

		System.out.println( "Mean: " + ps.mean());
		System.out.println( "Std Dev: " + ps.stddev());
		System.out.println(	"95% confidence interval: " + ps.confidenceLo() + ", " + ps.confidenceHi());
	}
}