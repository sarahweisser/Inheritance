package weisser.sarah.rotate_array;

import java.util.ArrayList;

/**
 * Created by sarahweisser on 5/1/17.
 */
public class RotatedArray extends ArrayList {


    public RotatedArray rotateArray(int k, RotatedArray array){
        RotatedArray newList = new RotatedArray();
        for(int i = 0; i < k; i++) {
            Object temp = array.remove(0);
            array.add(array.size(), temp);
        }
        return array;
    }
}
