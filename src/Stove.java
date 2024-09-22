package src;

public abstract class Stove{
    private Burner burners;
    public static boolean hookup()
    {
        return false;
    }

    public static void setBurnerTemp(int burner, double temp)
    {

    }

    public static boolean isHot()
    {
        return false;
    }

    public static boolean isHot(int burner)
    {
        return false;
    }

    public static double getBurnerTemp(int burner)
    {
        return 0;
    }

    public static Burner getBurner(int burner)
    {
        return null;
    }
}