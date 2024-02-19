package model;

public class Oferent extends User{
    Charge charge = new Charge();

    public Oferent(String userName, String password, byte typeUser) {
        super(userName, password, typeUser);
        this.charge = charge;
    }


    public Charge getCharge() {
        return charge;
    }

    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "Oferent{" +
                "charge=" + charge +
                '}';
    }
}
