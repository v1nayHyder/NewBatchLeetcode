package New_batch_leetcode.striver_cheet_sheet.arrays;

public class MajorityEle169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3,2,2}));
    }
    public static int majorityElement(int[] nums) {
        int count=0;
        int condidate=0;
        for(int num:nums) {
            if (count == 0) {
                condidate = num;
            }
            if (num == condidate) {
                count++;
            } else {
                count--;
            }
        }
            return condidate;

//        Map<Integer,Integer> hashMap=new HashMap<>();
//        for (int num:nums){
//            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
//        }
//        for (int key: hashMap.keySet()) {
//            if (hashMap.get(key) > nums.length / 2) {
//                return key;
//            }
//        }
//    return -1;
    }
}
