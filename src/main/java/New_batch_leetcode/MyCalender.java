package New_batch_leetcode;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MyCalender {

//    List<int []> events=new ArrayList<>();
//    events= new ArrayList();

    TreeMap<Integer,Integer> map;
    public MyCalender(){

        map=new TreeMap<>();

    }
    public boolean book(int start, int end) {

        Integer preVal=map.lowerKey(end);
        System.out.println(preVal+"==========");
        if (preVal!=null&&map.get(preVal)-1>=start){
            return false;
        }
        map.put(start,end);
        System.out.println(map+"--------------------");
        return true;


    }
    public static void main(String[] args) {
        MyCalender myCalender1=new MyCalender();

        System.out.println( myCalender1.book(10,20));
        System.out.println(myCalender1.book(21,25));
        System.out.println(myCalender1.book(20,35));    }
}
