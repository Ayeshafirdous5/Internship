package main.java.internship.fan;

class Fan {
    private int id;
    private String brand;
    public boolean isSwitchOn = false;
     private FanSpeed speed = FanSpeed.Off;

    public void switchOntheFan() {
        if(isSwitchOn) {
            System.out.println("main.java.intership.main.java.internship.fan.Fan already spinning");
        }
        else {
                System.out.println("Starting main.java.internship.fan with speed 1");
                isSwitchOn = true;
                speed = FanSpeed.LOW;
        }
    }
    public void switchOftheFan() {
        if(!isSwitchOn) {
            System.out.println("main.java.intership.main.java.internship.fan.Fan not spinning");
        }
        else {
            System.out.println("Stopping the main.java.internship.fan");
            isSwitchOn = false;
            speed = FanSpeed.Off;

        }
    }
    public void changeSpeed(FanSpeed newSpeed) {
        if(isSwitchOn) {
            speed = newSpeed;
            System.out.println("main.java.intership.main.java.internship.fan.Fan speed changed to: " +speed);
        } else {
            System.out.println("Can't change speed. main.java.main.java.internship.main.java.internship.fan.Fan is off.");
        }
    }
    public FanSpeed getSpeed() {
        return speed;
    }
     public void increaseSpeed() {
         speed=speed.increase();
     }
     public void decreaseSpeed() {
        speed=speed.decrease();
     }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        }

     public boolean isSwitchOn() {
        return false;
     }
 }

