package logic;

import model.Charge;
import model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HandlingCharge {

    //
    HashMap<User, ArrayList<Charge>> chargeForCompany = new HashMap<>();

    //Mertodos
    public void createCharge(String description, String origin, String destination, Double value, User transport, User oferent){
        Charge chargeAux = new Charge(description, origin, destination, value, transport, oferent);
        if (chargeForCompany.containsKey(oferent)) {
            chargeForCompany.get(oferent).add(chargeAux);
        }else {
            ArrayList<Charge> charges = new ArrayList<>();
            charges.add(chargeAux);
            chargeForCompany.put(oferent, charges);
        }
    }

    public void removeCharge() {
        for (Map.Entry<String, HashSet<Book>> entry : booksPerAutor.entrySet()) {
            if (entry.getKey().equals(autor)) {
                HashSet<Book> books = entry.getValue();
                for (Book b : books) {
                    if (b.getTitle().equals(title)) {
                        booksPerAutor.get(autor).remove(b);
                    }
                }
            }
        }
    }



}
