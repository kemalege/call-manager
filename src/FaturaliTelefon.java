public class FaturaliTelefon extends Telefon {

    public final int bedavaKonusmaSuresi;
    public int kullanilanSure;
    public int faturaTutari;

    public FaturaliTelefon(String numara, int bedavaSure, int faturaTutari) {
        this.numara=numara;
        this.bedavaKonusmaSuresi=bedavaSure;
        this.faturaTutari=faturaTutari;
    }

    public void AramaYap(String arananNumara, int konusmaSuresi) {
        arananNumaralar.add(new Konusma(this.numara, arananNumara, konusmaSuresi));
        this.kullanilanSure+=konusmaSuresi;

        if(this.bedavaKonusmaSuresi-kullanilanSure<0) {
            this.faturaTutari += (this.kullanilanSure - this.bedavaKonusmaSuresi) * 2;
        }
    }

    public void GelenArama(String arayanNumara, int konusmaSuresi) {
        arayanNumaralar.add(new Konusma(arayanNumara, this.numara, konusmaSuresi));
    }

}