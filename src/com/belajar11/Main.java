// MEMAHAMI CARA MENGAMBIL INPUT DARI USER DENGAN SECANNER

package com.belajar11;

// Pertama harus mengimport utility dari file java
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //deklarasi
        Scanner input_user = new Scanner(System.in); // ini adalah deklarasi variabel/objek input
        int a;

        System.out.println("========================");
        System.out.println("MENGAMBIL DATA DARI USER");
        System.out.println("========================");

        //cara mengambil data input
        System.out.print("Masukkan angaka >> ");
        a = input_user.nextInt();
        System.out.println("Data yang anda inputkan adalah " + a );


    }
}
