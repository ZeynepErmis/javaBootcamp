package Entities;

public class User {
    private int id;
    private String userName;

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }


    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String userName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
