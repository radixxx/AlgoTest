package data_structure.stack;

import java.util.Arrays;

public class StackImpl {

    private int [] items = new int[10];
    private int count;

    public void push(int item){
        if(count == items.length) throw new StackOverflowError();
        items[count++] = item;
    }

    public int pop(){
        if(count == 0) throw new IllegalStateException();
        return items[--count];
    }

    public int peek(){
        if(count == 0) throw new IllegalStateException();
        return items[count - 1];
    }

    @Override
    public String toString(){
        var converted = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(converted);
    }

}
