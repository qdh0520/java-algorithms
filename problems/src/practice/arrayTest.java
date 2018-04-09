package practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/12.
 */
public class arrayTest {

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray);
             int[]  abc=new int[3];

// print directly will print reference value
//        System.out.println(intArray);
// [I@7150bd4d

        System.out.println(intArrayString);
// [1, 2, 3, 4, 5]


        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));//接收一个数组
        boolean b = Arrays.asList(stringArray).contains("a");// 检查数组中是否包含某个元素
        String[] stringArr = new String[arrayList.size()];
        arrayList.toArray(stringArr);
//        for (String s : stringArr)
//            System.out.println(s);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(stringArr[i]);
        }
       int sum=0;
       int k=1;
        for (int i = 0; i <8 ; i++) {
            sum=k*2;
//
            k=sum;
        }
//        System.out.println(sum);

        int a=1;
        int c=0;
        c=a;
         a=2;
        System.out.println(c);
        System.out.println(a);
    }
}
