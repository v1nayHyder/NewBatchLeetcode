package New_batch_leetcode;

public class ReverseStringRecurson {
;
    public static String reverse(String s,String result){

        if (s.isEmpty()){
            return  result;
        }
        result=result+s.charAt(s.length()-1);
      return  reverse(s.substring(0,s.length()-1),result);

//        if (s.length()==0)
//            return s;
//
//        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }
    public static void main(String[] args) {
        String str="Vinay";
        String result="";
        System.out.println(reverse(str,result));
    }
}
