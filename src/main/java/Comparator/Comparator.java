package Comparator;


public class Comparator {
    public static void main(String[] args) {
        User user1 = new User(2L, "Valik");
        User user2 = new User(1L, "Oleg");
        java.util.Comparator<User> comparator = (o1, o2) -> o1.getId().compareTo(o2.getId());
        System.out.println(comparator.compare(user1, user2));
    }
}

class User{
    Long id;
    String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
