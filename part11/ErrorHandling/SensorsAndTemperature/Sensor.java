package part11.ErrorHandling.SensorsAndTemperature;

public interface Sensor {
    boolean isOn();    
    void setOn();      
    void setOff();     
    int read();        
                      
}
