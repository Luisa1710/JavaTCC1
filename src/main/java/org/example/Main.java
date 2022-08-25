package org.example;

import clase.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear objeto clase producto

        Producto producto= new Producto() ;

        //crear clase Scanner

        Scanner entradaPorTeclado = new Scanner(System.in);

        // preguntar usuario nombre producto
        System.out.println("Digite el nombre del producto: ");
        producto.nombre =  entradaPorTeclado.nextLine();

        System.out.println("El producto es: " + producto.nombre);


        //Crear objeto clase cliente

        Cliente cliente = new Cliente();

        System.out.println("Digite nombre: ");
        cliente.nombre = entradaPorTeclado.nextLine();
        System.out.println("Digite edad: ");
        cliente.edad = entradaPorTeclado.nextByte();
        System.out.println("Digite cedula: ");
        cliente.cedula = entradaPorTeclado.next();
        System.out.println("Digite si el descuento es valido o no: ");
        cliente.aplicaDescuento = entradaPorTeclado.nextBoolean();

        System.out.println("Nombre cliente:" + cliente.nombre);
        System.out.println("Nombre edad:" + cliente.edad);
        System.out.println("Nombre cedula:" + cliente.cedula);
        System.out.println("Nombre descuento valido:" + cliente.aplicaDescuento);


    }
}