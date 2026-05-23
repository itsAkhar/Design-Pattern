package LazyClass;

public class UserLogging{
    private String name;
    private String id;

    public void LogIn(String name) {
        this.name = name;
        System.out.println("Audit Log: " +name+" has been logged in...");
    }

    public void setId(String id) {
        this.id = id;
    }
}
