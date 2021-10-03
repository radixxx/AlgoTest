package algorithms.string_manipulation;

public class Main {
    public static void main(String[] args) {

       int count = StringUtils.countVowels("Hill");
        System.out.println(count);


        String reversed = StringUtils.reverse("Aelb");
        System.out.println(reversed);


        String reverseWord = StringUtils.reverseWords("Aelb Aelb");
        System.out.println(reverseWord);


        var rotation = StringUtils.areRotation("ABCD", "DCBA");
        System.out.println(rotation);


        var duplicates = StringUtils.removeDuplicates("scrooge");
        System.out.println(duplicates);


        var frequence = StringUtils.getMaxOccuringChar("smoooth");
        System.out.println(frequence);
    }

}
