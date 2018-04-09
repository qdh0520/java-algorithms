package practice;

public class Sort {

    public static void main(String[] args) {
        int[] a= {1,5,4};
        InsertSort(a);
        for (int m :a){
            System.out.println(m);

        }
    }

    public static  void  InsertSort(int[] arr){

        for (int i = 1; i <arr.length ; i++) {
            int cur = arr[i];
            int j;
            // arr[0..i] is sorted
            for ( j = i-1; j >=0 && arr[j]>cur; j--) {
                       arr[j+1]= arr[j];

            }
            // insert the current element into arr[j+1]
               arr[j+1]=cur;





        }


    }

    public static  void SelectSort(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            int min = i;

            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]>arr[min]){

                    min=j;
                }
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }

    }

     public  static void  BubblrSort(int [] arr){

         boolean needNextPass =true;
         for (int k = 1; k < arr.length&&needNextPass; k++) {
             needNextPass= false;
             for (int i = 0; i < arr.length - k; i++) {
                 if(arr[i]>arr[i+1]) {
                     int temp = arr[i];
                     arr[i] = arr[i + 1];
                     arr[i + 1] = temp;

                     needNextPass = true;
                 }
             }
         }
     }

      public static void QuickSort(int[] arr){
        quickSort(arr,0,arr.length-1);


      }
        public static   void quickSort(int [] arr, int low , int high){
            int pivot;
        if(low<high){
              pivot=Partition(arr,low,high);
              quickSort(arr, low,pivot-1);
              quickSort(arr,pivot+1,high);
           }


        }
    public  static  int   Partition(int [] arr, int low, int high){
        int left =low;
        int right =high;
        int pivot =arr[low];
        while (left<high){
            while (arr[left]<=pivot)
                left++;
            while (arr[right]>pivot)
                right++;
            if(left<high){
                int temp =arr[left];
                arr[left] =arr[right];
                arr[right] =temp;

            }



        }

        arr[low]=arr[right];
        arr[right]=pivot;
        return  right;



    }


    public  static  void MergeSort(int [] arr){
        if(arr.length>1){
            int[] firstHalf= new int[arr.length/2];
            System.arraycopy(arr,0,firstHalf,0,arr.length/2);
            MergeSort(firstHalf);
            int secondLengh =arr.length-arr.length/2;
            int[] secondHalf= new int[secondLengh];
            MergeSort(secondHalf);

            merge(firstHalf,secondHalf,arr);
        }




    }
     public  static  void merge(int[] arr1, int[] arr2,int[] temp){

        int flag1 =0;
        int flag2=0;
        int flag3=0;
        while (flag1<arr1.length&&flag2<arr2.length){
            if(arr1[flag1]<=arr2[flag2]){
                temp[flag3++]=arr1[flag1++];
            }else {
                temp[flag3++]=arr2[flag2++];
            }

        }


        while (flag1<arr1.length){
            temp[flag3++]=arr1[flag1];
        }


        while (flag2<arr2.length){
            temp[flag3++]= arr2[flag2];
        }


     }


}
