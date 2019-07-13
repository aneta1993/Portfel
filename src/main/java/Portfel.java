public class Portfel extends Pieniadze {

    double stanPortfela;


    public Portfel(String waluta, double kwota) {
        this.waluta = waluta;
        this.kwota = kwota;
        this.stanPortfela = 0;
    }

    public void addMoney(int kwota) {
        this.stanPortfela += kwota;
    }

    public boolean wyjmijPieniadze(int kwota) {
        if (stanPortfela >= kwota) {
            stanPortfela -= kwota;
            return true;
        }
        System.out.println("Brak pieniedzy w portfelu");
        return false;
    }
}

