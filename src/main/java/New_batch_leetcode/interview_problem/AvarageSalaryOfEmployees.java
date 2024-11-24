package New_batch_leetcode.interview_problem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AvarageSalaryOfEmployees {
    public static void main(String[] args) {
        float employeeSalary[]={1000,8000,15000,2000};
        float avarageSalary=findAvarageSalary(employeeSalary);
        System.out.println(avarageSalary);
    }

    private static float findAvarageSalary(float[] employeeSalary) {


       float avarage=0;
        for (int i = 0; i <employeeSalary.length ; i++) {
            avarage=avarage+employeeSalary[i];
        }
        return avarage/employeeSalary.length;
    }
}
