package data_structure.arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }


    public int indexOf(int item) {
        //if find it, return
        //or return -1
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    public void insert(int item) {
        //if array is full, resize it !
        if (items.length == count) {


            int[] newItems = new int[count * 2];

            //Copy all existing elements
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            //set items to new array
            items = newItems;
        }

        //add new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        //Validate the index
        if (index < 0 || index >= count) throw new IllegalArgumentException();

        //Shift the items to the left to fill the hole
        // [10, 20, 30, 40] => [10, 30, 40]
        //index : 1
        // 1 <- 2
        // 2 <- 3
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;

    }

    public void printElements() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
