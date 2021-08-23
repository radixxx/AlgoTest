package data_structure.tries;

public class Main {

    public static void main(String[] args) {
        Tries tries = new Tries();

        tries.insert("candi");
        tries.insert("can't");
        tries.insert("cancel");
        tries.remove("cancel");

        tries.traverse();
        System.out.println(tries.contains("cancel"));


    }

}
