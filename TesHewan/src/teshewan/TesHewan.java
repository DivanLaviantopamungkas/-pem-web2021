/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teshewan;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
abstract class Hewan {
    public String jenis;
    public String ciri;
    
    public Hewan(String jenis, String ciri){
        this.jenis = jenis;
        this.ciri=ciri;
    }
    public void tampil(){
        System.out.println("Jenis :"+jenis);
        System.out.println("ciri : "+ciri);
    }
    public abstract void suara();
    public abstract void berjalan();
    public abstract void bernafas();
}

class singa extends Hewan {

    public singa(String jenis, String ciri) {
        super(jenis, ciri);
    }

   
    @Override
    public void suara(){
        System.out.println("Singa bersuara raurrrrrr");
    }
    @Override
    public void berjalan(){
        System.out.println("Berjalan dengan kaki");
    }
    @Override
    public void bernafas(){
        System.out.println("Paru Paru");
    }
}

class Elang extends Hewan{

    public Elang(String jenis, String ciri) {
        super(jenis, ciri);
    }

    
    @Override
    public void suara(){
        System.out.println("Elang Bersuara arkkk");
    }
    @Override
    public void berjalan(){
        System.out.println("Elang Terbang menggunakan sayap");
    }
    @Override
    public void bernafas(){
        System.out.println("Paru Paru");
    }
}

class Lebah extends Hewan {

    public Lebah(String jenis, String ciri) {
        super(jenis, ciri);
    }

    
    @Override
    public void suara(){
        System.out.println("Lebah bersuara ngungggg");
    }
    @Override
    public void berjalan(){
        System.out.println("Lebah Terbang menggunakan sayap");
    }
    @Override
    public void bernafas(){
        System.out.println("Paru Paru");
    }
}

class paus extends Hewan {

    public paus(String jenis, String ciri) {
        super(jenis, ciri);
    }

   
    @Override
    public void suara(){
        System.out.println("Paus bergerak menggunakan uukkkk");
    }
    @Override
    public void berjalan(){
        System.out.println("Paus bergerak menggunakan badanya");
    }
    @Override
    public void bernafas(){
        System.out.println("insan");
    }
}
public class TesHewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ulg="y";
        int pilih;
        while(ulg.equals("y")){
            System.out.println(" ");
            Scanner input = new Scanner(System.in);
            String ul="Lagi";
            System.out.println("Daftar Hewan");
            System.out.println("1. Singa");
            System.out.println("2. Elang");
            System.out.println("3. Lebah");
            System.out.println("4. Paus");
            System.out.println("5. Exit");
            
            System.out.println("Pilih :");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1 -> {
                    singa a = new singa("Mamalia", "Berbulu");
                    a.tampil();
                    a.suara();
                    a.berjalan();
                    a.bernafas();
                    break;
                }
                case 2 -> {
                    Elang b = new Elang("Burung","Terbang");
                    b.tampil();
                    b.suara();
                    b.berjalan();
                    b.bernafas();
                    break;
                }
                case 3 -> {
                    Lebah c = new Lebah("Serangga", "Kecil");
                    c.tampil();
                    c.suara();
                    c.berjalan();
                    c.bernafas();
                    break;
                }
                case 4 -> {
                    paus d = new paus("Ikan","Hidup di air");
                    d.tampil();
                    d.suara();
                    d.berjalan();
                    d.bernafas();
                    break;
                }
                case 5 -> {
                    System.exit(5);
                    System.out.println("Terimakasih");
                    break;
                }
            }
             System.out.println("=====================================");
        System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
        }
    }
    
}
