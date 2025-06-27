package JAVA_DSA_Course;

public class dpsession13 {
    public static void main(String[] args) {
        int t = 1; // Number of test cases
        int b = 3; // Number of operations
        int[] dpMax = new int[b + 1]; // Array for maximum values
        int[] dpMin = new int[b + 1]; // Array for minimum values
        
        while (t-- > 0) {
            dpMax[0] = 1; // Initial max value
            dpMin[0] = dpMax[0]; // Initial min value

            String operations = "+5 -6 *8"; // Sample operations string
            String[] ops = operations.split("\\s+"); // Split by whitespace
            
            // Process each operation
            for (int i = 0; i < ops.length; i++) {
                char operator = ops[i].charAt(0); // Get the operation character
                int value = Integer.parseInt(ops[i].substring(1)); // Get the numeric value
                
                for (int j = 1; j <= i + 1; j++) {
                    // Handling operations using if-else
                    if (operator == '+') {
                        dpMax[j] = Math.max(dpMax[j] + value, Math.max(dpMin[j] + value, dpMax[j - 1]));
                        dpMin[j] = Math.min(dpMax[j] + value, Math.min(dpMin[j] + value, dpMin[j - 1]));
                    } else if (operator == '-') {
                        dpMax[j] = Math.max(dpMax[j] - value, Math.max(dpMin[j] - value, dpMax[j - 1]));
                        dpMin[j] = Math.min(dpMax[j] - value, Math.min(dpMin[j] - value, dpMin[j - 1]));
                    } else if (operator == '*') {
                        dpMax[j] = Math.max(dpMax[j] * value, Math.max(dpMin[j] * value, dpMax[j - 1]));
                        dpMin[j] = Math.min(dpMax[j] * value, Math.min(dpMin[j] * value, dpMin[j - 1]));
                    } else if (operator == '/') {
                        // Prevent division by zero
                        if (value != 0) {
                            dpMax[j] = Math.max(dpMax[j] / value, Math.max(dpMin[j] / value, dpMax[j - 1]));
                            dpMin[j] = Math.min(dpMax[j] / value, Math.min(dpMin[j] / value, dpMin[j - 1]));
                        }
                    } else if (operator == 'N') { // Negation operation
                        dpMax[j] = Math.max(-1*dpMax[j - 1], Math.max(-dpMin[j - 1], dpMax[j - 1]));
                        dpMin[j] = Math.min(-1*dpMax[j - 1], Math.min(-dpMin[j - 1], dpMin[j - 1]));
                    }
                }
            }
             System.out.println("Maximum value: " + dpMax[b]);
            // System.out.println("Minimum value: " + dpMin[b]);
        }
    }
}
