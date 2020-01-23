package pl.sda.javakrk25.day5.zad_13_lock;

import java.util.Scanner;

public class Lock {

    private boolean isOpen;
    private int[] code;
    private int attemptsLeft;

    public Lock(boolean isOpen, int[] code, int attemptsLeft) {
        this.isOpen = isOpen;
        this.code = code;
        this.attemptsLeft = attemptsLeft;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setNewCode(int d1, int d2, int d3) {
        if (isOpen) {
            code[0] = d1;
            code[1] = d2;
            code[2] = d3;
        }
    }

    public void open(int d1, int d2, int d3) {
        if (code[0] == d1 && code[1] == d2 && code[2] == d3) {
            isOpen = true;
            attemptsLeft = 3;
        } else if (!isOpen) {
            attemptsLeft--;
            if (attemptsLeft == 0) throw new RuntimeException("BOOM!");
        }
    }

    public void close() {
        isOpen = false;
    }

    /**
     * expected args: isOpen[true|false], d1[0-9], d2[0-9], d3[0-9], attempts[0+]
     * example: true 0 0 0 3
     *
     * @param args
     */
    public static void main(String[] args) {

        boolean isOpen = Boolean.parseBoolean(args[0]);
        int d1 = Integer.parseInt(args[1]);
        int d2 = Integer.parseInt(args[2]);
        int d3 = Integer.parseInt(args[3]);
        int maxAttempts = Integer.parseInt(args[4]);

        Lock lock = new Lock(isOpen, new int[]{d1, d2, d3}, maxAttempts);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Is open [new lock]? " + lock.isOpen());
        lock.setNewCode(1, 2, 4);
        lock.close();
        System.out.println("Is open [new code, after close]? " + lock.isOpen());
        int[] code = getNumbersFromUser(scanner);
        lock.open(code[0], code[1], code[2]);
        System.out.println("Is open [after wrong code open]? " + lock.isOpen());
        lock.open(1, 2, 4);
        System.out.println("Is open [after correct code]? " + lock.isOpen());

        lock.close();
        lock.setNewCode(2, 2, 2);
        lock.close();
        lock.open(2, 2, 2);
        System.out.println("Is open [after hopefuly, not changed code]? " + lock.isOpen());
    }

    static int[] getNumbersFromUser(Scanner scanner) {
        System.out.println("Podaj 3 cyfry, każdą w nowej linii:");
        return new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
    }
}
