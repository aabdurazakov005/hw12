public class Main {
    public static void main(String[] args) {
        Author salvatore = new Author("Robert", "Salvatore");
        Author shiltd = new Author("Gerbert", "Shieldt");

        Book drow = new Book("Изгнанник", salvatore, 1990);
        Book java = new Book("Java. Руководство для начинающих", shiltd, 2002);

        drow.setYear(1991);
        System.out.println("Книга: " + drow.getName() + " " + "Автор: " + drow.getAuthor().getFirstName() + " " + drow.getAuthor().getSecondName() + " Год выпуска: " + drow.getYear());
    }
}