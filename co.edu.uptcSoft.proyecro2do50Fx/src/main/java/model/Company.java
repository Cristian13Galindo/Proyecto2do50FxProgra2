package model;

import java.io.Serializable;

public class Company extends User implements Serializable {
    Charge charges = new Charge();

    public Company(String userName, String password, byte typeUser) {
        super(userName, password, typeUser);
        this.charges = charges;
    }

    public Charge getCharges() {
        return charges;
    }

    public void setCharges(Charge charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Company{" +
                "charges=" + charges +
                '}';
    }
}

