/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sduıee3;

import java.util.Scanner;

public class SDUIEE3 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int sayi=scn.nextInt();
        int bas1,bas10,bas100;
        bas1=sayi%10;
        sayi/=10;
        bas10=sayi%10;
        bas100=sayi/10;
        System.out.println(bas1+bas10+bas100);
        
    }
    
}
