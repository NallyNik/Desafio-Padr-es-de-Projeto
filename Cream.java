//Padrão de Projeto Decorator

public class Cream extends Topping {

    public Cream(Cake cakeT) {
        super("Cream", cakeT);
        
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with Cream topping";
    }

    @Override
    public double cost() {
        return cake.cost() + 15;
    }
    
}
