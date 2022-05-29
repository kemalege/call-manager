public class Konusma implements Comparable {
    public String arayanNumara;
    public String arananNumara;
    public int aramaSuresi; //saniye cinsinden

    public Konusma(String arayanNumara,String arananNumara, int aramaSuresi)
    {
       this.arayanNumara=arayanNumara;
       this.arananNumara=arananNumara;
       this.aramaSuresi=aramaSuresi;
    }

    public int getAramaSuresi() {
        return aramaSuresi;
    }

    public String getArayanNumara() {
        return arayanNumara;
    }

    public String getArananNumara() {
        return arananNumara;
    }

    public String toString() {
        return arayanNumara + " " + arananNumara + " " + aramaSuresi;
    }

    public int compareTo(Object o) {
        if(this.aramaSuresi>((Konusma) o).aramaSuresi)
            return 1;
        if(this.aramaSuresi==((Konusma) o).aramaSuresi)
            return 0;
        else
            return -1;
    }

}