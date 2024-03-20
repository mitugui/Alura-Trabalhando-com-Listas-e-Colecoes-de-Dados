package Tarefa4.Ex2;

public class Tittle implements Comparable<Tittle> {
    private String name;
    private int releaseYear;

    public Tittle(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public int compareTo(Tittle otherTittle) {
        return this.name.compareTo(otherTittle.getName());
    }

    // Ordenando de Z - A
    // @Override
    // public int compareTo(Tittle otherTittle) {
    //     return otherTittle.getName().compareTo(this.name);
    // }

    @Override
    public String toString() {
        return "(Nome: " + this.name + ", Ano: " + this.releaseYear + ")";
    }
}
