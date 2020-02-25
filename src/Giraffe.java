public class Giraffe extends Animal{
    //properties
    private String name;
    private String favoriteFood;

    public Giraffe(String name){
        super(name, "leaves");
        this.name = name;
        this.favoriteFood = "leaves";
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
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
    }
}
