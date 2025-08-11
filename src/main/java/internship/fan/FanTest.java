package main.java.internship.fan;

public class FanTest {
    public static void main(String[] args){
        Fan f1 = new Fan();
        f1.setId(1);
        f1.setBrand("Usha main.java.intership.main.java.internship.fan.Fan");
        f1.switchOntheFan();
        f1.switchOntheFan();
        f1.changeSpeed(FanSpeed.MEDIUM);
        f1.changeSpeed(FanSpeed.HIGH);
        f1.switchOftheFan();
        f1.changeSpeed(FanSpeed.LOW);
        f1.switchOftheFan();

        System.out.println(f1.getId());
        System.out.println(f1.getBrand());
        System.out.println("Current Speed: " +f1.getSpeed());
    }
}
