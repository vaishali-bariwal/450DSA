//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

 class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] a, int n, int k) {
        
        Arrays.sort(a);
        int min = a[0] , max = a[n-1];
        int ans = max - min;
        for (int i = 1; i < n; i++) {
            
            if(a[i] - k < 0)
                continue;
            min = Math.min(a[0]+k, a[i]-k);
            max = Math.max(a[n-1]-k,a[i-1]+k);
            ans = Math.min(ans , max - min);
        }
        return ans;
    }
}
