package New_batch_leetcode;

import java.util.HashMap;

public class IsomorphicStr {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if(!hashMap.containsKey(s.charAt(i))){
                if (hashMap.containsValue(t.charAt(i))){
                    return false;
                }
                else
                hashMap.put(s.charAt(i),t.charAt(i));
            }
            else if (hashMap.containsKey(s.charAt(i))) {
                if (hashMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String s="paper";
        String t="title";
        System.out.println(isIsomorphic(s,t));

    }
}
