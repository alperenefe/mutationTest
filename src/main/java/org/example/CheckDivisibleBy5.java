package org.example;

public class CheckDivisibleBy5 {

    public void check(int x) {

        while (x > 0) {
            if (x % 5 == 0) {
                System.out.println(x);
            }
            x--;
        }
    }
}
