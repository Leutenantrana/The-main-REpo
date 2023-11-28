package part11.ErrorHandling.SensorsAndTemperature;

public class StandardSensor implements Sensor {
    int sensorValue;
    public StandardSensor(int num){
        this.sensorValue = num;
    }
    public boolean isOn(){
        return true;
    }   
    public void setOn(){

    }   // sets the sensor on
    public void setOff(){

    }    // sets the sensor off
    public int read(){
        return this.sensorValue;
    }     

    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);
    
        System.out.println(ten.read());
        System.out.println(minusFive.read());
    
        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
    }
    
}
