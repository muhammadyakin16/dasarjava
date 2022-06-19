/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitungluaspsg;
import java.util.Scanner;
/**
 *
 * @author MUHAMMAD YAKIN
 */
public class MenghitungLuasPsg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int panjang, lebar, luas, tinggi, volume;
        Scanner userInput = new Scanner(System.in);
        // Mencari Luas persegi panjang
        // luas = panjang * lebar
        System.out.println("menghitung luas Persegi panjang");
        System.out.print("Panjang :");
        panjang = userInput.nextInt();
        
        System.out.print("Lebar :");
        lebar = userInput.nextInt();
        
        luas = panjang * lebar;
        System.out.println("luas =" + luas);
        
        // menghitung volume
        //volume = luas * tinggi
        System.out.println("Menghitung Volume");
        System.out.print("Luas :");
        luas = userInput.nextInt();
        System.out.print("tinggi :");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume =" + volume);
        
    }
    
}
