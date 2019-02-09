/**
 *
 * @author Joe O'Regan
 * K00203642
 */
public class Percolation {
    private boolean[] grid;
    private int grid_size,full_top_site,full_bottom_site;
    WeightedQuickUnionUF uf;

    public Percolation(int N){
        grid_size=N;
        full_top_site = 0;
        full_bottom_site = grid_size * grid_size + 1;
        uf = new WeightedQuickUnionUF(grid_size*grid_size + 2);                 // 2 extra for full top and bottom
        grid = new boolean[grid_size*grid_size + 2];
        for(int i=1;i<=grid_size*grid_size;i++) grid[i]=false;                  // Initialize all sites to be blocked.
        grid[0]=true;                                                           // Full top site (open)
        grid[grid_size*grid_size+1]=true;                                       // Full bottom site (open)
    }
    // open site (row i, column j) if it is not already
    public void open(int i, int j){
		//Throw a java.lang.IndexOutOfBoundsException if either i or j is outside this range.
        //if( i < 1 || i > grid_size || j < 1 || j > grid_size) java.lang.IndexOutOfBoundsException // Don't know how java.lang.IndexOutOfBoundsException works
        if(isOpen(i,j) == false)                                                // If the site isn't already open
        {
            int site_above = convert2Dto1D(i-1,j);
            int site_below = convert2Dto1D(i+1,j);
            int site_left = convert2Dto1D(i,j-1);
            int site_right = convert2Dto1D(i,j+1);
            int current_site = convert2Dto1D(i,j);                              // Convert this site from 2D to 1D

            grid[current_site] = true;                                          // If it wasn't open, open the site

            // check top, bottom, left, right
            if (i==1) uf.union(current_site,full_top_site);                     // If site is in the first row (full)
            else if(i > 1){                                                     // Else if site is not in first row
                if(isOpen(i-1,j) )uf.union(current_site,site_above);            // If the site above is open too join them
            }
            if (i == grid_size) uf.union(current_site,full_bottom_site);        // if site in last row (full)
            else if(i < grid_size){                                             // if site is not in last row
                if(isOpen(i+1,j)) uf.union(current_site,site_below);            // if the site below is open too join them
            }
            if(j > 1 && isOpen(i,j-1)) uf.union(current_site,site_left);        // if not the 1st site of a row
            if(j < grid_size && isOpen(i,j+1)) uf.union(current_site,site_right);// if not the last site of a row
        }
    }

    public boolean isOpen(int i, int j){
        return grid[convert2Dto1D(i,j)];                                        // boolean: true if open, false if closed
    }

    public boolean isFull(int i, int j){
        int site_to_check = convert2Dto1D(i,j);                                 // Convert site from 2D to 1D
        boolean site_is_full = uf.connected(full_top_site,site_to_check);       // if the site is connected to a full top site, it is full too
        return site_is_full;
    }

    public boolean percolates(){
        boolean sys_percolated = uf.connected(full_top_site,full_bottom_site);  // System is percolates if a site in the bottom row is full, and is connected to a site in top row that is also full
        return sys_percolated;
    }

    private int convert2Dto1D(int i, int j){
        int converted_to_1D = (grid_size*(i-1)) + j;                            // Convert to grid postition
        return converted_to_1D;
    }
}
