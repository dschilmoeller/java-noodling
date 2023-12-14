public class ArrayExercise {
    public static void main(String[] args) {

        // Declare a 2d array of float values called floatTwoD
        float[][] floatTwoD;

        // Initialize the 2d array from the last step to an empty 2d array consisting of
        // 4 arrays with 10 elements each
        floatTwoD = new float[4][10];

        // Declare and initialize an empty 2d array of integers consisting of 15 rows
        // and 8 columns called dataChart
        int[][] dataChart = new int[15][8];

        // Create a 2D char array called ticTacToe representing the provided tic-tac-toe
        // board using initializer lists. Use the characters 'X', 'O', and ' '.
        char[][] ticTacToe = { { 'X', 'O', 'O' }, { 'O', 'X', ' ' }, { 'X', ' ', 'X' } };

        // When no one is looking, you want to modify the game to where you, 'O', wins
        // the game. Replace the game board so that all X’s are O’s and all O’s are X’s.
        // Do this in one line with initializer lists.
        ticTacToe = new char[][] { { 'O', 'X', 'X' }, { 'X', 'O', ' ' }, { 'O', ' ', 'O' } };

        int[][] intMatrix = {
                { 1, 1, 1, 1, 1 },
                { 2, 4, 6, 8, 0 },
                { 9, 8, 7, 6, 5 }
        };

        // Access the integer at the first row and fourth column of intMatrix and store
        // it in a variable called retrievedInt
        int retrievedInt = intMatrix[0][3];
        System.out.println(retrievedInt);
        // Print 3 times the center value of intMatrix to the console. Make sure to
        // access the correct element!
        System.out.println((intMatrix[1][2] * 3));
        System.out.println((intMatrix[1][2] * 3));
        System.out.println((intMatrix[1][2] * 3));

    }
}