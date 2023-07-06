package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        int half = array.length / 2;

        for (int i = 0; i < half; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
