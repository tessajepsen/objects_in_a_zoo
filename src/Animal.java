public class Animal {

    //properties
    private String name;
    private String favoriteFood;
    static int population = 0;

    public Animal(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public void sleep(){
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!!" + name + " wants more " + food);
        } else {
            sleep();
        }
    }


}
