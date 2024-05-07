//package FINAL;
import java.util.Scanner;
public class ChatBot {

        ////CREANDO LOS ARREGLOS (PARA USARLO COMO NUESTRA MINI BASE DE DATOS)
///////////////////////////////////////////////////////////
        static String[]ColorHiloStandar ={"Rojo","Azul","Verde"};
        static  Double[]ColorHiloStandarPrecio ={10.0,15.0,20.0};
        static  Double[]ColorHiloStandarDescuento ={0.05,0.08,0.09};
        //------------------------------------------------------------
        static   String[]ColorHiloDelgado ={"Negro","Blanco","Amarillo"};
        static  Double[]ColorHiloDelgadoPrecio ={25.0,30.0,32.0};
        static  Double[]ColorHiloDelgadoDescuento ={0.10,0.15,0.25};
        //------------------------------------------------------------
        static  String[]ColorHiloGrueso ={"Naranja","Gris","Fucsia"};
        static  Double[]ColorHiloGruesoPrecio = {32.0,35.0,45.0};
        static Double[]ColorHiloGruesoDescuento ={0.12,0.15,0.15};

        /////////////////////////////////////////////////////////////////////
        static Scanner scanner = new Scanner(System.in);

        //////////////////////////////////////////////////////////////////
        // LO PONEMOS AFUERA PARA  QUE SEAN GLOBALES PODER USARLO EN TODOS LOS METODOS

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String opcion;
            boolean continuar = true;
            int intentosFallidos = 0;

            System.out.println("¡Hola! Gracias por contactarte con nosotros. Escriba el número de su consulta a continuación:");

            // Corregido: Cambio en la condición del bucle while para usar solo la variable 'continuar' y 'intentosFallidos'
            while (continuar && intentosFallidos < 3) {
                System.out.println("\n1. Descripción por tipo de hilo");//DESCRIPCION TIPO HILO
                System.out.println("2. Consultar colores disponibles y sus precios"); //STOCK DE COLOR POR TIPO
                System.out.println("3. Consultar descuentos del día"); // PODRIA SER OFERTA DEL DIA !!cambiar!!
                System.out.println("4. Cotizar "); // COTIZACIONES USANDO STOCK DE COLOR POR TIPO
                System.out.println("5. Salir"); // CERRAR PROGRAMA


                opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":
                        opcion1();
                        intentosFallidos = 0;
                        break;
                    case "2":
                        opcion2();
                        intentosFallidos = 0;
                        break;
                    case "3":
                        opcion3();
                        intentosFallidos = 0;
                        break;
                    case "4":
                        opcion4();
                        intentosFallidos = 0;
                        break;
                    case "5":
                        continuar = false;
                        // Mejora: Mensaje de contacto directo en el case '5' para claridad.
                        System.out.println("Para más información comunicarte al 999999999");
                        break;
                    default:
                        intentosFallidos++;
                        if (intentosFallidos < 3) {
                            System.out.println("Opción no válida, Intenta de nuevo. Te quedan " + (3 - intentosFallidos) + " intentos.");
                            System.out.println("Elige otra opción o escribe '5' para salir.");
                        } else {
                            System.out.println("Número de intentos excedido.Hasta luego.");
                            continuar = false; // si se le da una opcion no valida mas de 3 veces el programa se cerrara
                        }
                        break;
                }

            }
            scanner.close();
        }

        private static void opcion1() {
            System.out.println("Selecciona el tipo de hilo:");
            System.out.println("1. Hilo Estándar");
            System.out.println("2. Hilo Delgado");
            System.out.println("3. Hilo Grueso");

            String seleccion = scanner.nextLine();

            switch (seleccion) {
                case "1":
                    System.out.println("Hilo Estándar: Es un hilo versátil, adecuado para la mayoría de los proyectos de costura.");
                    ;
                    break;
                case "2":
                    System.out.println("Hilo Delgado: Ideal para tejidos finos o para proyectos de costura que requieren detalles finos.");
                    break;
                case "3":
                    System.out.println("Hilo Grueso: Mejor para tejidos pesados o para proyectos que necesitan un hilo más resistente.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor selecciona un número del 1 al 3.");
                    break;
            }
        }

        private static void opcion2() {
            {
                System.out.println("Indique el tipo de hilo deseado para mostrar los colores disponibles:\n" +
                        "1. Hilo Standard:\n" +
                        "2. Hilo Delgado:\n" +
                        "3. Hilo Grueso:\n");
                Scanner scanner = new Scanner(System.in);
                int opcion = scanner.nextInt();
                System.out.println("Los precios de Hilos  son ");
                switch (opcion) {
                    case 1:

                        for (int i = 0; i < ColorHiloStandar.length; i++) {// usamos length para saber cuantos productos hay en el arreglo y con eso validamos los colores y los imprime segun el contador
                            System.out.println("Para para hilo Standard " + ColorHiloStandar[i] + " es " + ColorHiloStandarPrecio[i] + " soles el kilo.");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < ColorHiloDelgado.length; i++) {
                            System.out.println("Para para hilo delgado  " + ColorHiloDelgado[i] + " es " + ColorHiloDelgadoPrecio[i] + " soles el kilo.");
                        }
                        break;
                    case 3:
                        for (int i = 0; i < ColorHiloGrueso.length; i++) {
                            System.out.println("Para para hilo grueso " + ColorHiloGrueso[i] + " es " + ColorHiloGruesoPrecio[i] + " soles el kilo.");
                        }

                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                        break;
                }

            }

        }

        private static void opcion3() {
            {
                System.out.println("Indique el tipo de hilo deseado para mostrar las OFERTAS disponibles:\n" +
                        "1. Hilo Standard:\n" +
                        "2. Hilo Delgado:\n" +
                        "3. Hilo Grueso:\n");
                Scanner scanner = new Scanner(System.in);
                int opcion = scanner.nextInt();
                System.out.println("Los precios de Hilos  son ");
                switch (opcion) {
                    case 1:

                        for (int i = 0; i < ColorHiloStandar.length; i++) {
                            System.out.println("Hilo Standard " + ColorHiloStandar[i] + " con" + ColorHiloStandarDescuento[i] *100+ "%  de Descuento ");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < ColorHiloDelgado.length; i++) {
                            System.out.println("Hilo delgado  " + ColorHiloDelgado[i] + " con " + ColorHiloDelgadoDescuento[i]*100 + "%  de Descuento ");
                        }
                        break;
                    case 3:
                        for (int i = 0; i < ColorHiloGrueso.length; i++) {
                            System.out.println("Hilo grueso " + ColorHiloGrueso[i] + " con " + ColorHiloGruesoDescuento[i]*100 + "%  de Descuento ");
                        }

                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                        break;
                }
            }
        }


        private static void opcion4() {
            // Imprime las opciones disponibles para el tipo de hilo.
            System.out.println("Selecciona el tipo de hilo que deseas cotizar:");
            System.out.println("1.- Hilos de tipo Standar");
            System.out.println("2.- Hilos Delgados");
            System.out.println("3.- Hilos Gruesos");
            System.out.print("Ingresa el número de tu elección: ");

            // Lee la elección del usuario utilizando un objeto Scanner.
            int tipo = scanner.nextInt();

            // Utiliza un switch para manejar las diferentes opciones de tipo de hilo.
            switch (tipo) {
                case 1:
                    // Llama al método 'cotizarHilo' con los arrays correspondientes a hilos estándar.
                    cotizarHilo(scanner, ColorHiloStandar, ColorHiloStandarPrecio, ColorHiloStandarDescuento);
                    break;
                case 2:
                    // Llama al método 'cotizarHilo' con los arrays correspondientes a hilos delgados.
                    cotizarHilo(scanner, ColorHiloDelgado, ColorHiloDelgadoPrecio, ColorHiloDelgadoDescuento);
                    break;
                case 3:
                    // Llama al método 'cotizarHilo' con los arrays correspondientes a hilos gruesos.
                    cotizarHilo(scanner, ColorHiloGrueso, ColorHiloGruesoPrecio, ColorHiloGruesoDescuento);
                    break;
                default:
                    // Manejo de una elección inválida.
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        // Método para cotizar un hilo según el color y la cantidad deseada.
        private static void cotizarHilo(Scanner scanner, String[] colores, Double[] precios, Double[] descuentos) {
            // Presenta los colores disponibles y sus precios con descuentos.
            System.out.println("Colores disponibles:");
            for (int i = 0; i < colores.length; i++) {//valida cuantas veces se va imprimir validando la longitud de colore (cuantos elementos tiene el arreglo  )
                System.out.println((i + 1) + ".- " + colores[i] + " a " + precios[i] + " soles el kilo (Descuento del " + (int)(descuentos[i] * 100) + "%)");
            }
            System.out.print("Elige el color: ");

            // Captura la elección del color y ajusta el índice (los índices del array comienzan en 0).
            int eleccionColor = scanner.nextInt() - 1;

            // Verifica que la elección del color sea válida.
            if (eleccionColor >= 0 && eleccionColor < colores.length) {
                // Solicita la cantidad de kilos a comprar.
                System.out.print("¿Cuántos kilos deseas comprar? ");
                int kilos = scanner.nextInt();
                // Calcula el precio total sin descuento.
                double precioTotal = kilos * precios[eleccionColor];
                // Calcula el descuento aplicable.
                double descuentoAplicado = precioTotal * descuentos[eleccionColor];
                // Calcula el precio final después del descuento.
                double precioFinal = precioTotal - descuentoAplicado;


                // Imprime un resumen de la compra.
                System.out.printf("Has elegido comprar %d kilos de hilo %s.\n", kilos, colores[eleccionColor]);
                System.out.printf("El precio total es de %.2f soles, con un descuento de %.2f soles, por lo que el total a pagar es de %.2f soles.\n",
                        precioTotal, descuentoAplicado, precioFinal);

            } else {
                // Maneja una elección de color no válida.
                System.out.println("Opción de color no válida.");
            }
        }

    }

