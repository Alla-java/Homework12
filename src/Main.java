

public class Main {


    public static void main(String[] args) {

        Author tolstoy = new Author ("Лев", "Толстой");
        System.out.println("tolstoy.nameAuthor = " + tolstoy.getNameAuthor());
        System.out.println("tolstoy.surnameAuthor = " + tolstoy.getSurnameAuthor());

        Book warandpeace = new Book ("Война и мир", tolstoy, 1865);
        System.out.println("warandpeace.name = " + warandpeace.getNameBook());
        System.out.println("warandpeace.yearPublication = " + warandpeace.getYearPublication());

        warandpeace.setYearPublication(1866);
        System.out.println("warandpeace.getYearPublication() = " + warandpeace.getYearPublication());

        Author rosariamunda = new Author ("Розария", "Мунда");
        System.out.println("rosariamunda.nameAuthor = " + rosariamunda.getNameAuthor());
        System.out.println("rosariamunda.surnameAuthor = " + rosariamunda.getSurnameAuthor());

        Book powerfire = new Book ("Власть огня", rosariamunda, 2022);
        System.out.println("powerfire.name = " + powerfire.getNameBook());
        System.out.println("powerfire.yearPublication = " + powerfire.getYearPublication());


    }
}