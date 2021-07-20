import data_structure.arrays.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Array ar_numbers = new Array(3);
        ar_numbers.printElements();

        ar_numbers.insert(15);
        ar_numbers.insert(16);
        ar_numbers.insert(11);
        ar_numbers.insert(17);
        ar_numbers.insert(19);

        ar_numbers.removeAt(1);

        ar_numbers.printElements();

    }

}
