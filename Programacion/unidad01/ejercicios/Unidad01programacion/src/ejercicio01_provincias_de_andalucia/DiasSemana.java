package ejercicio01_provincias_de_andalucia;

public class DiasSemana {

    public enum Dias {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};

    public static void main(String[] args) {

        // DECLARACIÓN DE VARIABLES

        Dias diaActual = Dias.JUEVES;
        Dias diaPreferido = Dias.VIERNES;

        System.out.println("Mi dia preferido de la semana es el: " + diaPreferido);
        System.out.println("Hoy es: " + diaActual);
    }

}
