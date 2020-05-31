public class czwicz {
    static int si, sj;
    int i, j;
    czwicz(int i) {
        System.out.println("Klasa(int i)");
        this.i = i;
    }
    czwicz(int i, int j) {
        this(i);
        System.out.println("Klasa(int i, int j)");
        this.j = j;
    }
    static {
        System.out.println("static {}");
        si = sj = 1;
    }
}

public class test {
    public static void main(String[] args) {

        czwicz jakasKlasa = new czwicz(2, 3);

    }

}