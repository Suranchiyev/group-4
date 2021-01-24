import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForLoop {
    public static void main(String[] args) {
        int [] lots = {1, 2, 3, 4, 5};


        for (int i = 0; i < lots.length ; i++) {

            System.out.println(Arrays.toString(lots));

        }
    }
}
