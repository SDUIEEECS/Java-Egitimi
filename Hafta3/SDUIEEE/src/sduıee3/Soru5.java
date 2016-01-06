/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sduıee3;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int enBuyuk,i=0,temp;
        enBuyuk=s.nextInt();
        while(i<4){
            i++;
            temp=s.nextInt();
            if(enBuyuk<temp){
                enBuyuk=temp;
            }
        }
        System.out.println(enBuyuk);
       
            
        
    }
}
