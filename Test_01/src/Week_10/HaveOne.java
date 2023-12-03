package Week_10;

public class HaveOne<T>{
    private T value;
    public HaveOne(T value)
    {
        this.value = value;
    }
    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "HaveOne value" + value;
    }
}
