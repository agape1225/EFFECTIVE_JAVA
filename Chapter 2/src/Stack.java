import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

public class Stack {
    private Objects[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Objects[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Objects e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Objects pop() {
        if(size == 0)
            throw new EmptyStackException();
        Objects result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
