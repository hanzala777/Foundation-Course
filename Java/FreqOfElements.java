import java.util.HashMap;

public class FreqOfElements {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = {8,9,9,9,9,9,4,4,4,4,4,7};
        for (int j : arr) {
//            if (hm.containsKey(j)) hm.put(j, hm.get(j) + 1);
//            else hm.put(j, 1);
            // OR
            hm.put(j,hm.getOrDefault(j,0)+1);
        }
        System.out.println(hm);
    }
}
