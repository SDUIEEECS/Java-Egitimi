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
public class Hafta1Casting {

    public static void main(String[] args) {
        /*
         --Javada iki çeşit dönüşüm vardır biri bilinçli tür
         dönüşümü diğeri ise bilinçsiz tür dönüşümüdür.
         --bilinçsiz tür dönüşümünü java kendisi yapar 
         ÖRN long a=10;
         10 normalde integer değerdir ama bunu java kendisi 
         longa dönüştürmüştür 
         -- bu söyle bir genelleme yapılabilir long 64bit veri tutar
         int 32  32 bitten 64 bite geçerken bir veri kaybı yoktur 
         ama 64 bitten 32 bite geçmeye çalışırsak java bunu yapmaz hata 
         verir. Bizden cast(dönüştürme) etmemizi ister.
         --Bizim cast etmemize is bilinçli tür dönüşümü denir
         --
         */
        
        //tam sayı arasında
        long a=10;// bilinçsiz tür dönüşümü 
        //integerde tuttuğun herşeyi longdada tutabiliriz
        System.out.println(a);
        //int b=a;
        //üstteki gibi yazarsak hata alırız nedeni ise 
        //long bir değişkeni integeri atamaya çalıştık 
        //long -64 bit 
        //int  -32 bit
        //64 bitlik bir veriyi 32 bitte tutamayız
        //onun için bilinçli tür dönüşümü yapmalıyız
        int b=(int) a;
        //cast şöyle yapılır dönüştürülmek istenen değişkenin önüne 
        //parantez içinde 
        //hangi veri tipine dönüşeği yazılır
        //değişken ----a
        //veri tip ---int
        // en büyükten en küçüğe doğru tam sayı tutan veri tipleri
        //long
        //int
        //short
        //byte
        //şöyle kısaltılabilir
        //herhangi bir veri tipi üstünde kalan veri tipine 
        // bilinçsiz tür dönüşümü ile aktarılabilir ÖRN
        byte c=10;
        short d=c;
        int e=d;
        long f=c;
        //üstekinlerde herhangi bir hata yoktur bilinçsiz tür dönüşümü var
        //ama yukarıdan aşağıya doğru bir tanımlama yaparsak
        d=(short) f;
        //d short bir veri tip
        //f long long bir değeri shortta kayıpsız tutamayacağız 
        //için bilinçli tür dönüşümü yapmalıyız
        
        //tam sayı ve kesirli
        //tam sayıdan kesirli bir sayıya geçileği zaman 
        // herhangi bir veri kaybı yoktur 
        //bunun için java blinçsiz tür dönüşümü yapar 
        double g=10;// 10 int bir değer doublea casting yapmadan atabiliriz
        //ama double yi tam sayı tutan veri tipine atarken casting
        //yapmak gerekir 
        //çünkü küsüratlı kısım kaybolcaktır 
        //baştadada değidiğimiz gibi kayıp varsa casting var 
       
        f=(long) g;
        // f  --long
        // g  --double
        
        //kesirli sayılar arası
        //double 64 bit 
        //float 32 bit veri tutabilirsiniz aynı mantık burada da geçerli
        float h=10.2F;//sondaki f float olduğunu gösterir
        g=h;//diyebliriz 
        //ama f=g giyemeyiz çünkü veri kaybı olabilir
        h=(float) g;//bizden bilinçli tür dönüşümü istedi 
        
        
        
        //int - char 
        //int ile char arasında bilinçsiz tür dönüşümü yapılabilir
        int k='A';// diyebileceğiz gibi
        char l=65;//de diyebiliz 
        //eğer k yız yazdırırsak 65 sonucunu elde ederiz bu sonuç
        //A nın ascii değeri ile ilgilidir
        //bkz https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/ASCII-Table-wide.svg/2000px-ASCII-Table-wide.svg.png
        
    }
}