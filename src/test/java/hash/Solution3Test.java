package hash;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

  @Test
  void test(){
    //Given
    String[] phoneBook = {"119", "97674223", "1195524421"};
    boolean expected = false;
    //When
    boolean actual = new Solution3().solution(phoneBook);
    //Then
    assertEquals(expected, actual);
  }
  @Test
  void test1(){
    //Given
    String[] phoneBook = {"123","456","789"};
    boolean expected = true;

    //["12","123","1235","567","88"]	false
    //When
    boolean actual = new Solution3().solution(phoneBook);
    //Then
    assertEquals(expected, actual);
  }
  @Test
  void test2(){
    //Given
    String[] phoneBook = {"12","123","1235","567","88"};
    boolean expected = false;

    //When
    boolean actual = new Solution3().solution(phoneBook);
    //Then
    assertEquals(expected, actual);
  }

  @Test
  void test4(){
    //Given
    String[] phoneBook = {"22324225", "119", "97674223", "1195524421"};

    List<String> pbList = Arrays.asList(phoneBook).stream()
        .sorted((src, tar) -> Integer.parseInt(src) > Integer.parseInt(tar) ? 1 : -1)
        .collect(Collectors.toList());

    pbList.stream().forEach(item -> System.out.println(item));
    //When
    //Then
  }
}