package data_structure.map;


public class Main {
    public static void main(String[] args) {

        CharFinder charFinder = new CharFinder();
        var result = charFinder.findFirstRepeatingChar("A Green Apple");
        System.out.println(result);


        HashTableImpl hashTable = new HashTableImpl();

        hashTable.put(1, "First");
        hashTable.put(5, "Second");
        hashTable.put(9, "Third");

        hashTable.remove(1);

        System.out.println(hashTable);
        System.out.println(hashTable.get(9));

    }

}
