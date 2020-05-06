package app;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        int nums[] = {2,2,1,1,1,2,2};         
        int num = majorityElement(nums);
        System.out.printf("%d%n", num);
    }

    public static int majorityElement(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int num = 0;
        int mayority = nums.length / 2;
        Map<Integer, Integer> mapInts = new HashMap<Integer, Integer>();
        mapInts.put(nums[0], 1);

        for(int i= 1; i < nums.length; i++){
            int times = mapInts.containsKey(nums[i]) ? mapInts.get(nums[i]): 0;
            mapInts.put(nums[i], ++times);
            if(times > mayority){
                num = nums[i];
                break;
            }
        }
        return num;
    }
}