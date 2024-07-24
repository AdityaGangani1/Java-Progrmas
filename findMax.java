public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 6, 5, 1, 8, 3, 7};

        //temp
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Large number is " + largest);
    }
}