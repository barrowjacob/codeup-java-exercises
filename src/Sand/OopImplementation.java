package Sand;

public class OopImplementation {

    public static void main(String[] args) {
        Person rick = new Person("Rick", "Sanchez", "123-45-6784");

        Address ricksAddr = new Address(
                "navarro",
                "600",
                "SAT",
                "78205",
                true
        );

        System.out.println("rick.sayHello() = " + rick.sayHello());
        System.out.println(rick.sayHello());
        System.out.println(Person.breathe("air"));

//        Person.liveOnEarth;

        // prints "Hello from Rick Sanchez!"

        Person ada = new Person("Ada", "Lovelace", "123-45-6783");
        Person grace = new Person("Grace", "Hopper", "123-45-6781");


        System.out.println("grace.getSsn() = " + grace.getSsn());

        grace.provideDocs("birthCertificate", 100);
        ada.provideDocs("fakeBirthCertificate", 1000);

        System.out.println("Person.worldPopulation = " + Person.worldPopulation);


    }


}