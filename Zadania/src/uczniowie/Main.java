package uczniowie;

class Uczniowie {

    public static void main(String[] args) {
        class Uczeń{
            String Imię;
            String Nazwisko;
            String PESEL;
            void ustawImię(String noweImię){
                Imię = noweImię;
            }
            void ustawNazwisko(String noweNazwisko){
                Nazwisko = noweNazwisko;
            }
            void ustawPesel(String nowyPesel){
                PESEL = nowyPesel;
            }
        }
        class UczeńSzkoły extends Uczeń{
            String nazwaSzkoły;
            void UstawSzkołę(String nowaSzkoła){
                nazwaSzkoły=nowaSzkoła;
            }

        }

        class UczeńKlasy extends UczeńSzkoły{
            String Klasa;
            void ustaw_Klasę(String nowaKlasa){
                Klasa=nowaKlasa;
            }

        }
        String s;
        byte [] buf = new byte[255];
        UczeńKlasy uczen1= new UczeńKlasy();
        System.out.println("Podaj imię ucznia ");
        try{
            System.in.read(buf);
            s=new String(buf);
            s=s.trim();
            uczen1.ustawImię(s);
        }catch(Exception e){
            System.err.println(e.toString());
        }
        System.out.println("Podaj klasę ucznia ");
        try{
            System.in.read(buf);
            s=new String(buf);
            s=s.trim();
            uczen1.ustaw_Klasę(s);
        }catch(Exception e){
            System.err.println(e.toString());

        }
    }
}

