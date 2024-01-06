package assignment1;

public class SumOfStringIntegers {
    public static void main(String[] args) {
        String str1 = "Hello";
         String str2 = "Hello";
         String str3 = new String("Hello");

         boolean x = (str1 == str2);
         boolean y = (str1 == str3);
         boolean z = str1.equals(str3);
         System.out.println(x + " " + y + " " + z);

    }
}
