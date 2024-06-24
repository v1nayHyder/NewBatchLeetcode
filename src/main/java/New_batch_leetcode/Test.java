package New_batch_leetcode;


import java.util.*;

public class Test {
    public  static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> mainList=new ArrayList<>();
        String strs2[]=new String[strs.length];
        for (int i = 0; i <strs.length ; i++) {
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            strs2[i]=new String(ch);
        }
        for (int i = 0; i <strs2.length ; i++) {
            if (!strs2[i].equals("taken")) {
                List<String> child=new ArrayList<>();
                child.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs2[i].length()==strs2[j].length()&&strs2[i].equals(strs2[j])){
                        child.add(strs[j]);
                        strs2[j]="taken";
                    }

                }
                System.out.println(Arrays.toString(strs2));

                mainList.add(child);
            }

        }
        System.out.println(Arrays.toString(strs2));
        System.out.println(mainList);
return mainList;
    }
    public static void main(String[] args) {
    List list=groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

}