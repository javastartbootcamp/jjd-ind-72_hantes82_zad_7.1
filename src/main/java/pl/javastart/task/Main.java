package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();

        int[] array = new int[]{1, 2, 3, 4, 5};

        boolean isPalindrome = palindromeService.isPalindrome(array);

        if (isPalindrome) {
            System.out.println("Liczba powstała z połączenia cyfr w tablicy jest palindromem");
        } else {
            System.out.println("Liczba powstała z połączenia cyfr w tablicy nie jest palindromem");
        }
    }
}
//0 = 4
//1 = 3