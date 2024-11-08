public class Cat extends Animal {
    private General general;

    public final void catAction() {
        System.out.println("cat runs");
    }

    public void catAction(String place) {
        System.out.println("cat walks" + place);
    }

    public String getInfo() {
        return "name: " + getName() + ", age: " + getAge() + ", color: " + getColor() + ", breed: " + general.getBreed()
                + ", hobby:" + general.getHobby();
    }

    public Cat(int age, String name, Color color, General general) {
        super(age, name, color);
        this.general = general;
    }

    public General getGeneral() {
        return general;
    }
}