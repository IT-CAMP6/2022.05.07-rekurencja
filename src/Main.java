public class Main {
    public static void main(String[] args) {
        int wynik1 = silnia(5);

        System.out.println(wynik1);

        int wynik2 = silniaR(5);

        System.out.println(wynik2);

        int wynik3 = power(5,3);

        System.out.println(wynik3);
    }

    static int silnia(int x) {
        int wynik = 1;
        for(int i = 2; i <= x; i++) {
            wynik = wynik * i;
        }
        return wynik;
    }

    static int silniaR(int x) {
        if(x == 1) {
            return 1;
        }
        return x * silniaR(x - 1);
    }

    static int power(int x, int y) {
        if(y == 1) {
            return x;
        }
        return x * power(x, y-1);
    }
}
