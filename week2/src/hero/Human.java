package hero;

public class Human implements Hero
{
    private boolean identity = false;
    private final String name;
    private final String heroName;

    public Human (String name, String heroName)
    {
        this.name = name;
        this.heroName = heroName;
    }
    public String currentIdentity()
    {
        if (!identity){
            return name;
        }
        else
        {
            return heroName;
        }
    }
    public int totalPower()
    {
        return 0;
    }
    public Boolean hasPower(SuperPower power)
    {
        return false;
    }

    public void losePowers(SuperPower[] superPowers) {
        return;
    }

    public void acquirePowers(SuperPower[] superPowers) {
        return;
    }
    public boolean switchIdentity()
    {   if (identity)
        {
            identity = false;
        }
        else
        {
            identity = true;
        }
        return identity;
    }
}
