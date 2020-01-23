package pl.sda.javakrk25.day3;

public class Pokoj {

    private double szerokosc;
    private double dlugosc;
    private double wysokosc;


    public Pokoj(double szerokosc, double dlugosc, double wysokosc) {
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.wysokosc = wysokosc;
    }

    public Pokoj(double szer, double dl) {
        this.szerokosc = szer;
        this.dlugosc = dl;
        this.wysokosc = 2.4;
    }

    public void wypiszPowierzchnie() {
        System.out.println(String.format("Pole powierzchni to: %.2f m^2", polePowierzchni()));
    }

    public void wypiszObjetosc() {
        System.out.println(String.format("Kubatura  to: %.2f  m^3", objetosc()));
    }

    private double polePowierzchni() {
        return szerokosc * dlugosc;
    }

    private double objetosc() {
        return polePowierzchni() * this.wysokosc;
    }


    public static void main(String[] args) {
        Pokoj pokoj = new Pokoj(15.3, 8.31);
        Pokoj salaBalowa = new Pokoj(20.5, 18, 5.8);

        Pokoj[] pokoje = {pokoj, salaBalowa};

        for (Pokoj p : pokoje) {
            p.wypiszObjetosc();
            p.wypiszPowierzchnie();
        }

    }
}
