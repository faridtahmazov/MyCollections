package map.hashMapUtil;

import java.util.Objects;

public class Key {
    private int key;

    public Key(int key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key1 = (Key) o;
        return key == key1.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
