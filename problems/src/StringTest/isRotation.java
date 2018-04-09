package StringTest;

public class isRotation {
    public static boolean isRotation(String a, String b){
        if(a==null||b==null ||a.length() !=b.length()){
            return  false;
        }
        String b2 =b+b ;
        return  KMP.getIndexOf(b2,a) != -1;
    }



    public static void main(String[] args) {
        String a = "abcd";
        String b = "bcda";
      boolean abc = isRotation(a,b);
        System.out.println(abc);
    }
}
