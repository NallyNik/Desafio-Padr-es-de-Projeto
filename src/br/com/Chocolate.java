package br.com;

public class Chocolate extends Cake {

    public Chocolate() {
        super("com.Chocolate flavor");
    }

    @Override
    public double cost() {
        return 30;
    }
    
}
