public class Palindrome { // класс "палиндром"
    public static void main(String[] args) {
        // инициализация массива строк
        args = new String[] {"java", "Palindrome", "madam", "racecar", "apple", "kayak", "song", "noon"};
        // перебор по всем строкам массива
        for (int i = 0; i < args.length; i++) {
           String s = args[i];
            System.out.println("Является ли слово " + s + " палиндромом? " + isPalindrome(s));
        }
    }
    public static String reverseString(String soursestring){ // метод переворачивания слова
        String s = "";
        for (int i = soursestring.length() - 1 ; i >= 0; i--){
            s += soursestring.charAt(i);
        }
        return s;
    }
    public static boolean isPalindrome(String s){ // метод сравнивает первоначальное слово и перевернутое
        return s.equals(reverseString(s));
    }

}