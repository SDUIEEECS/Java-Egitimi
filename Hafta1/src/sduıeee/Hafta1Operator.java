/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sduıeee;

/**
 *
 * @author celal
 */
public class Hafta1Operator {

    public static void main(String[] args) {
        
        int a = 10;
        a++;//bir arttırma a=a+1 e eşit
        System.out.println(a);
        int b = 10;
        b--;//bir azatlma b=b-1 e eşit
        System.out.println(b);
        
        //toplam
        a += 10;//a=a+10
        System.out.println(a);
        a += b;//a=a+b
        System.out.println(a);
        a += b + 10;//a=a+b+10;
        //çıkarma
        
        a -= 10;//a=a-10
        System.out.println(a);
        a -= b;//a=a-b
        System.out.println(a);
        a -= b + 10;//a=a-b-10;
        System.out.println(a);
        
        //çarpma
        a *= 10;//a=a*10
        System.out.println(a);
        a *= b;//a=a*b
        System.out.println(a);
        a *= b + 10;//a=a*(b+10);
        System.out.println(a);
        
        //bölme
         a /= 10;//a=a/10
        System.out.println(a);
        a /= b;//a=a/b
        System.out.println(a);
        a /= b + 10;//a=a/(b+10);
        System.out.println(a);
    }
}
