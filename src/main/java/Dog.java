public class Dog extends Animal{
    String animalName = "dog";
    String color = "brown";

    public Dog(String color, String animalName, String animalName1, String color1) {
        super(color, animalName);
        this.animalName = animalName1;
        this.color = color1;
    }
}
