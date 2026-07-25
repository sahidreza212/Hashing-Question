package org.example;

import java.util.HashMap;

public class Majority_Element {
    public static void majorityElement(int nums[]){
        HashMap<Integer, Integer>map = new HashMap<>();
        int n = nums.length;

        // Count frequency
        for(int i = 0;i<nums.length;i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i] )+ 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        // Print elements with frequency > n/3
        for(int key : map.keySet()){
            if(map.get(key)> n/3) {
                System.out.println(key);
            }
        }

    }
    public static void main(String[] args) {
        int num[] = {1,3,2,5,1,3,1,5,1};
        majorityElement(num);
    }
}
