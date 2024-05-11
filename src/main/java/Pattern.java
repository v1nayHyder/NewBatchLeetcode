public class Pattern {
    public static void pattern1(int pattern1){
        for (int i = 1; i <=pattern1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static  void pattern2(int pattern2){
        for (int i = 1; i <=pattern2 ; i++) {
            for (int k = pattern2-i; k >=0 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int pattern3){
        System.out.println("Partition line ************************************");
        for (int i = 1; i <=pattern3 ; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");

            }
            for (int j =pattern3; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern4(int pattern4){
        for (int i =1;i<=pattern4; i++) {
            for (int j = pattern4; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int pattern5){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 1; i <=5; i++) {
                if (i==2||i==3||i==4)
                    System.out.println("|   |");
               else
                    System.out.println("=====");

        }

    }
    static void pattern6(int pattern6){
        for (int i = 1; i <pattern6 ; i++) {
            for (int j = 1; j <pattern6-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("&");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print("&");
            }
            System.out.println();
        }
        for (int i = 1; i <=pattern6-1 ; i++) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(" ");

            }
            for (int j =pattern6-i ; j >=1; j--) {
                System.out.print("&");
            }
            for (int j =pattern6-i-2 ; j >1; j--) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(6);
    }
}
