import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        public class Solution {
            public static void main(String args[] ) throws Exception {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int arr[] = new int[n];
                int a[] = new int[n];
                
                for(int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                } 
                for ( int i=0; i< n; i++){
                    int j;
                    for( j=i+1; j<n; j++){
                        if(arr[i] >= arr[j])
                           break; 
                    }
                     if(j == n)
                        System.out.print(arr[i]+" ");
                
                }
               

            }
        }
