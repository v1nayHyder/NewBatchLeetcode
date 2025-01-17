package New_batch_leetcode;
/*981. Time Based Key-Value Store
        Medium
        Topics
        Companies
        Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.

        Implement the TimeMap class:

        TimeMap() Initializes the object of the data structure.
        void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
        String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".


        Example 1:

        Input
        ["TimeMap", "set", "get", "get", "set", "get", "get"]
        [[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
        Output
        [null, null, "bar", "bar", null, "bar2", "bar2"]

        Explanation
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
        timeMap.get("foo", 1);         // return "bar"
        timeMap.get("foo", 3);         // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
        timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
        timeMap.get("foo", 4);         // return "bar2"
        timeMap.get("foo", 5);         // return "bar2"


        Constraints:

        1 <= key.length, value.length <= 100
        key and value consist of lowercase English letters and digits.
        1 <= timestamp <= 107
        All the timestamps timestamp of set are strictly increasing.
        At most 2 * 105 calls will be made to set and get.

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
    private final Map<String, List<Pair<String, Integer>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        List<Pair<String, Integer>> list = map.get(key);
        list.add(new Pair<>(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";

        List<Pair<String, Integer>> list = map.get(key);

        // Binary search for the largest timestamp less than or equal to the given timestamp
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Pair<String, Integer> pair = list.get(mid);
            if (pair.getSecond() == timestamp)
                return pair.getFirst();
            else if (pair.getSecond() < timestamp)
                left = mid + 1;
            else
                right = mid - 1;
        }

        // If no exact match found, return the value associated with the largest timestamp less than the given timestamp
        if (right < 0)
            return "";
        else
            return list.get(right).getFirst();
    }

    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar1", 1);
        timeMap.set("foo", "bar2", 2);
        timeMap.set("foo", "bar3", 3);

        System.out.println(timeMap.get("foo", 1)); // Output: bar1
        System.out.println(timeMap.get("foo", 3)); // Output: bar3
        System.out.println(timeMap.get("foo", 4)); // Output: bar3
    }
}



