import java.util.Objects;

public class Author {
    private String Name;
    private String serName;

    public Author(String Name, String serName) {
        this.Name = Name;
        this.serName = serName;
    }

    public String getName() {
        return this.Name;
    }

    public String getSerName() {
        return this.serName;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String toString() {
        return "имя " + this.Name + " фамилия " + this.serName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(Name, author.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }
}