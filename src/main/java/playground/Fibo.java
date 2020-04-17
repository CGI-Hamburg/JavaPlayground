package playground;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * fib(0) = 0
 * fib(1) = 1
 * fib(n) = fib(n-1) + fib(n-2)
 * 0->0, 1->1, 2->1; 3->2; 3,5,8,13,21,…
 * computeIfAbsent(...)
 */
public class Fibo {

    Map<Integer, Integer> fibonacci = new ConcurrentHashMap<Integer, Integer>();

    public static void main(String [] args){
        Fibo fibo = new Fibo();
        int f = fibo.fib(17);
        System.out.println("fib 17: " + f);
    }

    private int fib(final int i) {
        switch(i) {
            case 0 : return 0;
            case 1 : return 1;
            default : {
                int n1 = fib(i-1);
                int n2 = fib(i-2);
                return fibonacci.computeIfAbsent(i, n -> n1+n2);
            }
        }
    }
}
