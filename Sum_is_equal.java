//Find the index of two array elements whose sum is equal to the given value


import java.io.*;
class Sum_is_equal {

    static boolean chkPair(int A[], int size, int x)
    {
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (A[i] + A[j] == x) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args)
    {

        int A[] = { 0, -1, 2, -3, 1 };
        int x = -2;
        int size = A.length;

        if (chkPair(A, size, x)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}