package laitinenm;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * Portaat-luokka, joka osaa piirt�� portaita yl�s ja alas.
 * @author Ari Tuhkala
 * @version 1.0
 */
public class Portaat {
    
    /**
     * Aliohjelma piirt�� ikkunaan yhden nousevan portaan
     * alkaen pisteest� (x,y) ja p��ttyen pisteeseen (x+1,y+1)
     * <pre>
     *    |-------(x+1,y+1)
     *    |
     *    |
     *    |
     *   (x,y) 
     * </pre>
     * @param window
     * @param x portaan alkupisteen x
     * @param y portaan alkupisteen y
     */
    public void porrasYlos(EasyWindow window,double x,double y) {
        window.addLine (x,y,x,y+1);
        window.addLine (x,y+1,x+1,y+1);
    }
    
    /**
     * Aliohjelma piirt�� ikkunaan yhden laskevan portaan
     * alkaen pisteest� (x,y) ja p��ttyen pisteeseen (x+1,y-1)
     * <pre>
     * (x,y)
     *    |
     *    |
     *    |
     *    |-------(x+1,y-1)
     * </pre>
     * @param window
     * @param x portaan alkupisteen x
     * @param y portaan alkupisteen y
     */
    public void porrasAlas(EasyWindow window,double x,double y) {
        window.addLine (x,y,x,y-1);
        window.addLine (x,y-1,x+1,y-1);
        
    }
    /**
     * Piirt�� portaat yl�s ja alas
     * @param window ikkuna, johon piirret��n
     * @param portaidenLkm montako porrasta piirret��n yl�s ja alas
     */
    public void piirraPortaat (EasyWindow window, int portaidenLkm) {

        for(int i=0; i< portaidenLkm; i++)
        {
            porrasYlos(window,i,i);
            porrasAlas(window,i+portaidenLkm,portaidenLkm-i);
        }
    }
    
    /**
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        Portaat portaat = new Portaat();
        EasyWindow window = new EasyWindow();
        window.scale(0,0,10,10);
        
        
        //portaat.porrasYlos(window,0,0);
        //portaat.porrasAlas(window,1,1);
        //window.clear();
        
        portaat.piirraPortaat(window,5);
        window.showWindow();
    }

}