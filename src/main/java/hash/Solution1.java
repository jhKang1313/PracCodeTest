package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    public int solution(int[] nums){
        int length = nums.length / 2;
        List<Integer> list = new ArrayList<Integer>();
        for(int num : nums){
            list.add(Integer.valueOf(num));
        }
        int distSize = list.stream().distinct().collect(Collectors.toList()).size();
        return distSize < length ? distSize : length;
    }
}
