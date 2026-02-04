package arrays;

/*
    -----------------
    | 1 | 2 | 3 | 4 | index = 0 => array0
    | 2 | 3 | 4 | 5 | index = 1 => array1
    | 3 | 4 | 5 | 6 | index = 2 => array2
    | 4 | 5 | 6 | 7 | index = 3 => array3
    -----------------
 */

public class MultiDimentionalArray {

    public static void main(String[] args) {
        // declaring a 2d array.
        int[][] m = new int[4][4];
        // initializing with user input values
        // array with index 0th row.
        m[0][0] = 1;
        m[0][1] = 2;
        m[0][2] = 3;
        m[0][3] = 4;
        // array with index 1st row.
        m[1][0] = 2;
        m[1][1] = 3;
        m[1][2] = 4;
        m[1][3] = 5;
        // array with index 2nd row.
        m[2][0] = 3;
        m[2][1] = 4;
        m[2][2] = 5;
        m[2][3] = 6;
        // array with index 3rd row.
        m[3][0] = 4;
        m[3][1] = 5;
        m[3][2] = 6;
        m[3][3] = 7;

        // printing with loop
        System.out.println("Normal for loop syntax:");
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        // 2nd array
        int[][] arr2 = new int[4][4];
        // taking random values:
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = (int)(Math.random() * 100) + 1;
            }
        }
        // printing
        System.out.println("Enhanced for loop syntax:");
        for(int n[]: arr2) {
            for(int o: n) {
                System.out.print(o + " ");
            }
            System.out.println();
        }
    }
}
