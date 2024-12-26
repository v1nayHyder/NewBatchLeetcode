package New_batch_leetcode.striver_cheet_sheet.arrays;

import java.util.*;

public class UnionOf2SortedArrayGFG {
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 4, 5};
        int[] arr2={1, 2, 3, 6, 7};
        List<Integer> integerList=findUnion(arr1,arr2);
        System.out.println(integerList);
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int start1 = 0, start2 = 0;

        while (start1 < a.length && start2 < b.length) {
            if (a[start1] == b[start2]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[start1]) {
                    list.add(a[start1]);
                }
                start1++;
                start2++;
            } else if (a[start1] < b[start2]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[start1]) {
                    list.add(a[start1]);
                }
                start1++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != b[start2]) {
                    list.add(b[start2]);
                }
                start2++;
            }
        }

        // Add remaining elements from array `a`
        while (start1 < a.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[start1]) {
                list.add(a[start1]);
            }
            start1++;
        }

        // Add remaining elements from array `b`
        while (start2 < b.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[start2]) {
                list.add(b[start2]);
            }
            start2++;
        }

        return list;
//        Set<Integer> unionList=new TreeSet<>();
//        unionList.add(a[0]);
//        for (int num:a){
//                unionList.add(num);
//        }
//        for (int num:b){
//                unionList.add(num);
//        }
//
//        return new ArrayList<>(unionList);
    }
}
