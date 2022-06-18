package app.config;

import app.model.Animal;
import org.springframework.stereotype.Component;

@Component("someDog")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
