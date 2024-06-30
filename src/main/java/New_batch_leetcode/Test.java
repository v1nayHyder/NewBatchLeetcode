package New_batch_leetcode;


import java.util.*;

public class Test {
    public static int[] topKFrequent(int[] nums, int k) {
       List<Integer> [] bucketList=new List[nums.length+1];
       HashMap <Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        System.out.println(hashMap);
        for (int key:hashMap.keySet()) {
            int frequence=hashMap.get(key);
            if (bucketList[frequence]==null){
                bucketList[frequence]=new ArrayList<>();
            }
            bucketList[frequence].add(key);
        }

        System.out.println(Arrays.toString(bucketList));
        int res[]=new int[k];
        int count=0;
        for (int i = bucketList.length-1; i >=0&&count<k; i--)
        {
            if (bucketList[i]!=null){
                for (Integer integer:bucketList[i]) {
                    res[count++]=integer;
                }
            }

        }

        return nums;
        }
    public static void main(String[] args) {
        int nums[]=topKFrequent(new int[]{1,2},2);
        System.out.println(Arrays.toString(nums));
    }

}