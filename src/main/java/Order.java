public class Order {
    private Coffee coffee;
    private boolean withMilk;
    private boolean withSugar;
    private int amountOfSugar;
    private String size;
    public Order(Coffee coffee) {
        this.coffee = coffee;
    }
    public void setWithMilk(boolean withMilk) {
        this.withMilk = withMilk;
    }
    public void setWithSugar(boolean withSugar) {
        this.withSugar = withSugar;
    }
    public void setAmountOfSugar(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }
    public void setSize(String size) {
        this.size = size;
    }
    //preparation of coffee
    public void prepare() {
        System.out.println(coffee.getName() + size + " preparing...");
        if (withMilk) {
            System.out.println("Adding Milk...");
        }
        if (withSugar) {
            System.out.println(amountOfSugar + "Adding Sugar...");
        }
        System.out.println("Your order isready. Enjoy");
    }
}