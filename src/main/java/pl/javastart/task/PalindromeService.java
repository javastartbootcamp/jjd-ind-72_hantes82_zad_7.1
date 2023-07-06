package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (array != null || array != new int[]{}) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array[array.length - 1 - i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
