package array;

public class ArrayDi2 {

    public static void main(String[] args) {

        int[][] arr = new int[10][10];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
    }
}
