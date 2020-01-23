package pl.sda.javakrk25.day2;

public class VarargsShapesPrinter {
    public static void main(String[] args) {
        String figura = args[0];
        String znak = args[1];

        switch (figura) {
            case "kwadrat": {
                System.out.println("Użytkownik wybrał kwadrat składający się z " + znak);
                break;
            }
            case "prostokat": {
                System.out.println("Użytkownik wybrał prostokat składający się z " + znak);
                break;
            }
            default: {
                System.out.println("Nieznana figura!: " + figura);
                break;
            }
        }
    }
}
