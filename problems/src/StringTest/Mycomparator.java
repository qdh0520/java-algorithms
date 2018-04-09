package StringTest;


import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Mycomparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
           return  (a+b).compareTo(b+a);
    }
   //find  dictionary lowest
   public String lowestString(String[] strs){

        if(strs==null || strs.length==0){
            return   "";
        }
        Arrays.sort(strs,new Mycomparator());
        String  res="";
       for (int i = 0; i < strs.length; i++) {
           res+=strs[i];
       }
        return res;
       }



}
