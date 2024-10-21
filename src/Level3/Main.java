package Level3;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int option;
        String name, surname, DNI;
        ArrayList<Person> people = new ArrayList<>();
        try {
            List<String> csv = Files.readAllLines(Paths.get("src/Level3/people.csv"));
            for(String line: csv){
                people.add(new Person(line.split(",")[0].trim(),line.split(",")[1].trim(),line.split(",")[2].trim()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner read = new Scanner(System.in);
        read.useDelimiter("\r?\n");
        do{
            System.out.println("\n\nChoose one of the following options: ");
            System.out.println("    1.-Add person.");
            System.out.println("    2.-Display people ordered by name (A-Z).");
            System.out.println("    3.-Display people ordered by name (Z-A).");
            System.out.println("    4.-Display people ordered by surname (A-Z).");
            System.out.println("    5.-Display people ordered by surname (Z-A).");
            System.out.println("    6.-Display people ordered by DNI (1-9).");
            System.out.println("    7.-Display people ordered by DNI (9-1).");
            System.out.println("    0.-Exit");
            option = read.nextInt();
            switch (option){
                case 1:
                    System.out.println("What is the writer's name?");
                    name = read.next();
                    System.out.println("What is the writer's surname?");
                    surname = read.next();
                    System.out.println("What is the writer's DNI?");
                    DNI = read.next();
                    people.add(new Person(name,surname,DNI));
                    break;
                case 2:
                    System.out.println("___Name___ ____Surname____ ___NIF___");
                    people.sort(Comparator.comparing(Person::getName));
                    for (Person person: people){
                        System.out.println(person.getName() + "\t" + person.getSurname() + "\t\t" + person.getDNI());
                    }
                    break;
                case 3:
                    System.out.println("___Name___ ____Surname____ ___NIF___");
                    people.sort(Comparator.comparing(Person::getName).reversed());
                    for (Person person: people){
                        System.out.println(person.getName() + "\t" + person.getSurname() + "\t\t" + person.getDNI());
                    }
                    break;
                case 4:
                    System.out.println("___Name___ ____Surname____ ___NIF___");
                    people.sort(Comparator.comparing(Person::getSurname));
                    for (Person person: people){
                        System.out.println(person.getName() + "\t" + person.getSurname() + "\t\t" + person.getDNI());
                    }
                    break;
                case 5:
                    System.out.println("___Name___ ____Surname____ ___NIF___");
                    people.sort(Comparator.comparing(Person::getSurname).reversed());
                    for (Person person: people){
                        System.out.println(person.getName() + "\t" + person.getSurname() + "\t\t" + person.getDNI());
                    }
                    break;
                case 6:
                    System.out.println("___Name___ ____Surname____ ___NIF___");
                    people.sort(Comparator.comparing(Person::getDNI));
                    for (Person person: people){
                        System.out.println(person.getName() + "\t" + person.getSurname() + "\t\t" + person.getDNI());
                    }
                    break;
                case 7:
                    System.out.println("___Name___ ____Surname____ ___NIF___");
                    people.sort(Comparator.comparing(Person::getDNI).reversed());
                    for (Person person: people){
                        System.out.println(person.getName() + "\t" + person.getSurname() + "\t\t" + person.getDNI());
                    }
                    break;
            }
        }while(option!=0);
    }
}
