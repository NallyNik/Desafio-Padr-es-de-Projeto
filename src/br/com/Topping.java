package br.com;
//Padrão de Projeto Decorator

public abstract class Topping extends Cake {

    protected Cake cake;

    public Topping(String description, Cake cakeTopping) {
        super(description);
        this.cake = cakeTopping;
    }
    
    public abstract String getDescription();

}
