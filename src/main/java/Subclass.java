import com.sun.jdi.ClassType;

import java.lang.invoke.TypeDescriptor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Subclass< T extends Animal > {

    T animalInput;

    public Subclass(T animalInput) {
        this.animalInput = animalInput;
    }



public<V> String getAnimal(T animalInput){
        String animalOutput = animalInput.getClass() + animalInput.getAnimalName() + animalInput.getColor();
        return animalOutput;
}
}
