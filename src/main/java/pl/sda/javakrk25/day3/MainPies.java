package pl.sda.javakrk25.day3;

public class MainPies {
    public static void main(String[] args) {
        Pies[] psy = new Pies[2];

        for (int i = 0; i < psy.length; i++) {
            String plec;
            if (i % 2 == 0) {
                plec = "suka";
            } else {
                plec = "pies";
            }
            Pies pies = new Pies("York", plec);
            pies.setAge(10 + i);
            psy[i] = pies;
        }

        for (Pies pies : psy) {
            pies.woof();
            System.out.println("Wiek psa: " + pies.getAge());
        }
    }
}
