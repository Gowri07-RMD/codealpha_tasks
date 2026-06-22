import java.util.Scanner;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      Welcome to AI ChatBot");
        System.out.println("Type 'bye' to exit.");
        System.out.println("==================================");

        while (true) {

            System.out.print("\nYou: ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }
            else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I am doing great! Thanks for asking.");
            }
            else if (input.contains("your name")) {
                System.out.println("Bot: I am CodeAlpha AI ChatBot.");
            }
            else if (input.contains("java")) {
                System.out.println("Bot: Java is a powerful object-oriented programming language.");
            }
            else if (input.contains("internship")) {
                System.out.println("Bot: An internship helps students gain practical experience.");
            }
            else if (input.contains("college")) {
                System.out.println("Bot: College is a great place to learn and build skills.");
            }
            else if (input.contains("time")) {
                System.out.println("Bot: Please check your system clock for the current time.");
            }
            else if (input.contains("help")) {
                System.out.println("Bot: You can ask me about Java, internships, college, or general greetings.");
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that. Can you rephrase?");
            }
        }

        sc.close();
    }
}