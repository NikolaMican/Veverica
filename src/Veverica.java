public class Veverica {
    private String ime;
    private String boja;
    private Ruke leva;
    private Ruke desna;


    private String staDrzi="";

    public Veverica(String ime, String boja ){
        this.setIme(ime);
        this.setBoja(boja);
        this.staDrzi="NISTA";
        leva= new Ruke();
        desna = new Ruke();
    }

    public String getIme() {
        return ime;
    }

    public String getBoja() {
        return boja;
    }
    public String getStaDrzi(){
        return staDrzi;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
    public void savijLevuRuku(){
        leva.savij();
        System.out.println(ime+" je savila levu ruku");
    }
    public void savijDesnuRuku(){
        desna.savij();
        System.out.println(ime+" je savila desnu ruku");
    }

    public void ispruziLevuRuku(){
        leva.ispruzi();
        System.out.println(ime+" je ispruzila levu ruku");
        if(!desna.jeSavijena()){
            System.out.println("Veverica "+ime+" je ispustila "+staDrzi);
            staDrzi="NISTA";
        }
    }
    public void ispruziDesnuRuku(){
        desna.ispruzi();
        System.out.println(ime+" je ispruzila desnu ruku");
        if(!leva.jeSavijena()){
            System.out.println("Veverica "+ime+" je ispustila "+staDrzi);
            staDrzi="NISTA";


        }
    }

    public void pridrzi (String predmet){
        if(desna.jeSavijena() || leva.jeSavijena()){
            staDrzi=predmet;
            System.out.println("Veverica "+ime+" je pridrzala "+staDrzi);

        }
        else{
            System.out.println("Veverica "+ime+" ne moze da pridrzi "+staDrzi);
        }

    }
}
