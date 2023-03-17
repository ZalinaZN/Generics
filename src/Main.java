public class Main {
    public static void main(String[] args) {

        MagicBox<String> stringMagicBox = new MagicBox<>(5);

        stringMagicBox.add("12345");
        stringMagicBox.add("flower");
        //stringMagicBox.pick();
        stringMagicBox.add("dont string attachet");
        stringMagicBox.add(":’-D");
        stringMagicBox.add("Bye");

        String pick = stringMagicBox.pick();
        System.out.println(pick);
    }
}