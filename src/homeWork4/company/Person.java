package homeWork4.company;

public class Person {
    protected String name;
    protected String secondName;

    public Person(String name,String secondName){
        this.name=name;
        this.secondName=secondName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
