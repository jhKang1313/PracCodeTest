package hash;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("폰케몬")
class Solution1Test {
    @Test
    void test1(){
        //Given
        int[] input = new int[]{3,1,2,3};
        //When
        int actual = new Solution1().solution(input);
        //Then
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    void test2(){
        //Given
        int[] input = new int[]{3,3,3,2,2,4};
        //When
        int actual = new Solution1().solution(input);
        //Then
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    void test3(){
        //Given
        int[] input = new int[]{3,3,3,2,2,2};
        //When
        int actual = new Solution1().solution(input);
        //Then
        int expected = 2;
        assertEquals(expected, actual);
    }
}