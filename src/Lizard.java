public class Lizard extends Monster{
    public Lizard(String name)
    {
        super(new AttackSimple(), new AttackSpeedSlash());
        this.setName("The Fastest "+name);
        this.setHp(110);
        this.setProtection(10);
        this.setDodge(25);
    }
    public void checkMonster()
    {
        System.out.println("Monster's race is " + getClass().toString().substring(6) + ",\n name is '"+ getName() + "',\n his max hp is " + getHp() + ",\n his protection is " + getProtection() + "%,\n his dodge is " + getDodge() + "%.\n");
    }
}