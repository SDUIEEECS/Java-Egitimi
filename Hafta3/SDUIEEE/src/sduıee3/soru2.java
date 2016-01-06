/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sduıee3;

import java.util.Scanner;

/**
 *
 * @author celal
 */
public class soru2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        int yil=scn.nextInt();
        System.out.println("Ay Giriniz : ");
        int ay=scn.nextInt();
        System.out.println("Gun Giriniz : ");
        int gun=scn.nextInt();
        if (ay == 1)
        {
            ay = 13;
            yil = yil - 1;
        }
        else if (ay == 2)
        {
            ay = 14;
            yil = yil - 1;
        }
        int j = yil / 100;
        int k = yil % 100;
        int h = (gun + (26*(ay+1))/10 + k + k/4 + j/4 + 5*j)%7;
        
        switch(h)
        {   case 0 : System.out.println("Cumartesi"); break;
            case 1 : System.out.println("Pazar"); break;
            case 2 : System.out.println("Pazartesi"); break;
            case 3 : System.out.println("Salı"); break;
            case 4 : System.out.println("Çarşamba"); break;
            case 5 : System.out.println("Perşembe"); break;    
            case 6 : System.out.println("Cuma"); break;  
            default : System.err.println("Dogru Deger Gir");
        }
        
        
         
        
    }
}
