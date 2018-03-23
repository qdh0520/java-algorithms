package practice;
//Java program to find the most frequent element
//in an array
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class GFG1 {

    static int mostFrequent(int arr[], int n)
    {

        // Insert all elements in hash
        Map<Integer, Integer> hp =
                new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }

        // find max frequency.
        int max_count = 0, res = -1;

        for(Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();


            }
        }


        return res;
    }
    public static String FirstChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        //   LinkedHashMap按插入顺序排序 保证第一次出现
        if (s == null || s.isEmpty()) return "#";
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i)) + 1;//count 代表出现的次数
                map.put(s.charAt(i), count);  //map中存在则count值加1
            } else map.put(s.charAt(i), 1);
        }
        for (Character out : map.keySet()) {
            if (map.get(out) == 1)

                return out.toString();
        }
        return "#";
    }

    // Driver code
    public static void main (String[] args) {

        int arr[] = {1, 5, 2, 1, 3, 2, 1};
        int n = arr.length;
        Map<String,Integer> map =new HashMap<>();
        map.put("a",1);

        System.out.println(mostFrequent(arr, n));
    }
}