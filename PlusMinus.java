package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class PlusMinus {

    static void plusMinus(int[] arr) {
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        for(int i = 0;i<arr.length;i++){ 
            if(arr[i] >0) {
                q1++;
            }else if(arr[i] == 0){
                q2++;
            }else {
                q3++;
                } 
        }
        float k1 = (float)q1/arr.length;
        float k2 = (float)q3/arr.length;
        float k3 = (float)q2/arr.length;
        System.out.printf("%.6f %n",k1);
        System.out.printf("%.6f %n",k2);
        System.out.printf("%.6f %n",k3);
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            plusMinus(arr);

            scanner.close();
        }
}

