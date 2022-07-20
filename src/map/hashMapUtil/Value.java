package map.hashMapUtil;

public class Value {
    private int value;

    public Value(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return value == value1.value;
    }
}
