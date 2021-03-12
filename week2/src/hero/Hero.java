package hero;

public interface Hero {

    public String currentIdentity();

    public int totalPower();

    public Boolean hasPower(SuperPower power);


    public boolean switchIdentity();

    public void losePowers(SuperPower[] superPowers);

    public void acquirePowers(SuperPower[] superPowers);
}
