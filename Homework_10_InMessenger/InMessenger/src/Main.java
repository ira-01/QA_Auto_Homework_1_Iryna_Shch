import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Creating HashMap for user storage
        HashMap<String, User> users = new HashMap<>();

        // Creating users and adding them to the HashMap
        users.put("Kate", new User("Kate"));
        users.put("Martin", new User("Martin"));
        users.put("Diana", new User("Diana"));

        // Adding contacts
        users.get("Kate").addContact(users.get("Martin"));
        users.get("Martin").addContact(users.get("Kate"));
        users.get("Martin").addContact(users.get("Diana"));
        users.get("Diana").addContact(users.get("Martin"));

        // Sending messages
        users.get("Kate").sendMessage(users.get("Martin"), "Hello, Martin!");
        users.get("Martin").sendMessage(users.get("Kate"), "Hi, Kate!");
        users.get("Diana").sendMessage(users.get("Martin"), "Hey, guy! How are you?");

        // Output messages of each user with status
        for (User user : users.values()) {
            System.out.println("Messages for " + user.getUserName() + ":");
            for (Message message : user.getMessages()) {
                System.out.println(message.getText() + " (Status: " + message.getStatus() + ")");
            }
        }

        // Reading messages
        System.out.println("\nMartin reads his messages:");
        for (Message message : users.get("Martin").getMessages()) {
            users.get("Martin").readMessage(message);
            System.out.println("Message from " + message.getSender().getUserName() + ": " + message.getText() + " (Status: " + message.getStatus() + ")");
        }

        // Search messages with status SENT to Martin
        System.out.println("\nSearching for SENT messages in Martin's inbox:");
        ArrayList<Message> sentMessages = users.get("Martin").findMessagesByStatus(MessageStatus.SENT);
        for (Message message : sentMessages) {
            System.out.println("Message to " + message.getRecipient().getUserName() + ": " + message.getText());
        }

        // Delete contact and message
        users.get("Martin").removeContact(users.get("Diana"));
        System.out.println("\nMartin removed Diana from contacts.");

        // Checking, if the list is not empty before deleting the message
        if (!sentMessages.isEmpty()) {
            users.get("Martin").removeMessage(sentMessages.get(0));
            System.out.println("Martin removed a SENT message.");
        } else {
            System.out.println("No SENT messages found to remove.");
        }
    }
}