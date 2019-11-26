public class Person {

    private String name;
    public  String getName(){
        return name;
    };
    public void setName(String name){
    };
    public void sayHello(){
    };
    Person(nameExt){
        this.name = nameExt;
    }


    public static void main(String[] args) {
        Person per = new Person("Jacob");
    }
}