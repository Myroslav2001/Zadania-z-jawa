public class zad1 {

    public static void main(String[] args) {
        int pozx = 0;
        int pozxmax = 500;
        int pozy = 0;
        int pozymax = 600;
        int zdjcount = 0;

        do {
            do {
                System.out.println("*Picture*");
                System.out.println("Position - X: " + pozx + "Y: " + pozy);
                pozx += 40;
                zdjcount++;
            } while (pozx <= pozxmax);
            pozx = 0;
            pozy += 40;
        }
        while (pozy <= pozymax);
        System.out.println("Number of pictures taken: " + zdjcount);

    }
}
