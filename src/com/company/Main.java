package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	/*
Un supermercado registra con un codigo de 4 cifras sus productos.
Deseamos registrar todos aquellos que se han vendido en el dia. Se van a ingresar valores duplicados pero necesitamos mostrarlos una sola vez.
Aplicar Set/HashSet para la solucion
Los códigos se ingresan por teclado
 */
    Set<Integer>productosVendidos = new HashSet<>();
    Scanner sc= new Scanner(System.in);
    Integer codigoProducto= 0;
    do {
        System.out.println("Ingrese el código de 4 cifras del producto");
        codigoProducto= sc.nextInt();
        productosVendidos.add(codigoProducto);
        System.out.println("desea agregar otro? sino, digite 0");


    } while (codigoProducto != 0);

   Iterator<Integer> it = productosVendidos.iterator();
   while (it.hasNext()){
       Integer codigo = it.next();
       System.out.println("codigo vendido: "+codigo);
   }

   for (Integer producto : productosVendidos){
    System.out.println(producto);
}
    }
}
