package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        var n = 21;
        fibonacci(n);
        if (list.contains(n)) {
            System.out.println("Fibonnaci contains " + n);
        } else {
            System.out.println("Fibonnaci does not contain " + n);
        }
    }

    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        var result = fibonacci(n - 1) + fibonacci(n - 2);
        list.add(result);
        return result;
    }

}