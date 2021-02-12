package com.company;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main implements IsSampleInterface {
    static int c2 = 20;

    public static void main(String[] args) {
        String b = "B204B";
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int f = resolve(b);
        System.out.println(f);

    }

    static int resolve(String line) {
        String [] mas = line.split("");
        String b = "ABCEHKMOPTXY";
        String c = "0123456789";
        boolean isTrue = true;
        for (int i = 0; i< mas.length; i++) {
            boolean t = false;
            if(i == 0 || i== 4 || i==5) {
                t = b.contains(mas[i]);
                if(t == false) {
                    isTrue = false;
                    break;
                }

            }
            else {
                t = c.contains(mas[i]);
                if(t == false) {
                    isTrue = false;
                    break;
                }
            }
        }
        if(isTrue == true) return 100;
        else return mas.length;
    }

    @Override
    public void doWork(Object myparam) throws Exception {
        if(myparam == null) throw new Exception("Данные NULL");
        myparam = 100;
        System.out.println(myparam);
    }
}
