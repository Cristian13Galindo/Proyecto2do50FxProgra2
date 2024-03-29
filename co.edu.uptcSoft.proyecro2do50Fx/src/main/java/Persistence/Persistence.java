package Persistence;

import model.Charge;
import model.Company;
import model.Oferent;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Persistence {

    public void writeOferent(ArrayList<Oferent> oferent) throws IOException {
       ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("src/main/resources/file/oferents.dat"));
       write.writeObject(oferent);
       write.close();
   }

    public ArrayList<Oferent> readOferent() throws IOException, ClassNotFoundException {
        ObjectInputStream read = new ObjectInputStream(new FileInputStream("src/main/resources/file/oferents.dat"));
        ArrayList<Oferent> oferent = (ArrayList<Oferent>) read.readObject();
        read.close();
        return oferent;
    }

    public void writeCompany(ArrayList<Company> company) throws IOException {
        ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("src/main/resources/file/companys.dat"));
        write.writeObject(company);
        write.close();
    }

    public ArrayList<Company> readCompany() throws IOException, ClassNotFoundException {
        ObjectInputStream read = new ObjectInputStream(new FileInputStream("src/main/resources/file/companys.dat"));
        ArrayList<Company> company = (ArrayList<Company>) read.readObject();
        read.close();
        return company;
    }

    public void writeChargeCompany(Map<String, ArrayList<Charge>> charge) throws IOException {
        ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("src/main/resources/file/chargeCompany.dat"));
        write.writeObject(charge);
        write.close();
    }

    public Map<String, ArrayList<Charge>> readChargeCompany() throws IOException, ClassNotFoundException {
        ObjectInputStream read = new ObjectInputStream(new FileInputStream("src/main/resources/file/chargeCompany.dat"));
        Map<String, ArrayList<Charge>> charge = (Map<String, ArrayList<Charge>>) read.readObject();
        read.close();
        return charge;
    }

    public void writeChargeTransport(Map<String, ArrayList<Charge>> charge) throws IOException {
        ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("src/main/resources/file/chargeTransport.dat"));
        write.writeObject(charge);
        write.close();
    }

    public Map<String, ArrayList<Charge>> readChargeTransport() throws IOException, ClassNotFoundException {
        ObjectInputStream read = new ObjectInputStream(new FileInputStream("src/main/resources/file/chargeTransport.dat"));
        Map<String, ArrayList<Charge>> charge = (Map<String, ArrayList<Charge>>) read.readObject();
        read.close();
        return charge;
    }
}
