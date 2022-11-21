import java.time.LocalDate;
import java.time.Month;

public interface Personable {
    void favoriteSport(String sport);

    String favoriteLanguage(String languaage);

    Month favoriteMouth(int month);

    String getLastName();

    LocalDate getDateOfBrith(int year,int month,int day);

    String getPhoneNumberAndEmail();

    void getPeopleOfAllAges(Person[] people);
}
