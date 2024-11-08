public final class Kitty extends Animal {
    private String character;

    public Kitty(int age, String name, Color color, String character, General general) {
        super(age, name, color);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public String getInfo() {
        return "name: " + getName() + ", age: " + getAge() + ", color: " + getColor()
                + ", character: " + getCharacter();
    }

    public Kitty(int age, String name, Color color) {
        super(age, name, color);
    }

    public void catAction(String place) {
        System.out.println("cat walks" + place);
    }
}