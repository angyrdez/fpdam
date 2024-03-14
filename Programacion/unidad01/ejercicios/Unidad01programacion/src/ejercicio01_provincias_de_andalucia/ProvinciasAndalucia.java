package ejercicio01_provincias_de_andalucia;

public class ProvinciasAndalucia {

    // Definimos el enum con las provincias
    public enum Provincias {ALMERIA,CADIZ,CORDOBA,GRANADA,HUELVA,MALAGA,JAEN,SEVILLA};


    public static void main(String[] args) {

        // Declaramos una variable de tipo Provincias (enum) y le asignamos el objeto de tipo enum.
        Provincias miProvincia;

        // Ejemplos
        miProvincia = Provincias.MALAGA;
        System.out.println("Soy de: " + miProvincia);

        miProvincia = Provincias.SEVILLA;
        System.out.println("La provincia donde vivo es: " + miProvincia);


        System.out.println("PROVINCIAS DE ANDALUCÍA");
        System.out.println("-----------------------");

        System.out.println(miProvincia = Provincias.ALMERIA);
        System.out.println(miProvincia = Provincias.CADIZ);
        System.out.println(miProvincia = Provincias.CORDOBA);
        System.out.println(miProvincia = Provincias.GRANADA);
        System.out.println(miProvincia = Provincias.HUELVA);
        System.out.println(miProvincia = Provincias.MALAGA);
        System.out.println(miProvincia = Provincias.JAEN);
        System.out.println(miProvincia = Provincias.SEVILLA);

    }
}
