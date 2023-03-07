public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public Slytherin(String name, int witchcraft, int transgress, int cunning, int determination, int ambition, int resourcefulness,int lustForPower)  {
        super(name, witchcraft, transgress);
        this.determination = determination;
        this.ambition = ambition;
        this.cunning = cunning;
        this.resourcefulness=resourcefulness;
        this.lustForPower=lustForPower;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int getCunning() {
        return cunning;
    }
    private int ability() { return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public void compareSlytherin (Slytherin  slytherin ) {
        int ability1=ability();
        int ability2= slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизаренец %s лучше, чем Слизаренец %s: %d VS %d%n",
                    getName(),
                    slytherin.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2>ability1) {
            System.out.printf("Слизаренец %s лучше, чем Слизаренец %s: %d VS %d%n",
                    slytherin.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf("Слизаренец  %s лучше, чем Слизаренец  %s: %d VS %d%n",
                    slytherin.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }

    @Override
    public String toString() {
        return "name " + getName() + " witchcraft= "  + getWitchcraft() + " transgress=" + getTransgress()+
                " cunning= " + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }
}
