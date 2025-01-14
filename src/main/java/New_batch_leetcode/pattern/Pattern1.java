package New_batch_leetcode.pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
