import java.util.Random;

public class MagicBox<T> {
    //public static final Integer size = 0;
    T[] items;

    public MagicBox(int size) {
        items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("" +
                        "Коробка не полна. Осталось заполнить %s", items.length - i));
            }
        }

        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
