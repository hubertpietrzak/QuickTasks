package org.example;

import java.util.List;

public class MissingElement {
    public static void main(String[] args) {
        int[] someArray = {0, 1, 2, 3, 9, 8, 7, 6, 5, 10};

        findMissingElement(someArray, someArray.length);


    }


    public static void findMissingElement(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }



}
