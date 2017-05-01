package weisser.sarah.rotate_array;

import java.util.ArrayList;

/**
 * Created by sarahweisser on 5/1/17.
 */
public class Main {

    public static void main(String[] args) {

        RotatedArray originalList = new RotatedArray();
        originalList.add("a");
        originalList.add("b");
        originalList.add("c");
        originalList.add("d");
        originalList.add("e");
        originalList.add("f");
        System.out.println(originalList);
        RotatedArray newList = originalList.rotateArray(3, originalList);
        System.out.println(newList);
    }
}
