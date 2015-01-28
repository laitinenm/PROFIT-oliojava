package laitinenm;

public class Paivamaara {

    private int paiva;
    private int kuukausi;
    private int vuosi;
    
    public Paivamaara() {
        this.paiva = 0;
        this.kuukausi = 0;
        this.vuosi = 0;
      }
    
    public String toString(int pv, int kk, int v){
        String paivamaara 
        
        return paivamaara;
    }
    
   public void TulostaPaivamaara(int pv, int kk, int v){
        
       String paivamaara = "";
       paivamaara = toString(pv,kk,v);
       
       System.out.println(paivamaara); 
        
    }
   
   public static void main(String[] args) {
        // TODO Auto-generated method stub
       Paivamaara pvm = new Paivamaara();
       pvm.TulostaPaivamaara(27, 1, 2015);
    }

}