package logic;

import model.Charge;
import model.Company;
import model.Oferent;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CargoHangling {
    private ArrayList<Oferent> oferents = new ArrayList<>();
    private ArrayList<Company> companies = new ArrayList<>();
    private Map<String, ArrayList<Charge>> userCompany = new HashMap<>();
    private Map<String, ArrayList<Charge>> userTransport = new HashMap<>();


    public void createUser(String userName, String password, byte typeUser) {
        if (typeUser == 1) {
            Oferent newOferent = new Oferent(userName, password, typeUser);
            oferents.add(newOferent);

            if (!userCompany.containsKey(userName)) {
                ArrayList<Charge> charges = new ArrayList<>();
                userCompany.put(userName, charges);
            }
        } else if (typeUser == 2) {
            Company newCompany = new Company(userName, password, typeUser);
            companies.add(newCompany);

            if (!userTransport.containsKey(userName)) {
                ArrayList<Charge> charges = new ArrayList<>();
                userTransport.put(userName, charges);
            }
        }
    }

    public boolean loginUser(String loginUserName, String loginPassword, byte typeUser) {
        if (typeUser == 1) {
            for (Oferent oferent : oferents) {
                if (oferent.getUserName().equals(loginUserName) && oferent.getPassword().equals(loginPassword)) {
                    return true;
                }
            }
        } else if (typeUser == 2) {
            for (Company company : companies) {
                if (company.getUserName().equals(loginUserName) && company.getPassword().equals(loginPassword)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addJob(String companyName, Charge charge) {
        if (userTransport.get(companyName) == null) {
            ArrayList<Charge> charges = new ArrayList<>();
            charges.add(charge);
            userTransport.put(companyName, charges);
        }
        userTransport.get(companyName).add(charge);
    }

    public String showGetJobs(String companyName) {
        String jobs = "";
        ArrayList<Charge> charges = userTransport.get(companyName);
        if (charges != null && !charges.isEmpty()) {
            for (Charge c : charges) {
                jobs += c.toString() + "\n";
            }
        } else {
            jobs = "Aún no hay trabajos";
        }
        return jobs;
    }

    public void createCharge(String userName, String description, String origin, String destination, Double value, String id) {
        Charge chargeAux = new Charge(description, origin, destination, value, id);
        if (userCompany.containsKey(userName)) {
            userCompany.get(userName).add(chargeAux);
        } else {
            ArrayList<Charge> charges = new ArrayList<>();
            charges.add(chargeAux);
            userCompany.put(userName, charges);
        }
    }

    public String showAllJobs() {
        String allJobs = "";
        for (Map.Entry<String, ArrayList<Charge>> entry : userCompany.entrySet()) {
            ArrayList<Charge> charges = entry.getValue();
            if (charges != null) {
                allJobs += "Oferentes: \n";
                allJobs += entry.getKey() + "\n";
                for (Charge c : charges) {
                    allJobs += "Id: " + c.getId() + " Descripción: " + c.getDescription() + ". Origen: " + c.getOrigin() + " Destino: " + c.getDestination() + " Precio:" + c.getValue() + "\n";
                }
            } else {
                allJobs += "No hay cargas aún";
            }
        }
        return allJobs;
    }

    public String showJobs(String companyName) {
        String jobs = "";
        ArrayList<Charge> charges = userCompany.get(companyName);
        if (charges != null) {
            for (Charge c : charges) {
                jobs += "- Id: " + c.getId() + " Descripción: " + c.getDescription() + ". Origen: " + c.getOrigin() + " Destino: " + c.getDestination() + " Precio:" + c.getValue() + "\n";
            }
        } else {
            jobs += "no hay cargas aún";
        }
        return jobs;
    }

    public String showDescription(String companyName, String id) {
        String description = "";
        ArrayList<Charge> charges = userCompany.get(companyName);
        if (charges != null) {
            for (Charge c : charges) {
                if (c.getId().equals(id)) {
                    description += "Descripción: " + c.getDescription();
                }
            }
        } else {
            description = "No hay cargas aún";
        }
        return description;
    }

    public void addTransportist(String companyName, String id, String name) {
        ArrayList<Charge> charges = userCompany.get(companyName);
        if (charges != null) {
            for (Charge c : charges) {
                if (c.getId().equals(id)) {
                    addJob(companyName, c);
                    charges.remove(c);
                    break;
                }
            }
        } else {
            System.out.println("La lista de cargas para esta empresa es nula.");
        }
    }
}