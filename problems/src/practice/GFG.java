package practice;

import java.util.*;

class GFG {

    static int mostFrequent(int arr[], int n)
    {

        // Sort the array
        Arrays.sort(arr);

        // find the max frequency using linear
        // traversal
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
//        if (max_count > arr[n-1])
//        {
//            max_count = curr_count;
//            res = arr[n - 1];
//        }

        return res;
    }

    static  void removeDupliclate(char[] str, int len){

          if(str==null) return;
          if(len<2) return;
          int tail =1;
        int j;
        for (int i = 0; i < len; i++) {
            for (j = 0; j <tail ; j++) {  // this loop is repeat number
                if (str[i]==str[j]) break;
                }
            if (j == tail) { // first appear
                str[tail]=str[i];
                ++tail;

            }
        }
        str[tail] =0;

        }
    // Driver program
    public static void main (String[] args) {
       String abc ="1617777uau373bb";
       char arr[] = abc.toCharArray();
        int n = arr.length;
          removeDupliclate(arr,n);
//        System.out.println(mostFrequent(arr,n));
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        Scanner in =new Scanner(System.in);
         in.next();


    }
}