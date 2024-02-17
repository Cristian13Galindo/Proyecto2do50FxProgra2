package logic;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class HandlingUser {
    //Mapa para guardar las empresas que ofrecen las cargas.
    // (type == 1)
    private Map<String, User> userCompany;

    //Mapa para guardar los transportadores que transportan las cargas.
    //(type == 2)
    private Map<String, User> userTransport;

    //Constrcutror
    public HandlingUser() {
        userCompany = new HashMap<>();
        userTransport = new HashMap<>();

    }

    //Metodo para crear los usuarios
    public void createUser(String userName, String password, byte typeUser){
        if (typeUser == 1) {
            User userSum = new User(userName, password, typeUser);
            userCompany.put(userName, userSum);
        } else if (typeUser == 2) {
            User userSum = new User(userName, password, typeUser);
            userTransport.put(userName, userSum);
        }else {
            System.out.println("El tipo usuario no corresponde a ninguna de las dos opciones!");
        }
    }

    //Metodo para buscar los usuarios
    /*public String findCarForPlate(String plateSearch) {
        String canden="";
        for (String  plate: carMap.keySet()) {
            if (plate.equals(plateSearch) ) {
                Car carView = carMap.get(plate);
                canden = canden +"\n"+ " vehiculo con placa: " + carView.getPlate() + "\n"+ " Nombre del propietario: " + carView.getOwner() + "\n"+ " Fecha de la revision: " +
                        carView.getAdmissionDate() + "\n"+ " Diagnostico: " + carView.getDescription();

            }
        }
        if (canden.equals("")){
            return "no se encontro el vehiculo";
        }else {
            return canden;
        }*/

    //Metodo para ingresar usuario
    public boolean login (String loginUserName, String loginPassword, byte typeUser) {
        if (typeUser == 1) {
            for (String userName : userCompany.keySet()) {
                if (userName.equals(loginUserName)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (typeUser == 2) {
            for (String userName : userTransport.keySet()) {
                if (userName.equals(loginUserName)) {
                    return true;
                } else {
                    return false;
                }
            }
        }else {
            return false;
        }

        return true;
    }
}
