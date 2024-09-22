package src;
public abstract class GasBurner implements Burner {
    private String gasType;

    public GasBurner()
    {

    }

    public boolean spark()
    {
        return false;
    }

    public String getGasType()
    {
        return "";
    }

    private void increaseGasFlow()
    {

    }
}