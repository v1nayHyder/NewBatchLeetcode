package New_batch_leetcode.daily_challenge;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInString1408 {
    public static void main(String[] args) {

        String[] words={"mass","as","hero","superhero"};
        List<String> list=stringMatching(words);
        System.out.println(list);
    }
    public static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        if (words.length == 1) {
            return list;
        }

        for(int i=0;i<words.length;i++){
            for (int j=0;j<words.length;j++){
                if(i!=j&&words[j].contains(words[i])){
                    list.add(words[i]);
                    break;
                }
            }
        }
        return  list;
    }
}
