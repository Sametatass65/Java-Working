import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbs = new ArrayList<Integer>(); // listenin type'ini belirterek daha güvenli bir iş taytık = type safe
        numbs.add(1);
        numbs.add(25);
        numbs.add(5);
        // Collections.sort(numbs); // küçükten büyüğe doğru sıralamıza yarıyor.
        //numbs.set(1,8); // indeksteki değeri ayaralamıza yarıyor.
        //numbs.remove(1); // indeksteki değeri silmemize yarıyor adresi ile birlikte siliyor.
        //numbs.clear(); // listedki bütün değerleri siler
        for (int  i : numbs)
        {
            System.out.println(i);
        }
    }
}