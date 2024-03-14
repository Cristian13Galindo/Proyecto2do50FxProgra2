package Persistence;

import model.Charge;
import model.Company;
import model.Oferent;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Persistence {
    //private Map<String, ArrayList<Charge>> userCompany = new HashMap<>();
    //private Map<String, ArrayList<Charge>> userTransport = new HashMap<>();

    public void writeOferent(ArrayList<Oferent> oferent) throws IOException {
       ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("C:\\Users\\angel\\OneDrive\\Documentos\\ProyectDocuments\\oferents.dat"));
       write.writeObject(oferent);
       write.close();
   }
   public ArrayList<Oferent> readoferent() throws IOException, ClassNotFoundException {
       ObjectInputStream read = new ObjectInputStream(new FileInputStream("C:\\Users\\angel\\OneDrive\\Documentos\\ProyectDocuments\\oferents.dat"));
  ArrayList<Oferent> oferent= (ArrayList<Oferent>) read.readObject();
  read.close();
  return oferent;
   }

    public void writeCompany(ArrayList<Company> company) throws IOException {
        ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("C:\\Users\\angel\\OneDrive\\Documentos\\ProyectDocuments\\companys.dat"));
        write.writeObject(company);
        write.close();
    }
    public ArrayList<Company> readCompany() throws IOException, ClassNotFoundException {
        ObjectInputStream read = new ObjectInputStream(new FileInputStream("C:\\Users\\angel\\OneDrive\\Documentos\\ProyectDocuments\\companys.dat"));
        ArrayList<Company> company= (ArrayList<Company>) read.readObject();
        read.close();
        return company;
    }

}
