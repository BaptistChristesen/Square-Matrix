import java.util.Stack;

/**
 * Write a description of class SquareMatrix here.
 *
 * @author (your name)
 * @version (today's date)
 */
public class SquareMatrix implements SquareMatrixInterface
{
    private int [][] array;
    
    public SquareMatrix(int n){
        array = new int[n][n];
    }
    public SquareMatrix(int n [][]){
        array = n;
    }
    public SquareMatrix add(SquareMatrix s){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] += s.getValue(i, j);
            }
        }
        return this;
    }
    public String toString(){
        String s = "";
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                s += array[i][j];
            }
        }
        return s;
    }
    public int getValue(int r, int c){
        return array[r][c];
    }
    public SquareMatrix copy(){
        SquareMatrix copy = new SquareMatrix(this.getSize());
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                copy.setValue(i, j, this.getValue(i, j));
            }
        }
        return copy;
    }
    public int getSize(){
        return array.length;
    }
    public void setValue(int r, int c, int v){
        array[r][c] = v;
    }
    public void fillValue(int v){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = v;
            }
        }
    }
    public void makeZero(){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = 0;
            }
        }
    }
    public SquareMatrix subtract(SquareMatrix s){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] -= s.getValue(i, j);
            }
        }
        return this;
    }
}
