package Week_10;

public class HaveObject {
    Object value;
    public HaveObject(Object value)
    {
        super();
        this.value = value;
    }
    public Object getValue()
    {
        return value;
    }
    public void setValue(Object value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "Object : " + value;
    }
}
