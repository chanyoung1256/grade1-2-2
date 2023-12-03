package Week_10;

public class HaveInteger {
    int value;

    public HaveInteger(int value)
    {
        this.value = value;
    }
    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "value : " + value;
    }
}
