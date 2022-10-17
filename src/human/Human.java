package human;

public class Human {
    String name;
    String yearOfBirth;
    String  town;
    String job;


    public Human(String name, String yearOfBirth, String town,String job) {

        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.job = job;

    }

    void story(){
        System.out.println("Привет! Меня зовут " + name + ". " + "Я из города " + town + ". " + " Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + "." + " Будем знакомы!" );

    }
}
