package org.example;

import clase.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear objeto clase producto

        Producto producto = new Producto("limon",1500,"fruta acida");

        System.out.println("El nombre del producto es: " + producto.nombre);
        System.out.println("El precio del producto es: " + producto.precioUnitario);
        System.out.println("Descripcion del producto es: " + producto.descripcion);


        Cliente cliente = new Cliente("Luisa","1003154792",20, true);
    }
}