package com.FindingMaxiumElementInMartix;

public class FindingMaxiumElementInMartix {
	 // Method 1
    // To find the maximum element
    static int max(int mat[][])
    {
        // Declaring and initializing variable to unity
        // holding the maximum element value
        int max = 0;
 
        // Iterating over matrix
        // using nested for loops
 
        // Outer loop for rows
        for (int i = 0; i < mat.length; ++i) {
 
            // Inner loop for columns
            for (int j = 0; j < mat[0].length; ++j) {
 
                // Storing the maximum element
                max = Math.max(mat[i][j], max);
            }
        }
 
        // Return the maximum element
        return max;
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input 2D matrix
        int mat[][] = { { 1, 3, 4, 19 },
                        { 11, 10, 12, 1 },
                        { 7, 9, 0, 100} };
 
        // Calling the method 1 to get max element
        // and storing that integer element
        int max_element = max(mat);
 
        // Printing the maximum element
        System.out.println(max_element);
    }
}