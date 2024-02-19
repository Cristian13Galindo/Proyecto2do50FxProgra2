package ui;

import logic.CargoHangling;


import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    CargoHangling cargoHangling = new CargoHangling();
    boolean exit = true;

    public void menu() {
        int option;
        while (exit) {
            try {
                System.out.println("""

                        **************************************
                              Ingrese la opcion a elegir:
                        1.Crear Usuario.
                        2.Ingresar Usuario.

                        3.SALIR
                        ***************************************
                        """);
                option = sc.nextInt();
                switch (option) {
                    case 1 -> createUser();
                    case 2 -> loginUser();
                    case 3 -> {
                        exit = false;
                        System.out.println("Hasta Luego");
                    }
                    default -> System.out.println("Digite una opcion valida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opción válida");
            }
        }
    }

    public void createUser() {
        System.out.println("""
                ***************************************
                         Ingrese el nombre de usuario:
                ***************************************
                """);
        sc.nextLine();
        String userName = sc.nextLine();
        System.out.println("""
                ***************************************
                         Ingrese la contraseña:
                ***************************************
                """);
        String password = sc.nextLine();
        System.out.println("""
                ***************************************
                         Ingrese el tipo de usuario: 
                         1. Transportador
                         2. Empresa de Carga
                ***************************************
                """);
        byte typeUser = sc.nextByte();
        cargoHangling.createUser(userName, password, typeUser);
        System.out.println("Usuario creado");

    }

    public void loginUser() {
        System.out.println("""
                ***************************************
                         Ingrese usuario:
                ***************************************
                """);
        sc.nextLine();
        String userName = sc.nextLine();
        System.out.println("""
                ***************************************
                         Ingrese la contraseña:
                ***************************************
                """);
        String password = sc.nextLine();
        System.out.println("""
                ***************************************
                         Ingrese el tipo de usuario: 
                         1. Transportador
                         2. Empresa de carga
                ***************************************
                """);
        byte typeUser = sc.nextByte();
        if (typeUser == 1) {
            if (cargoHangling.loginUser(userName, password, typeUser)) {
                oferentMenu(userName);
            } else {
                System.out.println("Ese usuario no existe");
            }
        } else if (typeUser == 2) {
            if (cargoHangling.loginUser(userName, password, typeUser)) {
                companyMenu(userName);
            } else {
                System.out.println("Ese usuario no existe");
            }
        }
    }


    public void oferentMenu(String name) {
        int option;
        String companyName="";
        String id;
        boolean exit2 =false;
        while (!exit2) {
            try {
                System.out.println("""

                        **************************************
                              Ingrese la opcion a elegir:
                        1.Seleccionar carga.
                        2.Ver Cargas
                        3.Volver
                        ***************************************
                        """);
                option = sc.nextInt();
                switch (option) {
                    case 1 -> {
                        sc.nextLine();
                        System.out.println(cargoHangling.showAllJobs());
                        System.out.println("Ingrese el nombre de la compañia");
                        companyName = sc.nextLine();
                        if (cargoHangling.showJobs(companyName).equals("")){
                            System.out.println("no hay cargas aún");
                            break;
                        }
                        System.out.println("Ingrese el id del trabajo");
                        id = sc.nextLine();
                        System.out.println(cargoHangling.showDescription(companyName, id));
                        System.out.println("Desea aceptar el trabajo? 1: Sí, 2: No");
                        int pick = sc.nextByte();
                        if (pick==1) {
                            cargoHangling.addTransportist(companyName, id, name);
                            System.out.println("Carga agregada a: "+ name);
                        }else {
                            System.out.println("Entendido");
                        }
                    }
                    case 2 -> {
                        System.out.println(cargoHangling.showGetJobs(companyName));
                    }
                    case 3 ->exit2 = true;
                    default -> System.out.println("Digite una opcion valida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opción válida");
            }
        }
    }


    public void companyMenu(String userName) {
        int op;
        boolean exit = false;
        do {
            System.out.println("""
                    1: Crear cargas
                    2: Volver
                    """);
            op = sc.nextByte();
            switch (op) {
                case 1 -> createCharge(userName);
                case 2 -> exit = true;

            }
        } while (!exit);
    }

    public void createCharge(String userName){
        String description;
        String origin;
        String destination;
        Double value;
        String id;
        sc.nextLine();
        System.out.println("Ingrese la descripción");
        description =sc.nextLine();
        System.out.println("Ingrese el origen");
        origin= sc.nextLine();
        System.out.println("Ingrese el destino");
        destination= sc.nextLine();
        System.out.println("Ingrese el valor");
        value = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el id");
        id = sc.nextLine();
        cargoHangling.createCharge(userName, description,origin,destination,value,id);
        System.out.println("Carga creada");
    }
}

