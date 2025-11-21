// This class uses the singleton

public class Store {

    public void makeSpecial(){
        PizzaSingleton oven = PizzaSingleton.getInstance();
        oven.bakePizza("Meat Lovers Pizza");
    }
    
}
