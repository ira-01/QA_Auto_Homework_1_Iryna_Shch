import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedReader;

public class Circus<T> {
    private List<T> performers = new ArrayList<>();

    // Add artist
    public void addPerformer(T performer) {
        performers.add(performer);
    }

    // Remove artist
    public void removePerformer(T performer) {
        performers.remove(performer);
    }

    // Return list
    public List<T> listPerformers() {
        return performers;
    }

    // Save artist to file
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (T performer : performers) {
                if (performer instanceof CircusPerformer) {
                    writer.write(((CircusPerformer) performer).getPerformerInfo());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load artist from a file
    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String name = parts[0].split(": ")[1];
                String act = parts[1].split(": ")[1];
                int experience = Integer.parseInt(parts[2].split(": ")[1].split(" ")[0]);
                addPerformer((T) new CircusPerformer(name, act, experience));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

