package org.aon.arrays;

public class SubarraySearch {
    public static int findSubarrayIndex(int[] main, int[] sub) {

        //edge case scenarios added
        if (sub.length == 0) return 0;
        if (sub.length > main.length) return -1;

        for (int i = 0; i <= main.length - sub.length; i++) {
            boolean match = true;
            for (int j = 0; j < sub.length; j++) {
                if (main[i + j] != sub[j]) {
                    match = false;
                    break;
                }
            }
            if (match) return i;
        }
        //if loop finishes and nothing is returned above
        return -1;
    }
}

