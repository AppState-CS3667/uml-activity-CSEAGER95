package src;
public abstract class ElectricBurner implements Burner{
    private double voltReq;
    private double ampReq;
    public ElectricBurner(double voltReq)
    {
        this.voltReq = voltReq;
    }

    public void increaseCurrent()
    {

    }

    public void decreaseCurrent()
    {

    }

    public double getVoltReq()
    {
        return 0;
    }
}