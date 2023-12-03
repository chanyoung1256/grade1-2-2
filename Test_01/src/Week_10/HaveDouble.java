package Week_10;

public class HaveDouble {
    double value;
    public HaveDouble(double value)
    {
        super();
        this.value = value;
    }
    public double getValue()
    {
        return value;
    }
    public void setValue(double value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "double value : " + value;
    }

}
