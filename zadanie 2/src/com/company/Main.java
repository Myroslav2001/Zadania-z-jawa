package com.company;

class Zad1 {
    void wypiszDługość(String s) {
        System.out.println(s.length());
    }

    public static void main(String[] args) throws Exception {
        try {
            Zad1 z = new Zad1();
            z.wypiszDługość(null);
        } catch (NullPointerException k) {
            //w.printStackTrace(System.out);
            //w.fillInStackTrace();
            //throw w;
            throw new Exception(k);

        }


    }
}