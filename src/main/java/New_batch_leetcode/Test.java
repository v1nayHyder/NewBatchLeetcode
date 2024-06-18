package New_batch_leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        String s="AmaAaRRurRpRXTXXTXX";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
          if (Character.isUpperCase(s.charAt(i))){
              hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
          }
        }
        for (char val:hashMap.keySet()){
            if (hashMap.get(val)%2==0){
                System.out.print(val+" ");
            }
        }
    }
}