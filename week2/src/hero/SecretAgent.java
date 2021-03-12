package hero;

public class SecretAgent implements Hero {

    private boolean identity = false;
    private int totalPower = 0;
    private String name;
    private String nickName;
    private String gadget;

    public SecretAgent(String name, String nickName, String gadget){
        this.name = name;
        this.nickName = nickName;
        this.gadget = gadget;
    }

    public String currentIdentity()
    {
        if (!identity){
            return name;
        }
        else
        {
            return nickName;
        }
    }

    public int totalPower()
    {
        return 0;
    }

    public Boolean hasPower(SuperPower power){
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

    public String getGadget(){
        return gadget;
    }
}
