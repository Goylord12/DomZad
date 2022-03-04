package com.company;

import java.util.Scanner;

// z = x+y / у+1


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Х ");
        int x = in.nextInt();

        System.out.println("Введите У ");
        int y = in.nextInt();

        Zadach Z = new Zadach(x,y);
        Z.Zad();
    }
}
class Zadach{

    int x;
    int y;

    Zadach(int x,int y){
        this.x = x;
        this.y = y;

    }
    public void Zad(){
        if((y+1)!=0){
            double z = (double) (x+y) / (y+1);
            System.out.println("(x+y) / (y+1) = " + z);
        }

        else{
            System.out.println("На ноль не делиться наверное");
        }
    }
}