package br.com;
//Padrão de Projeto Facade

public class CakeShop {
    
    private Cake vanilla = new Vanilla();
    private Cake chocolate =  new Chocolate();

    public void VanillaCaramelSale() {
        Topping caramel = new Caramel(vanilla);
        System.out.println(caramel.getDescription() + ": R$" + caramel.cost());
    }

    public void VanillaCreamSale() {
        Topping cream = new Cream(vanilla);
        System.out.println(cream.getDescription() + ": R$" + cream.cost());
    }

    public void VanillaNoTopping() {
        System.out.println(vanilla.getDescription() + ": R$" + vanilla.cost());
    }

    public void ChocolateCaramelSale() {
        Topping caramel = new Caramel(chocolate);
        System.out.println(caramel.getDescription() + ": R$" + caramel.cost());
    }

    public void ChocolateCreamSale() {
        Topping cream = new Cream(chocolate);
        System.out.println(cream.getDescription() + ": R$" + cream.cost());
    }

    public void ChocolateNoTopping() {
        System.out.println(chocolate.getDescription() + ": R$" + chocolate.cost());
    }
}
