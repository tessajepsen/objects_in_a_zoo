public class Tiger extends Animal{
    //properties
    private String name;
    private String favoriteFood;


    public Tiger(String name){
        super(name, "meat");
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep(){
        System.out.println(name + " sleeps for 8 hours");
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
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
    }
}
