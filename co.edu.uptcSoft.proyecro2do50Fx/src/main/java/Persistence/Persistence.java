package Persistence;

import model.Charge;
import model.Company;
import model.Oferent;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Persistence {
    //private ArrayList<Oferent> oferents = new ArrayList<>();
   // private ArrayList<Company> companies = new ArrayList<>();
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

}
