public class Dog {
    private int age;
    private String name, color;
    private Owner owner;

    public Dog(int age,String name,String color,Owner owner){
        this.age = age;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int ge){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String a){
        name = a;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String a){
        color = a;
    }
    public Owner getOwner(){
        return owner;
    }
    public void setOwner(Owner o){
        owner = o;
    }
    private void addOneAge(){
        age++;
    }
    public int birthday(){
        addOneAge();
        return age;
    }
    public String toString(){
        return "The dog is named " + name + " and is " + age + " years old. This dog is " + color + ".";
    }
}

