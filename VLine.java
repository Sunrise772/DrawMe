/**
 * Program to Draw
 * 
 * @author      Cody Stone
 * @version 1.0, April 5, 2020
 */
package hmwk09_10;

public class VLine extends Shape{
    int height;
    
    public VLine() {
        this.x = 0;
        this.y = 0;
        this.c = ' ';
        this.height = 0;
    }
    
    public VLine(int x, int y, char c, int height) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.height = height;
    }

    public char[][] Draw(char[][] canvas) {       
        int j = x;
        int k = y;        
        for(int i = 0; i < height; i++){
            canvas[k][j] = c;
        k++;
        }
        return canvas;
    }
    
    public int getHeight() {
        return height;
    } 
    
    @Override
    public String toString() {
        return String.format("%c at (%d, %d), %d tall", getC(), getX(), getY(), getHeight());        
    }    
}
