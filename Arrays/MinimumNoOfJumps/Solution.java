package Arrays.MinimumNoOfJumps;

import java.lang.*;
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String) br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
    }

}

// } Driver Code Ends
//1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9
//1, 4, 3, 2, 6, 7
class Solution {
    static int minJumps(int[]a) {

        int n = a.length;
        if(n <= 1)
            return 0;
        if(a[0] == 0)
            return -1;
        
        int jump = 1, maxrange = a[0], steps = a[0];
        
        for (int i = 1; i < n; i++) {
            if (i == n - 1) 
                return jump;
            maxrange = Math.max(maxrange, i+a[i]);
            steps--;
            if (steps == 0) {
                jump++;
                //System.out.println(steps+" "+jump+" "+maxrange);
                if(i>=maxrange)
                   return -1;
                steps = maxrange - i;
            } 
        }
        return jump;
        // your code here
    }
}