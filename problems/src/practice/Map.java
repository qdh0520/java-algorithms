package practice;

import java.util.*;

public class Map {

    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();

//        HashMap<String,String> hashMap = new HashMap<>();
//        Iterator<String> it =hashMap.keySet().iterator();
            set.add(1);
            set.add(1);
            set.add(2);
        Iterator<Integer> a= set.iterator();
        while (a.hasNext()){
            int b= a.next();
            System.out.println(b);

        }
        System.out.println("i am here");

       Scanner in = new Scanner(System.in);



    }









}
