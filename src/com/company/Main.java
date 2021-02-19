package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double ventas[]=new double[30];
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese las ventas:");

        for (int i=0;i<ventas.length;i++){

            System.out.println("Venta"+ (i+1));
            ventas[i]= sc.nextDouble();
        }
        int k=0;
        int total=0;
        while (k<30){

            if(ventas[k]>=2000){

                System.out.println(ventas[k]);
                total++;


            }
        k++;


        }


    }
}
