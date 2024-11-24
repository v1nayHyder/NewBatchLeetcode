package New_batch_leetcode.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        int evenNums[]={1,2,3,4};
        int result[]=filterMap(evenNums);
        filterMap2(evenNums);
        String words[]={"ram","Syam","DhanSyam"};
       List<Integer> stringLength=  mapFuntcion1(words);
        System.out.println(stringLength);
        List<Integer> squares=squareFunction(evenNums);
        System.out.println(squares);
        System.out.println(Arrays.toString(result));
        int squares2[]=squareFunction2(evenNums);
        System.out.println(Arrays.toString(squares2));
        int normalArray[]=arrayFun(evenNums);
        System.out.println(Arrays.toString(normalArray));
        int streamArray[]=streamFun(evenNums);
        System.out.println(Arrays.toString(streamArray));
        List<Integer> nums=Arrays.asList(3,4,6,7,8);
        List<Integer> list=streamFun2(nums);
        System.out.println(list);
        Map<String,Integer> students=new HashMap<>();
        students.put("Vinay",79);
        students.put("Hari Yadav",99);
        students.put("Prem",87);
        students.put("Navya",29);
        students.put("Kavita",59);
        List<String> firstGrade=studentToGrade(students);
        System.out.println(firstGrade);
    }

    private static List<String> studentToGrade(Map<String, Integer> students) {

      return   students.entrySet().stream().filter(entry->entry.getValue()>80).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    private static List<Integer> streamFun2(List<Integer> evenNums) {
        return evenNums.parallelStream()
                .map(num -> num * num).collect(Collectors.toList());
    }

    private static int[] streamFun(int[] evenNums) {
        return Arrays.stream(evenNums).map(num->num*num).toArray();


    }

    private static int[] arrayFun(int[] evenNums) {
        int result[]=new int[evenNums.length];
        for (int i = 0; i <result.length ; i++) {
            result[i]=evenNums[i]*evenNums[i];
        }
        return result;

    }

    private static int[] squareFunction2(int[] evenNums) {
        return Arrays.stream(evenNums).map(num->num*num).toArray();
    }

    private static List<Integer> squareFunction(int[] evenNums) {
        return Arrays.stream(evenNums).map(num->num*num).boxed().collect(Collectors.toList());
    }

    private static List<Integer> mapFuntcion1(String[] words) {
        return Arrays.stream(words).map(String::length).collect(Collectors.toList());

    }

    private static void filterMap2(int[] evenNums) {
        Arrays.stream(evenNums).filter(num->num%2==0).forEach(System.out::println);
    }

    private static int[] filterMap(int[] evenNums) {
       List<Integer> evenList= Arrays.stream(evenNums).filter(num->num%2==0).boxed().collect(Collectors.toList());


    return evenList.stream().mapToInt(Integer::intValue).toArray();
    }


}
