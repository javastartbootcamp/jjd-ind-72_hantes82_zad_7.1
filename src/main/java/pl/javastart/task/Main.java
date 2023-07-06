package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();

        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 3, 2, 1};
        int[] arr3 = new int[]{1, 2, 3, 4, 3, 2, 1};
        int[] arr4 = null;
        int[] arr5 = {};
        boolean isPalindrome = palindromeService.isPalindrome(array);

        if (isPalindrome) {
            System.out.println("Liczba powstała z połączenia cyfr w tablicy jest palindromem");
        } else {
            System.out.println("Liczba powstała z połączenia cyfr w tablicy nie jest palindromem");
        }
    }
}
