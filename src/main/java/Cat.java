public class Cat extends Animal{
    String animalName = "cat";
    String color = "orange";

    public Cat(String color, String animalName, String animalName1, String color1) {
        super(color, animalName);
        this.animalName = animalName1;
        this.color = color1;
    }
}
