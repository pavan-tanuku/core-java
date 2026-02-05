package arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] j = new int[5][];
        // size of 1st internal array.
        j[0] = new int[3];

        // size pf 2nd internal array.
        j[1] = new int[4];

        // size of 3rd internal array.
        j[2] = new int[2];

        // reading random elements.
        for(int i = 0; i < j.length; i++) {
            if(j[i] != null) {
                for(int k = 0; k < j[i].length; k++) {
                    j[i][k] = (int)(Math.random() * 10) + 1;
                }
            }
        }
        // printing elements.
        for(int i = 0; i < j.length; i++) {
            if(j[i] != null) {
                for(int k = 0; k < j[i].length; k++) {
                    System.out.print(j[i][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
