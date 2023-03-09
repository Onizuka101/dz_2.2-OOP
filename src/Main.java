public class Main {
    public static void main(String[] args) {
        System.out.println("Gryffindor");
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер",22, 13, 14, 12, 12);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер",34,56,78,56,12);
        Gryffindor ronWeasley= new Gryffindor("Рон Уизли",45,56,34,12,56);
        Slytherin dracoMalfoy= new Slytherin("Драко Малфой",78,56,45,45,45,45,45);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю",56,56,56,56,56,56,56);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",45,78,78,78,78,78,78);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",1,22,32,23,23);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори",67,67,78,78,78);
        Hufflepuff justinFinchFletchley= new Hufflepuff("Джастин Финч-Флетчли",34,34,34,34,34);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг",45,45,45,45,45);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил",56,46,45,45,45);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби",45,56,56,56,56);
        System.out.println(harryPotter);
        System.out.println(hermioneGranger) ;
        System.out.println(ronWeasley);
        System.out.println(dracoMalfoy);
        System.out.println(gregoryGoyle);
        System.out.println(grahamMontagu);
        System.out.println(zachariasSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        System.out.println(zhouChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        harryPotter.compareHogwarts(dracoMalfoy);
        harryPotter.compareGryffindor(hermioneGranger);
        dracoMalfoy.compareSlytherin(grahamMontagu);
        zhouChang.compareRavenclaw(padmaPatil);
        justinFinchFletchley.compareHufflepuff(cedricDiggory);
    }
}