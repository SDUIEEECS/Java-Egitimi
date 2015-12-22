package sduıeee;

/**
 *
 * @author celal
 */
public class Hafta1Int {

    public static void main(String[] args) {
        //int tanımlama ve yazdırma
        int a = 5;
        System.out.println(a);
        //ikinci bir int tanımlayıp işlem yapma
        int b = 10;
        System.out.println(a + b);
        //farklı bir yol olarak başka referansta toplama
        int c = a + b;
        System.out.println(c);
        //çıkarma ve çarpma işlemleri
        System.out.println(a - b);
        System.out.println(a * b);
        //üsteki kod ile bu kodlarının aynı olduğu 
        //sadece toplanarak yazdırılıcak ise System.out.println in içinde yazılmasının daha mantıklı olacağı
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        //int ile bölme işlemi
        c = b / a;
        System.out.println(c);
        //int kesirli bölme 
        a = 10;
        b = 3;
        c = a / b;
        System.out.println(c);
        // long byte short işlemleride aynı intte olduğu gibidir
        long d = 1000L;// sondaki 'L' long olduğunu gösterir
        short e = 100;
        byte f = 10;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //....
    }
}
