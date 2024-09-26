import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Creating HashMap for user storage
        HashMap<String, User> users = new HashMap<>();

        // Initialize users separately, since User is a reference type
        User kate = new User("Kate");
        User martin = new User("Martin");
        User diana = new User("Diana");

        // Put users in HashMap
        users.put("Kate", kate);
        users.put("Martin", martin);
        users.put("Diana", diana);

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
            if (message.getStatus() != MessageStatus.READ) {
                System.out.println("Message from " + message.getSender().getUserName() + ": " + message.getText());
                message.setStatus(MessageStatus.READ);
            }

            // Search messages with status SENT to Martin
            System.out.println("\nSearching for SENT messages in Martin's inbox:");
            ArrayList<Message> sentMessages = users.get("Martin").findMessagesByStatus(MessageStatus.SENT);
            for (Message sentMessage : sentMessages) {
                System.out.println("Message to " + sentMessage.getRecipient().getUserName() + ": " + sentMessage.getText());
            }

            // Delete contact and message
            users.get("Martin").removeContact(users.get("Diana"));

            // Removing SENT messages from Martin's inbox
            System.out.println("\nRemoving SENT messages from Martin's inbox:");
            for (Message sentMessage : users.get("Martin").findMessagesByStatus(MessageStatus.SENT)) {
                users.get("Martin").removeMessage(sentMessage); // Remove each SENT message
                System.out.println("Martin removed a SENT message.");
            }
        }
    }
}