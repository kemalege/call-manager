import java.util.*;
import java.util.stream.Collectors;

public abstract class Telefon {
    protected String numara;
    protected ArrayList<Konusma> arayanNumaralar;
    protected ArrayList<Konusma> arananNumaralar;
    public abstract void AramaYap(String arananNumara, int konusmaSuresi);
    public abstract void GelenArama(String arayanNumara, int konusmaSuresi);

    public Konusma EnUzunKonusma() {
        Konusma ArayanEnUzunKonusma = arayanNumaralar.stream().max(Comparator.comparing(Konusma::getAramaSuresi)).get();
        Konusma AranananEnUzunKonusma = arananNumaralar.stream().max(Comparator.comparing(Konusma::getAramaSuresi)).get();

        if(ArayanEnUzunKonusma.compareTo(AranananEnUzunKonusma)==1){
            return ArayanEnUzunKonusma;
        }
        else  {
            return AranananEnUzunKonusma;
         }
    }

}
