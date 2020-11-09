package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlProducto {

    Scanner input = new Scanner(System.in);
    List<Producto> productos = new ArrayList<>();

    //Add new Product
    void addProducto() {
        Producto p = new Producto();

        System.out.print("Introduzca el ID del producto: ");
        p.setId(input.nextInt());
        input.nextLine();
        System.out.print("Introduzca el nombre del producto: ");
        p.setNom(input.nextLine());

        System.out.print("Introduzca el precio del producto: ");
        p.setPreu(input.nextFloat());

        productos.add(p);
        System.out.println("Producto "+ p +" añadido.");
    }


    //Delete product
    void deleteProducto(int id) {
        productos.remove(id);
    }

    //Update product
    void updateProducto(){
        productos.set();
    }

    //List of products
    void listProducto(){
        productos.forEach(System.out::println);
    }
}