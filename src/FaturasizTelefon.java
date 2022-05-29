public class FaturasizTelefon extends Telefon {
    public int kullanilabilirTl;

    public FaturasizTelefon(String numara, int kullanilabilirTl) {
        this.numara = numara;
        this.kullanilabilirTl = kullanilabilirTl;
    }

    public void AramaYap(String arananNumara, int konusmaSuresi) {
        int ucret = konusmaSuresi * 2;

        if (kullanilabilirTl >= ucret) {
            kullanilabilirTl -= ucret;
            arananNumaralar.add(new Konusma(this.numara, arananNumara, konusmaSuresi));
        }
    }

    public void GelenArama(String arayanNumara, int konusmaSuresi) {
        arayanNumaralar.add(new Konusma(arayanNumara, this.numara, konusmaSuresi));
    }

}
