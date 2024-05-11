package New_batch_leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
            return "";
        String newString=strs[0];
        StringBuilder stringBuilder=new StringBuilder();
        label1:
        for (int i = 0; i <newString.length() ; i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (i>=strs[j].length()||strs[j].charAt(i) != newString.charAt(i)) {
                        break label1;

                    }
                }
//            System.out.println(newString.charAt(i));
                stringBuilder.append(newString.charAt(i));
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ab","a"} ));
    }
}
