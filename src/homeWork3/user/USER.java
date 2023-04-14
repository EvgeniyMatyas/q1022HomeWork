package homeWork3.user;

public enum USER {
    USER1("PETR", "PETROV", 30, 'M',new UserAdress("RB","MINSK")),
    USER2("IVAN", "IVANOV", 25, 'M',new UserAdress("UA","KIEV")),
    USER3("IRINA", "SIDOROVA", 29, 'F',new UserAdress("RU","MOSCOW"));

    private String name;
    private String lastName;
    private int age;
    private char gender;
    private UserAdress adress;

     USER(String name, String lastName, int age, char gender,UserAdress adress) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
    }
    public void printNameLastName(){
        System.out.println(name+" "+lastName);
    }
    USER(){
        System.out.println("Empty constructor");
    }
    public int upAge(int plusAge){
        age = plusAge+age;
        return age;
    }
    public void printUserInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+gender);

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public static class UserAdress {
        private String country;
        private String city;

        public UserAdress(String country, String city) {
            this.country = country;
            this.city = city;
        }

        public void printAdress() {
            System.out.println(country + " " + city);

        }
    }}
