package laskin;

public class Laskin {

    private int tulos;  	// Muuttuja tulokselle

    private boolean virta;  // Muuttuja laskimen virralle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {
        tulos = tulos * n;
    }

    public void jaa(int n) {
        if (n==0) {
            throw new ArithmeticException("Nollalla ei voi jakaa");
        } else {
            tulos = tulos / n;
        }
    }

    public void nelio(int n) {
        tulos = n * n;
    }

    public void neliojuuri(int n) {
        tulos = (int) Math.sqrt(n);
    }

    public void virtaON() {
        tulos = 0;
        virta = true;
    }

    public void virtaOFF() {
        tulos = 0;
        virta = false;
    }

}
