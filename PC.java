/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.UAS;

/**
 *
 * @author danny
 */
public class PC extends Komputer implements  Mouse, Keyboard, Print {
    public String merkOS = "Menggunakan Mac OS";
    public String merkKeyboard = "Menggunakan Keyboard Fantech";
    public String merkMouse = "Menggunakan Mouse Alcatroz";
    public String merkPrint = "Menggunakan Print Canon Pixma";

    public void hidupkanOs(){
        System.out.println("Hidupkan OS PC "+ merkOS);
    }

    public void matikanOs(){
        System.out.println("Matikan OS PC " +merkOS);
    }

    public void klikKanan(){
        System.out.println("Klik mouse kanan PC " +merkMouse);
    }

    public void klikKiri(){
        System.out.println("Klik mouse kiri PC " + merkMouse);
    }

    public void tekanEnter(){
        System.out.println("Tekan enter pada keyboard PC " +merkKeyboard);
    }

    public void cetakData(){
        System.out.println("Cetak data melalui PC " +merkPrint);
    }
}