public class GenericMethodTest {
    public class GenericMethodTest {
        // generic method printArray
        public static <E> void printArray(E[] inputArray) {
            // Display array elements
            for (E element : inputArray) {
                System.out.printf("%s ", element);
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Integer[] intArray = { 1, 2, 3, 4, 5 };
            Double[] dobubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
            Character[] CharArray = { 'H', 'E', 'L', 'L', 'O' };

            System.out.println("Array integerArray contains:");
            printArray(intArray); // pass an Integer array

            System.out.println("\nArray doubleArray contains:");
            printArray(doubleArray); // pass a Double array

            System.out.println("\nArray characterArray contains:");
            printArray(charArray); // pass a Character array
        }

    }
}