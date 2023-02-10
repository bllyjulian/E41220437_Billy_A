/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Billyy
 */
import java.util.Scanner;
public class MenghitungBangunDatar {
    
    static void persegipanjang(){
        Scanner in = new Scanner(System.in);
      
        int panjang, lebar;
        System.out.println("=== Menghitung Luas Persegi Panjang ===");
        System.out.print("Masukkan Panjang : ");
        panjang = in.nextInt();
        System.out.print("Masukkan Lebar : ");
        lebar = in.nextInt();
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang adalah : " + luas);
        System.out.println("Keliling Persegi Panjang adalah : " + keliling);
    }
    
    static void segitiga(){
        Scanner st = new Scanner(System.in);
        
        int alas, tinggi;
        System.out.println("=== Menghitung Luas Segitiga ===");
        System.out.print("Masukkan Alas : ");
        alas = st.nextInt();
        System.out.print("Masukkan Tinggi : ");
        tinggi = st.nextInt();
        
        double luassegitiga = 0.5 * alas * tinggi;
        
        System.out.println("Luas Segitiga adalah : " + luassegitiga);
    }
    
    static void persegi(){
        Scanner pr = new Scanner(System.in);
        
        System.out.println("=== Menghitung Luas Persegi ===");
        int sisi;
        System.out.print("Masukkan Sisi : ");
        sisi = pr.nextInt();
        
        int luaspersegi = sisi * sisi;
        
        System.out.println("Luas Persegi adalah : " + luaspersegi);
                
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Menghitung Luas Bangun Datar ===");
        System.out.println("a. Persegi Panjang");
        System.out.println("b. Setitiga");
        System.out.println("c. Persegi");
        System.out.print("Pilih Bangun Datar yang ingin anda hitung(a,b,c) : ");
        String pilih = input.next();
        System.out.println("");
        
        if (pilih.equals("a")) {
            Scanner qw = new Scanner(System.in);
            persegipanjang();
            System.out.print("Apakah anda ingin menghitung yang lain?y/n : ");
            String yt = qw.next();
            System.out.println("");
            if(yt.equals("y")){
            main(args);
            }else {
                System.out.println("Yaudahh");
            }
            
        }
        else if(pilih.equals("b")){
        Scanner qw = new Scanner(System.in);
            segitiga();
            System.out.print("Apakah anda ingin menghitung yang lain?y/n : ");
            String yt = qw.next();
            System.out.println("");
            if(yt.equals("y")){
            main(args);
            }else {
                System.out.println("Yaudahh");
            }
        }
        else if(pilih.equals("c")){
        Scanner qw = new Scanner(System.in);
            persegi();
            System.out.print("Apakah anda ingin menghitung yang lain?y/n : ");
            String yt = qw.next();
            System.out.println("");
            if(yt.equals("y")){
            main(args);
            }else {
                System.out.println("Yaudahh");
            }
        }
        else {
            System.out.println("Silahkan masukkan yang valid (a, b , c)");
            System.out.println("");
            main(args);
        }
    }
}
