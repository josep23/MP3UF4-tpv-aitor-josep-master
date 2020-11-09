package com.company;

import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    ControlProducto controlProducto = new ControlProducto();
    Scanner scanner = new Scanner(System.in);
    public void show() {
        menuPrincipal();
    }
    private void menuPrincipal() {
        int option;
        do {
            System.out.println("1. Menú Productos");
            System.out.println("2. Menú Pedidos");
            System.out.println("3. Salir");
            System.out.print("Introduzca la opción: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    productosMenu();
                    break;

                case 2:
                    //pedidosMenu();
                    break;

                case 3:
                    System.out.println("Gracias, hasta la proxima.");
                    break;

                default:
                    System.out.println("Elige una opción valida.");
            }
        } while (option!=3);
    }

    private void productosMenu() {
        int option;
        System.out.println("**Menú Productos**");
        do{
            System.out.println("1. Añadir nuevos productos");
            System.out.println("2. Eliminar productos");
            System.out.println("3. Actualizar productos");
            System.out.println("4. Lista de productos");
            System.out.println("5. Salir");
            System.out.print("Introduzca la opción: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    controlProducto.addProducto();
                    break;

                case 2:
                    int id = scanner.nextInt();
                    controlProducto.deleteProducto(id);
                    break;

                case 3:
                    controlProducto.updateProducto();
                    break;

                case 4:
                    controlProducto.listProducto();
                    break;

                case 5:
                    System.out.println("Saliendo del Menú de Productos.");
                    break;

                default:
                    System.out.println("Elige una opción valida.");
            }
        }while (option!=5);
    }
}