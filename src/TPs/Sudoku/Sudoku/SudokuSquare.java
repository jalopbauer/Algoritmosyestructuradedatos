package TPs.Sudoku.Sudoku;
/* Created by Jorge Lopez Bauer on 3/26/2020 */
/**
 * Represents a single number in a 3x3 sudoku.
 */
public class SudokuSquare {

    /**
     * The number of the square.
     * The number must be between 1 and 9.
     */
    private Integer number;

    /**
     * The pencil markings of a sudoku square.
     * Each position corresponds for one number between 1 and 9,
     * @see #setPencilMarkings(int)  for number correspondance.
     */
    private int[] pencilMarkings;

    /**
     * The DEFAULT_SIZE of the pencilMarkings.
     */
    private final int DEFAULT_SIZE = 9;

    /**
     * Creates a new SudokuSquare.
     * Sets the size of the pencilMarkings to the DEFAULT_SIZE.
     */
    public SudokuSquare() {
        pencilMarkings = new int[DEFAULT_SIZE];
        initializePencilMarkings();
    }

    private void initializePencilMarkings() {
        for (int i = 0; i < pencilMarkings.length; i++) {
            pencilMarkings[i] = 0;
        }
    }

    /**
     * Sets the number in the position.
     * @param number the value of the number.
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     * Adds a pencil to the predisposed position.
     * @param number the value of the number that wants to be marked.
     */
    public void setPencilMarkings(int number){
        for (int i = 0; i < pencilMarkings.length; i++) {
            if (pencilMarkings[i] == 0){
                pencilMarkings[i] = number;
            }
        }
    }

    /**
     * Removes a pencil to the predisposed position.
     */
    public void removePencilMarking(int number){

    }
}
