package Level1.Exercise3;


import Level3.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int loop = 10, score = 0;
        String name, country;
        Random random = new Random();
        HashMap<String,String> countries = new HashMap<>();
        Scanner read = new Scanner(System.in);
        read.useDelimiter("\r?\n");
        try {
            List<String> csv = Files.readAllLines(Paths.get("src/Level1/Exercise3/countries.txt"));
            for(String line: csv){
                countries.put(line.split(" ")[0],line.split(" ")[1]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> countrieskeys = new ArrayList<String>(countries.keySet());
        System.out.println("What's your name?");
        name = read.next();
        while(loop>0){
            country = countrieskeys.get(random.nextInt(countrieskeys.size()));
            System.out.println("What's the capital of " + country + "?");
            if(Objects.equals(read.next(), countries.get(country))){
                score++;
            }
            loop--;
        }
        try{
            FileWriter filewriter = new FileWriter("src/Level1/Exercise3/ranking.txt",true);
            filewriter.write("\n" + name + " " + score);
            filewriter.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}