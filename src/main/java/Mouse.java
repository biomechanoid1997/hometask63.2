public class Mouse extends Animal{
    String animalName = "mouse";
    String color = "grey";

    public Mouse(String color, String animalName, String animalName1, String color1) {
        super(color, animalName);
        this.animalName = animalName1;
        this.color = color1;
    }
}
