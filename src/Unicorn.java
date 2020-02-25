public class Unicorn extends Animal{
    //properties
    private String name;
    private String favoriteFood;

    public Unicorn(String name) {
        super(name, "marshmallows");
        this.name = name;
        this.favoriteFood = "marshmallows";
    }

    public void sleep(){
        System.out.println(name + " sleeps on a cloud");
    }

    public static void main(String[] args) {
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
    }
}