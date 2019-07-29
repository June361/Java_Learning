public class Box_Generics_Class<Generics>{
    private Generics generics;
    public void put(Generics generics) {
        this.generics = generics;
    }

    public Generics get() {
        return generics;
    }
}