package Persistence;

import java.io.*;
import java.util.ArrayList;

public class Persistence {
   public void write(ArrayList<String> objeto) throws IOException {
       ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("C:\\Users\\angel\\OneDrive\\Documentos\\ProyectDocuments\\documents.dat"));
       write.writeObject(objeto);
       write.close();
   }
   public ArrayList<String> read() throws IOException, ClassNotFoundException {
       ObjectInputStream read = new ObjectInputStream(new FileInputStream("C:\\Users\\angel\\OneDrive\\Documentos\\ProyectDocuments\\documents.dat"));
  ArrayList<String> objeto= (ArrayList<String>) read.readObject();
  read.close();
  return objeto;
   }

}
