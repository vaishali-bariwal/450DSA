package Arrays.MoveNegElementToLast;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int a[], int n)
    {
        int b[] = a.clone(),i,pos = 0;
        for ( i = 0; i < n; i++) {
            
            if(b[i] > 0)    
                a[pos++] = b[i];
        }
        print(a);
        for (i = 0; i < n; i++) {
            if(b[i] < 0)
                a[pos++] = b[i];
        }
    }
    public static void print(int a[]) {
        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index]+" ");
        }
        System.out.println();
    }
}