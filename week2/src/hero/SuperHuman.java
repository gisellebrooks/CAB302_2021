package hero;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;

public class SuperHuman implements Hero {

    private boolean identity = false;
    private final String name;
    private final String heroName;
    private HashSet<SuperPower> powers = new HashSet<SuperPower>();


    public SuperHuman(String name, String heroName, SuperPower[] superPowers)
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
        int total = 0;
        for (SuperPower p : SuperPower.values()) {
            if (powers.contains(p)){
                total += p.getValue();
            }
        }
        return total;
    }

    public Boolean hasPower(SuperPower power){
        return powers.contains(power);
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
