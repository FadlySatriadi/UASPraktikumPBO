/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.UAS;

/**
 *
 * @author danny
 */
public class Notebook extends Komputer implements Mouse, Keyboard, Print {
    public String merkOS = "Menggunakan OS Linux";
    public String merkKeyboard = "Menggunakan Keyboard Logitech";
    public String merkMouse = "Menggunakan Mouse Votre KM310";
    public String merkPrint = "Menggunakan Print Fuji Xerox CM155W";

    public void hidupkanOs(){
        System.out.println("Hidupkan OS pada Notebook "+ merkOS);
    }

    public void matikanOs(){
        System.out.println("Matikan OS pada Notebook "+ merkOS);
    }

    public void klikKanan(){
        System.out.println("Klik mouse kanan Notebook "+ merkMouse);
    }

    public void klikKiri(){
        System.out.println("Klik Mouse kiri Notebook "+ merkMouse);
    }

    public void tekanEnter(){
        System.out.println("Tekan enter pada Keyboard Notebook "+ merkKeyboard);
    }

    public void cetakData(){
        System.out.println("Cetak data melalui Notebook "+ merkPrint);
    }
}