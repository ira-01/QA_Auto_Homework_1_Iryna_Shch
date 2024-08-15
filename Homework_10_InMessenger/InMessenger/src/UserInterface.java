import java.util.ArrayList;
import java.util.HashSet;

interface UserInterface {
    String getUserName();
    HashSet<User> getContacts();
    ArrayList<Message> getMessages();

    void addContact(User user);
    void sendMessage(User recipient, String text);
    void receiveMessage(Message message);
}
