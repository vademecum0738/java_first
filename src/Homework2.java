import javax.lang.model.element.NestingKind;

public class Homework2 {
    private String size;
    private String age;
    private String temperature;
    private String distance;
    public Homework2(String size, String age, String temperature, String distance){
        this.size=size;
        this.age=age;
        this.temperature=temperature;
        this.distance=distance;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size=size;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getTemperature(){
        return temperature;
    }
    public void setTemperature(String temperature){
        this.temperature=temperature;
    }
    public String getDistance(){
        return distance;
    }
    public void setDistance(String distance){
        this.distance=distance;
    }

    @Override
    public String toString() {
        return"size: "+size+"\nage: "+age+"\ntemperature: "+temperature+"\ndistance: "+distance;
    }
}


