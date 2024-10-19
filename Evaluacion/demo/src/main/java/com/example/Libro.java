package com.example;

public class Libro extends Material {
        private String isbn;
        private int numeroPaginas;
    
        public Libro(String titulo, String autor, int añoPublicacion, String isbn, int numeroPaginas) {
            super(titulo, autor, añoPublicacion);
            this.isbn = isbn;
            this.numeroPaginas = numeroPaginas;
        }
    
        @Override
        public String getTipoMaterial() {
            return "Libro";
        }
    
        @Override
        public double calcularTarifaPrestamo(int diasPrestamo) {
            double tarifaBase = 2.0;
            double recargo = numeroPaginas > 500 ? 1.0 : 0.0;
            return (tarifaBase + recargo) * diasPrestamo;
        }
    
        public void mostrarDetallesLibro() {
            mostrarInformacion();
            System.out.println("ISBN: " + isbn);
            System.out.println("Número de Páginas: " + numeroPaginas);
        }
       
}
