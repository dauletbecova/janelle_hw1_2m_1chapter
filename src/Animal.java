public class Animal {
    private int age;
    private String name;
    private Color color;

    public Animal(int age, String name, Color color) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}