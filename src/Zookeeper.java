public class Zookeeper {
    //properties
    private String name;

    public Zookeeper(String name) {
            this.name = name;
        }

    public void feedAnimals(Animal[] animals, String food) {
        for (Animal a : animals) {
            System.out.println(name + " is feeding " + food + " to " + Animal.population + " total animals");
            System.out.println(name + " is feeding " + food + " to " + animals.length + "animals");
        }
    }

    public static void main(String[] args) {
        Zookeeper z = new Zookeeper("Zoe");
    }
}
