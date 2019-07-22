public class LiSi extends HumenWithCar {

    public LiSi(Car car){
        super(car);
    }
    public void HoHome(){
        car.Start();
        car.Stop();
    }
}
