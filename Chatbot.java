import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! How can I assist you today?");

        String userInput = scanner.nextLine();

        while (!userInput.equalsIgnoreCase("bye")) {

            String response = getResponse(userInput);

            System.out.println(response);

            userInput = scanner.nextLine();

        }

        System.out.println("Goodbye! Have a nice day!");

        scanner.close();

    }

    public static String getResponse(String input) {

        // Add your logic here to generate a response based on the user input

        // You can use if-else statements or switch statements to handle different cases

        // Example responses

        if (input.contains("hello")) {

            return "Hi there!";

        } else if (input.contains("how are you")) {

            return "I'm a chatbot, I don't have feelings.";

        } else if (input.contains("time")) {

            return "The current time is " + java.time.LocalTime.now();

        } else {

            return "I'm sorry, I didn't understand that.";

        }

    }

}