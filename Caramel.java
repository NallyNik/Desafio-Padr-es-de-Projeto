//Padrão de Projeto Decorator

public class Caramel extends Topping {

    public Caramel(Cake cakeT) {
        super("Caramel", cakeT);
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with Caramel topping";
    }

    @Override
    public double cost() {
        return cake.cost() + 10;
    }
        
}
