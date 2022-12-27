package Arrays.KthMinelement_quicksort;

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] a, int l, int r, int k) 
    { 
        if (k > 0 && k <= r+1 ) {
            
            int kth = partition(a,l,r);
            //System.out.println(kth);
            if(kth == k-1)
             return a[kth];
            else if (kth < k-1)
              return kthSmallest(a,kth+1,r,k);
             else 
              return kthSmallest(a,l,kth - 1,k);
        }
        return Integer.MAX_VALUE;
    } 
    
    public static int partition(int[] a, int l, int r)
    {
        //take first element as pivot 
        int pivot = a[l];
        int i = l+1;//initialize i with index of pivot + 1
        //iterate from index of pivot to right to do pariton of greater and samller elements then pivot
        for(int j = l+1; j <= r; j++){
            
            if(a[j] < pivot){
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
                i++;
               // print(a);
            }
            
        }
        int t = a[l];
        a[l] = a[i-1];
        a[i-1] = t;
        //System.out.println("after partition with pivot "+pivot);
        //print(a);
        return i-1;
    }
    public static void print(int a[]) {
        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index]+" ");
        }
        System.out.println();
    }

}

