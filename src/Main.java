//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Int
    // Ejercicio 1: Calcular el número de páginas que faltan por leer en un libro
    public static void paginasPorLeer() {
        int totalPaginas = 300;
        int leidas = 120;
        int faltan = totalPaginas - leidas;
        System.out.println("faltan " + faltan + " páginas por leer del libro de 300 paginas.");
    }

    // Ejercicio 2: Calcular cuántos segundos tiene una hora
    public static void segundosEnUnaHora() {
        int minutos = 60;
        int segundosPorMinuto = 60;
        int totalSegundos = minutos * segundosPorMinuto;
        System.out.println("una hora toene " + totalSegundos + " segundos.");
    }

    // Double
    // Ejercicio 3: Calcular el precio final de un producto con descuento
    public static void precioConDescuento() {
        double precio = 150.0;
        double descuento = 0.20; // 20%
        double precioFinal = precio - (precio * descuento);
        System.out.println("el precio con descuento es: " + precioFinal);
    }

    // Ejercicio 4: Convertir grados Celsius a Fahrenheit
    public static void convertirTemperatura() {
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " °c equivalen a " + fahrenheit + " °F.");
    }

    // Char
    // Ejercicio 5: Mostrar la inicial de un nombre
    public static void inicialNombre() {
        char inicial = 'E';
        System.out.println("la inicial del nombre es: " + inicial);
    }

    // Ejercicio 6: Mostrar el siguiente carácter en Unicode
    public static void siguienteCaracter() {
        char letra = 'C';
        char siguiente = (char)(letra + 1);
        System.out.println("después de " + letra + " viene " + siguiente);
    }

    // Boolean
    // Ejercicio 7: Verificar si un número es par
    public static void numeroPar() {
        int numero = 14;
        boolean esPar = numero % 2 == 0;
        System.out.println("el número " + numero + " es par? " + esPar);
    }

    // Ejercicio 8: Comprobar si un estudiante aprobo
    public static void estudianteAprobado() {
        double nota = 3.2;
        boolean aprobado = nota >= 3.0;
        System.out.println("el estudiante aprobo? " + aprobado);
    }

    // main
    public static void main(String[] args) {
        paginasPorLeer();
        segundosEnUnaHora();
        precioConDescuento();
        convertirTemperatura();
        inicialNombre();
        siguienteCaracter();
        numeroPar();
        estudianteAprobado();
    }
}