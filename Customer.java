// This class uses the Singleton

public class Customer {
    
    public void orderPizza(){
        PizzaSingleton oven = PizzaSingleton.getInstance();
        oven.bakePizza("Pepperoni");
    }
}
