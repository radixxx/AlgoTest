package algorithms.searching;


public class Main {
    public static void main(String[] args) {
        int[] array = {10, 5, 6, 1};
        int[] sort_array = {2, 3, 8, 10, 13};

        var linear = new Search();
        var res = linear.linearSearch(array, 5);
        System.out.println(res);


        var binarySearch = new Binary();
        System.out.println("Recursive: " + binarySearch.binarySearchRec(sort_array, 8));
        System.out.println("Iterative: " + binarySearch.binarySearch(sort_array, 8));

        var ternary = new Ternary();
        System.out.println(ternary.ternarySearch(sort_array, 13));
    }

}
