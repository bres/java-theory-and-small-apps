package smallApps.triliza;

import com.sun.jdi.Value;

/**
 * Pojo class - dedomenoy oti oyte extends kanei oyte implements
 * klash triliza.parexei tis methodoys gia to paixinidi triliza
 *
 * @author bres george
 * @version 0.1
 * @see #Triliza()
 * @see #createTriliza()
 * @see #printGrid()
 * @see #setValue(int, int, int)
 * @see #checkForTriliza()
 */


public class Triliza {

    private int[][] grid = new int[3][3];

    private Triliza() {
    }

    /**
     *
     *  static factory method
     * @return ena antikeimeno triliza
     */
    public static Triliza createTriliza() {
        return new Triliza();
    }

    /**
     *  Ektyponei ta stoixeia toy pinaka
     */
    public void printGrid() {
        for (int[] row :grid) {
            for (int element :row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    /**
     * thetei thn timh 1 h 2 sthn thesh x,y toy pinaka
     * @param x h thesh toy x
     * @param y h thesh toy y
     * @param value h timh 1h 2 poy thetei o kate paikths
     *
     */

    public void setValue(int x,int y, int value) throws ValueOutOfBoundsException{
        if ((x<0 || x>2 || y<0 || y>2) || (value !=1 && value !=2)) {
                throw new ValueOutOfBoundsException();
        }
        grid[x][y] = value;
    }

    /**
     *
     * elegxei gia triliza.theroyme mono tis diagonioys
     * @return true an ginei triliza allios false
     */
    public boolean checkForTriliza() {
        return ((grid[0][0]==grid[1][1] && grid[1][1]==grid[2][2])  ||
                (grid[0][2] == grid[1][1]) && (grid[1][1] == grid[2][0]) && (grid[1][1]!=0));
    }
}


