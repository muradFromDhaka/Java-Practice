package GenericEx;

// Generic class with single type parameter
public class Box<T> {
    private T content;
    
    public Box() {}
    
    public Box(T content) {
        this.content = content;
    }
    
    public void setContent(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return "Box containing: " + content;
    }
}

// Generic class with multiple type parameters
 class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() { return key; }
    public V getValue() { return value; }
    
    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    
    @Override
    public String toString() {
        return "Pair[" + key + ", " + value + "]";
    }
}

// Generic interface
interface Container<T> {
    void add(T item);
    T get(int index);
    int size();
}


// Implementing generic interface
 class GenericContainer<T> implements Container<T> {
    private T[] elements;
    private int size;
    
    @SuppressWarnings("unchecked")
    public GenericContainer(int capacity) {
        elements = (T[]) new Object[capacity];
        size = 0;
    }
    
    @Override
    public void add(T item) {
        if (size < elements.length) {
            elements[size++] = item;
        }
    }
    
    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int size() {
        return size;
    }
}