public class Homework2part2 {
    private String name;
    private String age;
    private String color;
    private String favorite_activity;
    private String weight;
    public Homework2part2(String name, String age, String color,String favorite_activity, String weight){
        this.name=name;
        this.age=age;
        this.color=color;
        this.favorite_activity=favorite_activity;
        this.weight=weight;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getFavorite_activity(){
        return favorite_activity;
    }
    public void setFavorite_activity(String favorite_activity){
        this.favorite_activity=favorite_activity;
    }
    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight=weight;
    }

    @Override
    public String toString() {
        return"name: "+name+"\nage: "+age+"\ncolor: "+color+"\nfavorite_activity: "+favorite_activity+"\nweight: "+weight;
    }
}
