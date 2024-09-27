import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Save annotation at runtime
@Retention(RetentionPolicy.RUNTIME)

// Number of times to execute the method
public @interface RunImmediately {
    int times() default 3;
}

