package pl.sda.javakrk25.day3;

public class Pies {

    private String rasa;
    private int wiek;
    private String plec;

    public Pies(String rasa, String plec) {
        this.rasa = rasa;
        this.plec = plec;
    }

    public int getAge() {
        return this.wiek;
    }

    public void setAge(int wiek) {
        this.wiek = wiek;
    }

    public void woof() {
        if (this.plec.equals("pies")) {
            System.out.println("WOOF!");
        } else {
            System.out.println("Woof!");
        }
    }
}
