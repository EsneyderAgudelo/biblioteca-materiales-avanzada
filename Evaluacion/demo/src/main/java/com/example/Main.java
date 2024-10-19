package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro l1 = new Libro("El arte de la prudencia", "Baltasar Gracián", 2022, "5445-5454-5454", 131);
        Revista r1 = new Revista("Lobos con piel de cordero", "Revistas Fraudulentas", 2017, 1, "febrero");
        Audiovisual audiovisual1 = new Audiovisual("Interestelar", "Christopher Nolan", 2014, "Blu-ray", 150);

        biblioteca.agregarMaterial(l1);
        biblioteca.agregarMaterial(r1);
        biblioteca.agregarMaterial(audiovisual1);
        System.out.println("********************************************");
        System.out.println("Catálogo de Biblioteca:");
        biblioteca.mostrarCatalogo();

        
        Material buscado = biblioteca.buscarMaterial("El arte de la prudencia");
        if (buscado != null) {
            System.out.println("EL material ha sido encontrado:");
            buscado.mostrarInformacion();
        } else {
            System.out.println("El material no encontrado.");
        }

        
        l1.devolver();
        r1.prestar();
        l1.prestar();
    }
}
