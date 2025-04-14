package org.aon;

import org.aon.IncDecImplementation.MyIncDec;
import org.aon.IncDecInterface.IncDec;
import org.aon.arrays.SubarraySearch;
import org.aon.proxy.factories.IncDecProxyFactory;

public class Main {
    public static void main(String[] args) {

        //Example 1 Code
        IncDec original = new MyIncDec(5);

        //Using Java's dynamic proxy feature.
        IncDec proxy = IncDecProxyFactory.createProxy(original);

        /*
        once the below method is called, it will display the execution time in the console
        Its Possible that many times 0ms will be shown due to ultra-fast processing time of the JVM
        We can add below code in the methods to show some valid ms greater than 0

        private Random rand = new Random();
        try {
            Thread.sleep(rand.nextInt(201)); // Random delay between 0 and 200 ms
               } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        */

        proxy.increment();
        proxy.decrement();

        //Example 2 code

        int[] mainArray = {4, 9, 3, 7, 8};
        int[] subArray = {3, 7};

        int result = SubarraySearch.findSubarrayIndex(mainArray, subArray);
        System.out.println("Subarray starts at index: " + result);

        //Just to test more arrays
        test(new int[]{1, 2, 3, 4}, new int[]{2, 4}, -1);
        test(new int[]{5, 6, 7, 8}, new int[]{5, 6}, 0);
        test(new int[]{5, 6, 7, 8}, new int[]{7, 8}, 2);
        test(new int[]{1, 2, 3}, new int[]{}, 0);
        test(new int[]{1, 2}, new int[]{1, 2, 3}, -1);
        test(new int[]{1, 2, 3}, new int[]{1, 2, 3}, 0);
    }

    static void test(int[] main, int[] sub, int expected) {
        int result = SubarraySearch.findSubarrayIndex(main, sub);
        System.out.println("Expected: " + expected + ", Got: " + result + " -> " +
                (result == expected ? "PASS" : "FAIL"));
    }
}
