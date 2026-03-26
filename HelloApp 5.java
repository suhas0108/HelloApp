public class HelloApp {
    public static void main(String[] args) {
        String message;

        if (args.length == 0) {
            message = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            message = nameBuilder.toString();
        }

        System.out.println("Hello, " + message + "!");
    }
}