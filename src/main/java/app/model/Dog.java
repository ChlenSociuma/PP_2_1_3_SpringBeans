package app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dog")
@Primary
public class Dog extends Animal {
    @Override
    public String toString() { return "Im a Dog"; }
}
