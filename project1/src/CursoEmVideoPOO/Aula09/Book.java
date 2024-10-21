package CursoEmVideoPOO.Aula09;

public class Book implements Publication {

    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean open;
    private Person reader;

    public Book(String title, String author, int totalPages, boolean open, int currentPage, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.open = open;
        this.currentPage = 0;
        this.reader = reader;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public String bookDetails() {
        return "Book{" +
                "title='" + title + '\'' +
                "\n, author='" + author + '\'' +
                "\n, totalPages=" + totalPages +
                "\n, currentPage=" + currentPage +
                "\n, open=" + open +
                "\n, reader=" + reader.getName() +
                '}';
    }


//    public void bookDetails() {
//        System.out.println();
//        System.out.println("============ ABOUT THE BOOK ============");
//        System.out.println("Title: " + this.getTitle());
//        System.out.println("Author: " + this.getAuthor());
//        System.out.println("Number of total pages: " + this.getTotalPages());
//        System.out.println("Open: " + this.isOpen());
//        System.out.println("========================================");
//    }


    @Override
    public void open() {
        this.setOpen(true);
    }

    @Override
    public void close() {
        this.setOpen(false);
    }

    @Override
    public void leafThrough(int currentPage) {
        if (currentPage > this.totalPages) {
            this.currentPage = 0;
        } else {
            this.currentPage = currentPage;
        }
    }

    @Override
    public void nextPage() {
        this.currentPage++;
        //this.setCurrentPage(getCurrentPage() + 1);
    }

    @Override
    public void previousPage() {
        this.currentPage--;
        //this.setCurrentPage(getCurrentPage() - 1);
    }
}