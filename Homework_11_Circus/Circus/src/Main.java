import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Circus<CircusPerformer> circus = new Circus<>();
        circus.addPerformer(new CircusPerformer("Jim", "Magician", 7));
        circus.addPerformer(new CircusPerformer("Lily", "Acrobatics", -5));

        // Save artist to file
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