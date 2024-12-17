package New_batch_leetcode.daily_challenge;

import java.util.HashMap;
import java.util.Map;

public class FindLonSplSubStringThatOccursThrice2981 {
    public static int maximumLength(String s) {
      Map<String,Integer> map=new HashMap<>();
        int start=0;
        int end=0;
        while (end<s.length()){

            map.put(s.substring(start,end+1),map.getOrDefault(s.substring(start,end+1),0)+1);
            if(end==s.length()-1){
                start=start+1;
                end=start;
            }
            else {
                end++;
            }

        }
        int max=-1;
        for(String val:map.keySet()){
            if(map.get(val)>=3){
                max=Math.max(max,val.length());

            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximumLength("aaaa"));
        
    }
}
