
/**
 * Write a description of interface SquareMatrixInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface SquareMatrixInterface
{
    public abstract SquareMatrix add(SquareMatrix s);
    public abstract String toString();
    public abstract int getValue(int row, int column);
    public abstract SquareMatrix copy();
    public abstract int getSize();
    public abstract void setValue(int row, int column, int value);
    public abstract void fillValue(int value);
    public abstract void makeZero();
    public abstract SquareMatrix subtract(SquareMatrix s);
}
