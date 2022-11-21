import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public abstract class Person implements Personable {
    private int id;
    private String fullName;
    private int age;
    private char gender;
    private String email;
    private String phoneNumber;
    private double governmentsSalary;

    public Person(int id, String fullName, int age, char gender, String email, String phoneNumber, double governmentsSalary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.governmentsSalary = governmentsSalary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getGovernmentsSalary() {
        return governmentsSalary;
    }

    @Override
    public void favoriteSport(String sport) {
        System.out.println(getFullName() +"liked sport "+sport);

    }

    @Override
    public String favoriteLanguage(String languaage) {
        return "favorite "+languaage;
    }

    @Override
    public Month favoriteMouth(int month) {
        return Month.of(month);
    }

    @Override
    public String getLastName() {
        String [] array = fullName.split(" ");
        for (String s:array){
            return array[0];
        }
        return null;
    }

    @Override
    public LocalDate getDateOfBrith(int year,int month,int day) {
        LocalDate localDate = LocalDate.of(year,month,day);
        return localDate;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return phoneNumber+" "+email;
    }

    @Override
    public void getPeopleOfAllAges(Person[] people) {
        int [] array  = new int[people.length];
        int index = 0;
        for (Person person:people){
            array[index]=person.age;
            index++;
        }
        Arrays.sort(array);
        for (int i = 0; i < people.length; i++) {
            System.out.println(array[i]);

        }
    }
}
