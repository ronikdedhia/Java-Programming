class  MyLamp{
  // stores the value for light: true if light is on and false if light is off
  boolean isOn;
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);
  }
  void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
  }
}
class Lamp {
  public static void main(String[] args) {
    MyLamp led = new MyLamp();
    MyLamp halogen = new MyLamp();
    led.turnOn();
    halogen.turnOff();
  }
}