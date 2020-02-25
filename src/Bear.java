public class Bear extends Animal{
    //properties
    private String name;
    private String favoriteFood;

    public Bear(String name){
        super(name, "fish");
        this.name = name;
        this.favoriteFood = "fish";
    }

    public void sleep(){
        System.out.println(name + " hibernates for 4 months");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep();
        }
    }

    public static void main(String[] args) {
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
    }
}
