import java.sql.SQLOutput;

public class Ruke {
    public enum Stanje {SAVIJENA, ISPRUZENA}

    ;
    public Stanje stanje = Stanje.ISPRUZENA;

    private boolean jeSavijena=false;

    public void savij(){
        stanje=Stanje.SAVIJENA;
        jeSavijena=true;
    }
    public void ispruzi(){
        stanje= Stanje.ISPRUZENA;
        jeSavijena=false;
    }
    public boolean jeSavijena (){
        if(jeSavijena){
            return true;
        }
        else{
            return false;
        }
    }
    public Stanje getStanje(){
        return stanje;
    }
}