package hero;

import java.util.Collections;
import java.util.HashSet;

public class EnhancedHuman implements Hero{

    private boolean identity = false;
    private int totalPower = 0;
    private final String name;
    private final String heroName;
    private HashSet<SuperPower> powers = new HashSet<SuperPower>();

    public EnhancedHuman(String name, String heroName, SuperPower[] superPowers)
    {
        this.name = name;
        this.heroName = heroName;
        Collections.addAll(powers, superPowers);
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
        if (identity) {
            for (SuperPower p : SuperPower.values()) {
                if (powers.contains(p)) {
                    totalPower += p.getValue();
                }
            }
            return totalPower;
        }
        else
        {
            return 0;
        }
    }

    public Boolean hasPower(SuperPower power){
        if (identity){
            return powers.contains(power);
        }
        else return false;
    }

    public void losePowers(SuperPower[] superPowers) {
        for (SuperPower p : superPowers) {
            if (powers.contains(p)) {
                powers.remove(p);
            }
        }
    }

    public void acquirePowers(SuperPower[] superPowers) {
        for (SuperPower p : superPowers) {
            powers.add(p);
        }
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
