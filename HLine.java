/**
 * Program to Draw
 * 
 * @author      Cody Stone
 * @version 1.0, April 5, 2020
 */
package hmwk09_10;

public class HLine extends Shape{
    int width;
    
    public HLine() {
        this.x = 0;
        this.y = 0;
        this.c = ' ';
        this.width = 0;
    }
    
    public HLine(int x, int y, char c, int width) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.width = width;
    }
    
    public char[][] Draw(char[][] canvas) {
        int j = x;
        int k = y;
        for(int i = 0; i < width; i++){
            canvas[k][j] = c;
        j++;
        }
        return canvas;
    }
    
    public int getWidth() {
        return width;
    }
    
    @Override
    public String toString() {
        return String.format("%c at (%d, %d), %d wide", getC(), getX(), getY(), getWidth());        
    }
}
