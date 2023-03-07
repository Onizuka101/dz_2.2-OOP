public class Hogwarts {
    private String name;
    private  int witchcraft;
    private int transgress;


    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name=name;
        this.witchcraft=witchcraft;
        this.transgress=transgress;
    }

    public String getName() {
        return name;
    }
    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }
    private int ability() { return witchcraft+transgress;
    }

    public void compareHogwarts (Hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    getName(),
                    hogwarts.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    hogwarts.getName(),
                    getName(),
                    ability2,
                    ability1
            );
        } else {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    hogwarts.getName(),
                    getName(),
                    ability1,
                    ability2
            );
        }
    }
    public void print(){
        System.out.println(this);
    }
        @Override
        public String toString() {
            return "name " + getName() + " witchcraft= " + getWitchcraft() + " transgress=" + getTransgress();
        }
}
