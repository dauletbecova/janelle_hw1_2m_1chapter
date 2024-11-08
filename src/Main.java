public class Main {
    public static void main(String[] args) {
        General general = new General("draw", "Persian cat");
        Cat cat = new Cat(1, "Cuci", Color.ORANGE, general);
        System.out.println(cat.getInfo());
        cat.catAction();
        cat.catAction(" on street");

        System.out.println();

        General general1 = new General("eating", "Siamese cat");
        Kitty kitty = new Kitty(1, "luky", Color.BLACK, "Calm", general1);
        System.out.println(kitty.getInfo());
        kitty.catAction(" at Geeks");
    }
}