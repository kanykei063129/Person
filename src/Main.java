public class Main {
    public static void main(String[] args) {

       Programmer programmer1 = new Programmer(3, "Buzurmanaliev erlan",  27, 'M', "@erlanbuzurmanaliev", "564215799", 507);
        Programmer programmer2 = new Programmer(1, "Kaseiinov kutman",  82, 'M', "@kutmankaseiinov", "4317469", 457);
        Programmer programmer3 = new Programmer(2, "Aitbaev Adil", 43, 'M', "@adilaitbaev", "4317280", 987);
        Programmer[] programmers = {programmer1,programmer2,programmer3};
        programmer1.getPeopleOfAllAges(programmers);
        System.out.println(programmer1.getLastName());
        System.out.println(programmer1.favoriteMouth(3));
        System.out.println(programmer1.favoriteLanguage("russian"));
        System.out.println(programmer1.getDateOfBrith(2006, 3, 19));
        System.out.println(programmer1.getPhoneNumberAndEmail());


        Driver driver1 = new Driver(123,"erhyfij",18,'f',"neijmk","895625",123423.0);
        Driver driver2 = new Driver(123,"erhyfij",34,'f',"neijmk","895625",123423.0);
        Driver driver3 = new Driver(123,"erhyfij",23,'f',"neijmk","895625",123423.0);
        Driver[] drivers = {driver1,driver2,driver3};
        driver1.getPeopleOfAllAges(drivers);
        System.out.println(driver1.getLastName());
        System.out.println(driver1.favoriteMouth(6));
        System.out.println(driver1.favoriteLanguage("English"));
        System.out.println(driver1.getDateOfBrith(2003,6,11));
        System.out.println(driver1.getPhoneNumberAndEmail());

        Doctor doctor1 = new Doctor(34,"fhgjvncd",86,'M',"fhgjvncd","5923879",25432.0);
        Doctor doctor2 = new Doctor(34,"fhgjvncd",86,'M',"fhgjvncd","5923879",25432.0);
        Doctor doctor3 = new Doctor(34,"fhgjvncd",86,'M',"fhgjvncd","5923879",25432.0);
        Doctor[] doctors = {doctor1,doctor2,doctor3};
        doctor1.getPeopleOfAllAges(doctors);
        System.out.println(doctor1.getLastName());
        System.out.println(doctor1.favoriteMouth(9));
        System.out.println(doctor1.favoriteLanguage("English"));
        System.out.println(doctor1.getDateOfBrith(2001,9,11));
        System.out.println(doctor1.getPhoneNumberAndEmail());
    }
}