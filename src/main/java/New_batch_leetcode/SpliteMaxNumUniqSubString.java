package New_batch_leetcode;

import java.util.HashSet;

public class SpliteMaxNumUniqSubString {
    static int maxCount;
    public static int maxUniqueSplit(String s) {
        maxCount=0;
        HashSet<String> hashSet=new HashSet<>();
        backTracking(s,hashSet,0);
        return maxCount;

    }
    public  static void backTracking(String s,HashSet<String> set,int index){
        int n=s.length();
        if (index==n){
            maxCount=Math.max(maxCount,set.size());
            return;
        }
        for (int i = index; i <n ; i++) {
            String sub=s.substring(index,i+1);
            if (!set.contains(sub)){
                set.add(sub);
                backTracking(s,set,i+1);
                set.remove(sub);
            }

        }
    }
    public static void main(String[] args) {
        System.out.println(maxUniqueSplit("aba"));

    }
}
