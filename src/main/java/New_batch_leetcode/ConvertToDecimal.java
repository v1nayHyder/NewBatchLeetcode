package New_batch_leetcode;

public class ConvertToDecimal {
    private static int convertToDecimal(String str){
    int num=0,power=0;
    int length=str.length()-1;
    for (int i=length;i>=0;i--){
      if (str.charAt(i)=='1'){
            num+=(int)Math.pow(2,power) ;
        }
        power++;
    }
  return num;
    }
    public static void main(String[] args) {
        System.out.println(convertToDecimal("1010"));
    }
}
