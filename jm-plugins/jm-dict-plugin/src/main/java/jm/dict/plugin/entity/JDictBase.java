package jm.dict.plugin.entity;

public abstract class JDictBase<T> {

    private String type;

    private T value;

    private String label;

    public JDictBase() {}

    public JDictBase(T value) {
        this.value = value;
    }

    public JDictBase(String type, T value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
