package rikkei.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void translateFizz() {
        int n = 6;
        String expected ="Fizz";
        String result=FizzBuzz.translate(n);
        assertEquals(expected,result);
    }
    @Test
    void translateFizzBuzz() {
        int n = 15;
        String expected ="FizzBuzz";
        String result=FizzBuzz.translate(n);
        assertEquals(expected,result);
    }
    @Test
    void translateBuzz() {
        int n = 5;
        String expected ="Buzz";
        String result=FizzBuzz.translate(n);
        assertEquals(expected,result);
    }
    @Test
    void translateN() {
        int n = 16;
        String expected ="16";
        String result=FizzBuzz.translate(n);
        assertEquals(expected,result);
    }

}