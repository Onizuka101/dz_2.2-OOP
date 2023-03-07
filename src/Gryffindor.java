public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String name, int witchcraft, int transgress, int nobility,int honor,int bravery) {
        super (name,witchcraft,transgress);
        this.nobility=nobility;
        this.honor=honor;
        this.bravery=bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    private int ability() { return nobility + honor + bravery;
    }
    public void compareGryffindor (Gryffindor gryffindor) {
        int ability1=ability();
        int ability2=gryffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s: %d VS %d%n",
                    getName(),
                    gryffindor.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2>ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s: %d VS %d%n",
                    gryffindor.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s: %d VS %d%n",
                    gryffindor.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }

    @Override
    public String toString() {
        return "name " + getName() + " witchcraft= "   + getWitchcraft() + " transgress=" + getTransgress()+
                " nobility= " + nobility +
                ", honor= " + honor +
                ", bravery= " + bravery;
    }
}
