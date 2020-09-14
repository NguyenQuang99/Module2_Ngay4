package Xay_dung_lopFan;

public class Fan {

    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setRadius (int radius) {
        this.radius = radius;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public void setOn (boolean on) {
        this.on = on;
    }

    public String toString() {
        if(this.on) {
            return "Speed:" + speed + " , Color: " + color + " , Radius: " + radius + ",  fan is on";
        } else {
            return "Color: " + color +", Radius: " + radius + ", fan is off";
        }
    }

}
