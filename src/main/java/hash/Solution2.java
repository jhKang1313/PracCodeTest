package hash;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution2 {
    public String solution(String[] a, String[] b){
        String result = "";
        List<String> part = Arrays.asList(a).stream().sorted().collect(Collectors.toList());
        List<String> comp = Arrays.asList(b).stream().sorted().collect(Collectors.toList());

        for(int i = 0 ; i < part.size() ; i++){
            String partItem = part.get(i);
            if(i == part.size() -1 ){
                result = partItem;
                break;
            }
            String compItem = comp.get(i);
            if(!partItem.equals(compItem)){
                result = partItem;
                break;
            }
        }
        return result;
    }
}
