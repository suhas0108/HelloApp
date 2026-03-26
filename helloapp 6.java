public class HelloAppUC6 {
    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build names
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop to append names
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}