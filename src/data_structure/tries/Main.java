package data_structure.tries;

public class Main {

    public static void main(String[] args) {
        Tries tries = new Tries();

        tries.insert("candy");
        tries.insert("can't");
        tries.insert("cancel");
        tries.insert("car");
        tries.insert("card");
        tries.insert("careful");

        tries.remove("cancel");


        var findResult = tries.findWords("ca");

        System.out.println("Find : " + findResult);

        tries.traverse();
        System.out.println(tries.contains("cancel"));


    }

}
