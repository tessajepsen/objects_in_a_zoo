public class Bee extends Animal{
    //properties
    private String name;
    private String favoriteFood;

    public Bee(String name){
        super(name, "pollen");
        this.name = name;
        this.favoriteFood = "pollen";
    }

    public void sleep(){
        System.out.println(name + " never sleeps");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }

    public static void main(String[] args) {
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
    }
}
