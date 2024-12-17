package New_batch_leetcode.daily_challenge;

public class MaximumAveragePassRatio1792 {
    public static double maxAverageRatio(int[][] classes, int extraStudents) {

     double averageRatio=0.0;
     classes[0][0]=classes[0][0]+extraStudents;
     classes[0][1]=classes[0][1]+extraStudents;
     for (int[] students : classes){
         averageRatio+= (double) students[0] /students[1];
     }
     return averageRatio/classes.length;
    }
    public static void main(String[] args) {
        System.out.println(maxAverageRatio(new int[][]{{1,2},{3,5},{2,2}},2));
    }
}
