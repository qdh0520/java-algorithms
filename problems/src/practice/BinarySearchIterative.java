package practice;

public class BinarySearchIterative {



    public int BS(int[] arr,int data){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid =(high+low)/2;
            if(arr[mid]==data) return mid;
            else if(arr[mid]>data) high=mid+1 ;
            else  low=mid+1;
        }
        return -1;
    }




}
