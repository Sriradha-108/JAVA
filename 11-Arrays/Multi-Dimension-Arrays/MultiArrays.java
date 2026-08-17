public class MultiArrays {
    public static void main(String[] args) {
        // Multi-dimensional array

        // int[][] marks = new int[3][3];
        // marks[0][0] = 85;
        // marks[0][1] = 90;
        // marks[0][2] = 78;
        // marks[1][0] = 92;
        // marks[1][1] = 88;
        // marks[1][2] = 95;
        // marks[2][0] = 76;
        // marks[2][1] = 84;
        // marks[2][2] = 89;

        // // Printing the elements of the multi-dimensional array
        // for (int row = 0; row < marks.length; row++) {
        //     for (int col = 0; col < marks[row].length; col++) {
        //         System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // Multi-dimensional array -->each with diff lenth
        // int[][] marks = new int[3][];
        // marks[0] = new int[3];
        // marks[1] = new int[1];
        // marks[2] = new int[2];

        // marks[0][0] = 85;
        // marks[0][1] = 90;
        // marks[0][2] = 78;
        // marks[1][0] = 92;
        // marks[2][0] = 76;
        // marks[2][1] = 84;

        // // Printing the element of the array
        // for (int row =0; row < marks.length; row++){
        //     for (int col = 0; col < marks[row].length; col++){
        //         System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        int[][] marks = {
            {85, 90, 78},
            {92},
            {76, 84}
        
        }; 
        // Printing the element of the array
        for (int row =0; row < marks.length; row++){
            for (int col = 0; col < marks[row].length; col++){
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }

    }
        
}