import java.util.Stack;

public class Main {
    // Method to check if the given target array is a stack permutation of the original array
    public static boolean isStackPermutation(int[] original, int[] target) {
        // Create a stack to simulate the stack permutation process
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        // Iterate through the elements of the original array
        for (int element : original) {
            // Push the current element onto the stack
            stack.push(element);

            // Check if the top of the stack matches the current target element
            // If yes, pop elements from the stack and increment the target index
            while (!stack.isEmpty() && stack.peek() == target[i]) {
                stack.pop();
                i++;
            }
        }

        // If the stack is empty, it means the target is a stack permutation of the original
        return stack.isEmpty();
    }

    // Main method where the stack permutation is checked and the result is printed
    public static void main(String[] args) {
        // Example input arrays
        int[] original = {1, 2, 3};
        int[] target = {2, 1, 3};

        // Check if the target is a stack permutation of the original
        boolean result = isStackPermutation(original, target);

        // Print the result
        System.out.println("Is it a stack permutation? " + result);
    }
}
