public class Ravenclaw extends Hogwarts{
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int witchcraft, int transgress, int wise, int witty, int creative) {
        super(name, witchcraft, transgress);
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }
    private int ability() { return wise + witty + creative;
    }
    public void compareRavenclaw (Ravenclaw ravenclaw) {
        int ability1=ability();
        int ability2=ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s: %d VS %d%n",
                    getName(),
                    ravenclaw.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2>ability1) {
            System.out.printf("Когтевранец %s лучше, чем Когтевранец %s: %d VS %d%n",
                    ravenclaw.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf("Когтевранец  %s лучше, чем Когтевранец  %s: %d VS %d%n",
                    ravenclaw.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }
    @Override
    public String toString() {
        return "name " + getName() + " witchcraft= "  + getWitchcraft() + " transgress=" + getTransgress()+
                " wise= " + wise +
                ", witty=" + witty +
                ", creative=" + creative;
    }
}