package list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by kot on 12/27/2014.
 */
public class test {
    public static void main(String[] args) {
        ListMe<String> arr = new ArrayListMe<String>();

                for (int i = 0; i < 20; i++){
                    arr.addA("hello " + i);
                }
        for (int i = 0; i < 15; i++) {
            arr.removeA(i);
        }

        for (int i = 0; i < 16; i++) {
            System.out.println(arr.getA(i));
        }
       /* LinkedListMe lm = new LinkedListMe();
        for (int i = 0; i < 10; i++) {
            lm.addA("hi " + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(lm.getA(i));
        }*/
    }

}
