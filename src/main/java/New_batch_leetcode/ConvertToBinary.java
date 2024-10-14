package New_batch_leetcode;

public class ConvertToBinary {
    public static StringBuilder convertToBinary(int n){
       StringBuilder s=new StringBuilder();

        while (n!=1){
            if (n%2==1){
               s.append(1);
            }
            else {
                s.append(0);
            }
            n/=2;
        }
        s.append(1);
        return s.reverse();

    }

    public static void main(String[] args) {
        System.out.println(convertToBinary(32));
    }
}
