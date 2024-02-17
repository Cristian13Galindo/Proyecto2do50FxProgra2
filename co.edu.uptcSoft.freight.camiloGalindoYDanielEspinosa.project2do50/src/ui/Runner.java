package ui;

import logic.HandlingUser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HandlingUser agend = new HandlingUser();
        boolean exit = true;
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
                    case 1 -> {
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
                                         1. Empresa de carga.
                                         2. Transportador
                                ***************************************
                                """);
                        byte typeUser = sc.nextByte();

                        agend.createUser(userName, password, typeUser);
                    }
                    case 2 -> {
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
                                         1. Empresa de carga.
                                         2. Transportador
                                ***************************************
                                """);
                        byte typeUser = sc.nextByte();

                        agend.createUser(userName, password, typeUser);

                    }


                    case 3 -> {
                        exit = false;
                        System.out.println("Hasta Luego");
                    }
                    default -> System.out.println("Digite una opcion valida");
                }
            } catch(InputMismatchException e){
                System.out.println("ingrese un valor valido" + e);
                sc.nextLine();
            }
        }
    }
}