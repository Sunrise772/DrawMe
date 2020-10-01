/**
 * Program to Draw
 * 
 * @author      Cody Stone
 * @version 1.0, April 5, 2020
 */
package hmwk09_10;

public class Shape {
    int x;
    int y;
    char c;
    int width;
    
    public Shape() {
        this.x = 0;
        this.y = 0;
        this.c = ' ';
    }
    
    public Shape(int x, int y, char c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }
       
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public char getC() {
        return c;
    }
    
    @Override
    public String toString() {
        return String.format("%c at (%d, %d)", getC(), getX(), getY());
    }
}
