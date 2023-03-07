public class Hufflepuff extends Hogwarts {
    private int industrious;
    private int faithful;
    private int honest;



    public int getIndustrious() {
        return industrious;
    }

    public int getFaithful() {
        return faithful;
    }

    public int getHonest() {
        return honest;
    }

    public Hufflepuff(String name, int witchcraft, int transgress, int industrious, int faithful, int honest) {
        super(name, witchcraft, transgress);
        this.industrious = industrious;
        this.faithful = faithful;
        this.honest = honest;
    }
    private int ability() { return industrious + faithful + honest;
    }
    public void compareHufflepuff (Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s лучше, чем Пуффендуец %s: %d VS %d%n",
                    getName(),
                    hufflepuff.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец%s лучше, чем Пуффендуец %s: %d VS %d%n",
                    hufflepuff.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf("Пуффендуец %s лучше, чем Пуффендуец %s: %d VS %d%n",
                    hufflepuff.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }
    @Override
    public String toString() {
        return "name " + getName() +  " witchcraft= "  + getWitchcraft() + " transgress=" + getTransgress()+
                " industrious= " + industrious +
                ", faithful=" + faithful +
                ", honest=" + honest ;
    }
}
