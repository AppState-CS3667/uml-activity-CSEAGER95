package src;
public interface Burner {
    public boolean turnOn();
    public boolean turnOff();
    public void increaseTemp();
    public void decreaseTemp();
    public double getDiameter();
    public double getMaxTemp();
    public double getMinTemp();
    public boolean isHot();
}