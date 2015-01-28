package java3esimerkit;
public class Henkilo {
  private final String hetu;
  private String nimi;
  private Henkilo puoliso;

  public Henkilo(String hetu) {
    this.hetu = hetu;
  }

  public String  getHetu()       { return hetu;       }
  public void    setNimi(String uNimi) { nimi = uNimi; }
  public String  getNimi()       { return nimi;       }
  public Henkilo getPuoliso()    { return puoliso;    }

  public void avioidu(Henkilo h) {
    //Varmistetaan, että kumpikaan osapuoli ei ole naimisissa.
    h.eroa();
    eroa();
    //Mennään naimisiin.
    puoliso = h;
    h.puoliso = this;
    
  }

  public void eroa() {
    if ( puoliso != null ) {
      puoliso.puoliso = null;
      puoliso = null;
    }
  }
  
  public static void main (String [] args) {
      Henkilo henk1 = new Henkilo("11223344-1234");
      Henkilo henk2 = new Henkilo("11223355-4321");
      henk1.setNimi("Pekka");
      henk2.setNimi("Ulla");
      
      henk1.avioidu(henk2);
      System.out.println("Minun nimeni on: " + henk1.getNimi() + "ja puolisoni on: " + henk2.getPuoliso().getNimi());
  }
  
}