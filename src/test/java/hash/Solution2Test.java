package hash;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("완주하지 못한 선수 테스트")
class Solution2Test {
    @Test
    void test1(){
        //Given
        String[] parti = {"leo", "kiki", "eden"};
        String[] comple = {"eden", "kiki"};
        //When
        String actual = new Solution2().solution(parti, comple);
        //Then
        String expected = "leo";
        assertEquals(expected, actual);
    }
    @Test
    void test2(){
        //Given
        String[] parti = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comple = {"josipa", "filipa", "marina", "nikola"};
        //When
        String actual = new Solution2().solution(parti, comple);
        //Then
        String expected = "vinko";
        assertEquals(expected, actual);
    }
    @Test
    void test3(){
        //Given
        String[] parti = {"mislav", "stanko", "mislav", "ana"};
        String[] comple = {"stanko", "ana", "mislav"};
        //When
        String actual = new Solution2().solution(parti, comple);
        //Then
        String expected = "mislav";
        assertEquals(expected, actual);
    }
    @Test
    void test4(){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] complete = {"stanko", "ana", "mislav"};

        List<String> parti = Arrays.asList(participant);
        List<String> comp = Arrays.asList(complete);

        for(String item : comp){
            parti.set(parti.indexOf(item), "");
        }

        String result = parti.stream().filter(item -> !item.equals("")).collect(Collectors.toList()).get(0);
        String actual = result;
        String expected = "mislav";

        assertEquals(expected, actual);
    }
}
