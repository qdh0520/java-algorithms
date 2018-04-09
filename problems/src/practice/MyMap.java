package practice;

import java.util.*;
import java.util.Queue;
import java.util.Stack;

public class MyMap {

    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();

//        HashMap<String,String> hashMap = new HashMap<>();
//        Iterator<String> it =hashMap.keySet().iterator();
            set.add(1);
            set.add(1);
            set.add(2);
        Iterator<Integer> a= set.iterator();
//        while (a.hasNext()){
//            int b= a.next();
//            System.out.println(b);
//
//        }
//        System.out.println("i am here");
//
       Scanner in = new Scanner(System.in);


        int j=1;
        int b ;
        for(int i=0;i<3;i++) {
            j = j++;
//            b=++j;

            System.out.println(j);
//            System.out.println(b);}
        }
        
        
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int qdh:map.keySet()){

            System.out.println(qdh);
            map.get(qdh);
        }

  
       Iterator<Integer> it =map.keySet().iterator();
         Iterator<java.util.Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
          Map.Entry<Integer,Integer> entry =iterator.next();
          while (iterator.hasNext()){

          }
          entry.getKey() ;
          entry.getValue();
          
          
          ArrayList<Integer> abc =new ArrayList<>();
          abc.add(1);
          abc.add(2);

        Stack<Integer> stack =new Stack<>();
        Queue<Integer> queue =new LinkedList<>();
        for (int i = 0; i < queue.size(); i++) {
            
        }


    }









}
