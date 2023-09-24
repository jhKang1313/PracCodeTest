package hash;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Solution3 {
  public boolean solution(String[] phone_book){
    List<String> pbList = Arrays.asList(phone_book).stream()
        .sorted((src, tar) -> new BigDecimal(src).compareTo(new BigDecimal(tar)))
        .collect(Collectors.toList());

    for(String pbItem : pbList){
      for(String pbItem2 : pbList){
        if(pbItem2.length() <= pbItem.length()) continue;
        if(pbItem2.startsWith(pbItem)) return false;
      }
    }
    return true;
  }

}
