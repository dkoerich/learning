public enum Book {
    JHTP6("Java How to Program 6e", "2005"),
    CHTP4("C How to Program 4e", "2004"),
    IW3HTP3("Internet & World Widez Web How to Program 3e", "2004"),
    CPPHTP4("C++ How to Program 4e", "2003"),
    VBHTP2("Visual Basic .NET How to Program 2e", "2002"),
    CSHARPHTP("C# How to Program", "2002");

    private final String title;
    private final String copyrightYear;

    Book(String bookTitle, String year) {
        title = bookTitle;
        copyrightYear = year;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
