package exercice1;

public class User {
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private long id;
    private String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
