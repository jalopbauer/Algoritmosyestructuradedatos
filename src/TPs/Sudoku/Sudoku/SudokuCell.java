package TPs.Sudoku.Sudoku;
/* Created by Jorge Lopez Bauer on 3/26/2020 */
/**
 * Represents a single cell 3x3 in a 9x9 sudoku.
 */
public class SudokuCell {

    /**
     * The squares of a 3x3 cell.
     */
    private SudokuSquare[][] sudokuSquares;

    /**
     * The default size of the sudokuSquares.
     */
    private final int DEFAULT_SIZE = 3;

    /**
     * Creates a 3x3 SudokuCell
     * Sets the size of the sudokuSquares to the DEFAULT_SIZE.
     * Creates a SudokuSquare in each index of sudokuSquares.
     */
    public SudokuCell() {
        this.sudokuSquares = new SudokuSquare[DEFAULT_SIZE][DEFAULT_SIZE];
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            for (int j = 0; j < DEFAULT_SIZE; j++) {
                sudokuSquares[i][j] = new SudokuSquare();
            }
        }
    }

    /**
     * Sets number in a position.
     * @param i column index of the array.
     * @param j row index of the array.
     * @param number value of the number.
     */
    public void setNumberInPosition(int i, int j, int number){
        sudokuSquares[i][j].setNumber(number);
    }

    /**
     * Sets number in a position of the pencilMarkings.
     * @param i column index of the array.
     * @param j row index of the array.
     * @param number value of the number.
     */
    public void setPencilMarkings(int i, int j,int number){
        sudokuSquares[i][j].setPencilMarkings(number);
    }

    /**
     * Removes number in a position of the pencilMarkings.
     * @param i column index of the array.
     * @param j row index of the array.
     */
    public void removePencilMarkings(int i, int j){
        sudokuSquares[i][j].removePencilMarkings();
    }
}
