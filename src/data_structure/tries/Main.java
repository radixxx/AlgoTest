package data_structure.tries;

public class Main {

    public static void main(String[] args) {

        Tries tries = new Tries();

        tries.insert("candi");
        tries.insert("can't");
        tries.insert("cancel");


        System.out.println(tries.contains("cancel"));


    }

}
