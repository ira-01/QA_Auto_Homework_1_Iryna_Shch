import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
import java.util.List;
import java.util.*;

class User implements UserInterface {
    private String userName;
    private HashSet<User> contacts;
    private ArrayList<Message> messages;

    public User(String userName) {
        this.userName = userName;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public HashSet<User> getContacts() {
        return contacts;
    }

    @Override
    public ArrayList<Message> getMessages() {
        return messages;
    }

    @Override
    public void addContact(User user) {
        contacts.add(user);
    }

    public void removeContact(User user) {
        contacts.remove(user);
    }

    @Override
    public void sendMessage(User recipient, String text) {
        Message message = new Message(this, recipient, text, MessageStatus.SENT);
        recipient.receiveMessage(message);
        this.messages.add(message);
    }

    @Override
    public void receiveMessage(Message message) {
        message.setStatus(MessageStatus.RECEIVED);
        this.messages.add(message);
    }

    public void readMessage(Message message) {
        if (messages.contains(message) && message.getStatus() == MessageStatus.RECEIVED) {
            message.setStatus(MessageStatus.READ);
        } else {
            // If the message is not found or its status is not RECEIVED
            System.out.println("Cannot read this message.");
        }
    }

    public void removeMessage(Message message) {
        messages.remove(message);

    }


    public ArrayList<Message> findMessagesByStatus(MessageStatus status) {
        ArrayList<Message> result = new ArrayList<>();
        for (Message message : messages) {
            if (message.getStatus() == status) {
                result.add(message);
            }
        }
        return result;
    }
}