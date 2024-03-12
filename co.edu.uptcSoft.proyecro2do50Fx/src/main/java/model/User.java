package model;

public class User {
    //Atributos
    private String userName;
    private String password;
    private byte typeUser;

    //Constructor
    public User(String userName, String password, byte typeUser) {
        this.userName = userName;
        this.password = password;
        this.typeUser = typeUser;
    }

    //Get and Set
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getType() {
        return typeUser;
    }

    public void setType(byte type) {
        this.typeUser = type;
    }

    //ToString
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", typeUser='" + typeUser + '\'' +
                '}';
    }
}