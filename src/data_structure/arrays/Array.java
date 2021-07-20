package data_structure.arrays;

public class Array {
    private int[] items;

    public Array(int lenght) {
        items = new int[lenght];
    }

    public void printElements(){
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i]);

           // System.out.println(items.length);
        }

    }

}
