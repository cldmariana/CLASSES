package CursoEmVideoPOO.Aula09;

public interface Publication {

    public abstract void open();

    public abstract void close();

    public abstract void leafThrough(int currentPage);

    public abstract void nextPage();

    public abstract void previousPage();
}