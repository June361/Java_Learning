
public class ZhangSan extends HumenWithCar{

    public ZhangSan(Car car){
        super(car);
    }

    public void HoHome(){
        car.Start();
        car.TurnLeft();
        car.TurnRight();
        car.Stop();
    }

}
