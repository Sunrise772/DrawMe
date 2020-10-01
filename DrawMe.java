/**
 * Program to Draw
 * 
 * @author      Cody Stone
 * @version 1.0, April 5, 2020
 */
package hmwk09_10;

import java.util.Scanner;

public class DrawMe {
    /**
     * main - Create Warehouse objects and alter their contents
     * 
     * @param args command line arguments
     * @return void
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
               
        char c;
        int x;
        int y;
        int w;
        
        char canvas[][] = {{'.','.','.','.','.', '.','.','.','.','.'},
            {'.','.','.','.','.', '.','.','.','.','.'},
            {'.','.','.','.','.', '.','.','.','.','.'},
            {'.','.','.','.','.', '.','.','.','.','.'},
            {'.','.','.','.','.', '.','.','.','.','.'}};
        
        
        System.out.print("c x y w? ");
        c = input.next().charAt(0);     
        x = input.nextInt();
        y = input.nextInt();
        w = input.nextInt();
        System.out.println();
        
        HLine hl = new HLine(x, y, c, w);
        hl.Draw(canvas);
        for (int i = 0; i < canvas.length; i++ ) {
            System.out.println(canvas[i]);
        }
        
        System.out.print("c x y h? ");        
        c = input.next().charAt(0);     
        x = input.nextInt();
        y = input.nextInt();
        w = input.nextInt();
        System.out.println();
        
        VLine vl = new VLine(x, y, c, w);
        vl.Draw(canvas);       
        for (int i = 0; i < canvas.length; i++ ) {
            System.out.println(canvas[i]);
        }
        
        System.out.println(hl);
        System.out.println(vl); 
    }
}
