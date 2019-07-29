import org.jetbrains.annotations.Contract;

public enum Enumeration_Car {
    lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
    private int price;
    @Contract(pure = true)
    Enumeration_Car(int price) {
        this.price = price;
    }
    @Contract(pure = true)
    int getPrice() {
        return price;
    }

}
