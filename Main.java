package com.company;

public class Main {

    public static void main(String[] args) {
        String b = "B204B";
        System.out.println("Hell");
        int f = resolve(b);
        System.out.println(f);

    }

    static int resolve(String line) {
        String [] mas = line.split("");
        String b = "ABCEHKMOPTXY";
        String c = "0123456789";
        boolean isTrue = true;
        for (int i = 0; i < mas.length; i++) {
            boolean t;

            if (i == 0 || i == 4 || i == 5) {
                t = b.contains(mas[i]);
                if(!t) {
                    isTrue = false;
                    break;
                }

            }
            else {
                t = c.contains(mas[i]);
                if(!t) {
                    isTrue = false;
                    break;
                }
            }
        }
        if(isTrue) return 100;
        else return mas.length;
    }

}
