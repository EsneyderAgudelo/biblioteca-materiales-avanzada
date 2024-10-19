package com.example;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Material> materiales;

    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.titulo.equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }

    public void mostrarCatalogo() {
        for (Material material : materiales) {
            material.mostrarInformacion();
            System.out.println("Tipo de Material: " + material.getTipoMaterial());
            System.out.println("-----------------------");
            if (material instanceof Libro) {
                ((Libro) material).mostrarDetallesLibro();
            } else if (material instanceof Revista) {
                ((Revista) material).mostrarDetallesRevista();
            } else if (material instanceof Audiovisual) {
                ((Audiovisual) material).mostrarDetallesAudiovisual();
            }
            System.out.println("=======================");
        }
    }
}

