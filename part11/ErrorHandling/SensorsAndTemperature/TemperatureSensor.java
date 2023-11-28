package part11.ErrorHandling.SensorsAndTemperature;

import java.util.Random;

import java.util.Random;

public class TemperatureSensor implements Sensor{

    Boolean b = true;

    public TemperatureSensor(){
        

    }

    public boolean isOn(){
       

        return true;
        

    }
    public void setOn(){
        this.b = true;
    }
   
    public int read(){
        if (this.b) {
             Random rand = new Random();
                int num = rand.nextInt(61) - 30;
                return num;
        }else{
            throw new IllegalStateException();
        }
       
    }   
    
    public void setOff(){
       this.b = false;

    }


    
}
