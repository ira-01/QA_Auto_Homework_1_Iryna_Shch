import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Circus<CircusPerformer> circus = new Circus<>();

        // Add artist Jim
        try {
            circus.addPerformer(new CircusPerformer("Jim", "Magician", 7));
        } catch (InvalidExperienceException e) {
            System.out.println("Error adding performer Jim: " + e.getMessage());
        }

        // Add artist Lily
        try {
            circus.addPerformer(new CircusPerformer("Lily", "Acrobatics", -5)); // тут буде викинуто виняток
        } catch (InvalidExperienceException e) {
            System.out.println("Error adding performer Lily: " + e.getMessage());
        }

        // Save artists to file
        circus.saveToFile("circusPerformers.txt");

        // Loading artist from a file
        Circus<CircusPerformer> loadedCircus = new Circus<>();
        loadedCircus.loadFromFile("circusPerformers.txt");

        // Method marked with an annotation @RunImmediately
        for (CircusPerformer performer : loadedCircus.listPerformers()) {
            for (Method method : performer.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(RunImmediately.class)) {
                    RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                    for (int i = 0; i < annotation.times(); i++) {
                        try {
                            System.out.println(method.invoke(performer));
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}