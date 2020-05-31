class Punkt{
    int pozx; //max 500
    int pozy; //max 600
}
class Prostokat{
    int x=520;
    int y=600;
}

public class zad2 {
    public static void main(String[] args){
        Punkt point = new Punkt();
        Prostokat rectangle = new Prostokat();

        int zdjcount = 0;
        do {
            do
            {
                System.out.println("*Picture*");
                System.out.println("Position - X: " + point.pozx + " | Y: " + point.pozy);
                point.pozx +=40;
                zdjcount++;
            }
            while(point.pozx <= rectangle.x);

            if (point.pozx - rectangle.x != 0)
            {
                int roznica = point.pozx - rectangle.x;
                System.out.println("*Picture*");
                point.pozx -=roznica;
                System.out.println("Position - X: " + point.pozx + " | Y: " + point.pozy);
            }

            do{

            }
            while(point.pozx > 0);
        }
        while(point.pozy > 0);
    }
}