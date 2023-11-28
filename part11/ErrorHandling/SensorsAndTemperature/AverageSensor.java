package part11.ErrorHandling.SensorsAndTemperature;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class AverageSensor implements Sensor {

    ArrayList<Sensor> group = new ArrayList<>();
    ArrayList<Integer> readings = new ArrayList<>();
    Boolean B;

    public AverageSensor(){
        this.group = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        this.group.add(toAdd);
    }

    public boolean isOn(){
        return this.B;

    }


    public void setOn(){
        this.B = true;
        for(Sensor sensor : this.group){
            sensor.setOn();
        }
        
    
    }

    public void setOff(){
        for(Sensor sensor : this.group){
            sensor.setOff();
        }

    }
    public int read(){
        int sum = 0;
        for(Sensor senor : this.group){
            sum = sum+ senor.read();
            
        }
        int avg= sum/this.group.size();
        this.readings.add(avg);
        return avg;
    }
    public List<Integer> readings(){
        return this.readings;

    }






    
}
