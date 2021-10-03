package algorithms.string_manipulation;

public class Main {
    public static void main(String[] args) {

       int count = StringUtils.countVowels("Hill");
        System.out.println(count);


        String reversed = StringUtils.reverse("Aelb");
        System.out.println(reversed);


        String reverseWord = StringUtils.reverseWords("Aelb Aelb");
        System.out.println(reverseWord);


        var x = StringUtils.areRotation("ABCD", "DCBA");
        System.out.println(x);
    }

}
