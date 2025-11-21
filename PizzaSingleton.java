// The singleton class, this is the one object everyone will share

public class PizzaSingleton {

    private static PizzaSingleton instance;

    private PizzaSingleton(){}

    public static PizzaSingleton getInstance(){
        if(instance == null){
            instance = new PizzaSingleton();
        }
        return instance;
    }

    public void bakePizza(String type){
        System.out.println("Baking: " + type);
    }

}