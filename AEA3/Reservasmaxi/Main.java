package Reservasmaxi;

import UTILIDADES.lectordatosterminal;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        lectordatosterminal sc = new lectordatosterminal();
        int opcion;
        System.out.println("Cuantos alojamientos quieres registrar?");
        int cuantos = sc.leerInt();
        Allotjament[] alojamientos = new Allotjament[cuantos];
        int capacitat;

       
        for (int i = 0; i < cuantos; i++) {
            System.out.println("Selecciona el tipo de alojamiento: ");
            System.out.println("1. Apartamento");
            System.out.println("2. Casa Rural");
            System.out.println("3. Habitación");
            int tipo = sc.leerInt();
            System.out.println("Introduce el nombre del alojamiento " + (i + 1) + ":");
            String nom = sc.leerString();
            System.out.println("Introduce el precio por noche:");
            double precio = sc.leerdouble();

            switch (tipo) {
                case 1:
                    System.out.println("Introduce la capacidad:");
                    capacitat = sc.leerInt();
                    System.out.println("Introduce el número de habitaciones:");
                    int habitacions = sc.leerInt();
                    System.out.println("¿Tiene cocina? (1 para Sí, 0 para No):");
                    boolean Cocina = sc.leerInt() == 1;
                    alojamientos[i] = new Apartament(nom, capacitat, habitacions, Cocina, precio);
                    break;

                case 2:
                    System.out.println("Introduce la capacidad:");
                    capacitat = sc.leerInt();
                    System.out.println("¿Tiene piscina? (1 para Sí, 0 para No):");
                    boolean piscina = sc.leerInt() == 1;
                    System.out.println("¿Tiene jardín? (1 para Sí, 0 para No):");
                    boolean jardin = sc.leerInt() == 1;
                    alojamientos[i] = new Casa(nom, capacitat, jardin, piscina, precio);
                    break;

                case 3:
                    System.out.println("Introduce el número de camas:");
                    int numLlits = sc.leerInt();
                    System.out.println("Introduce la capacidad:");
                    capacitat = sc.leerInt();
                    alojamientos[i] = new Habitacion(nom, capacitat, numLlits, precio);
                    break;

                default:
                    System.out.println("Tipo no válido.");
                    i--;
                    break;
            }
            System.out.println("Registrado con éxito.");
            System.out.println();
        }

        
        opcion = 0;
        while (opcion != 6) {
            System.out.println("\nMENÚ:");
            System.out.println("1. Mostrar alojamientos disponibles");
            System.out.println("2. Reservar alojamiento");
            System.out.println("3. Liberar alojamiento");
            System.out.println("4. Búsqueda personalizada");
            System.out.println("5. Ordenar resultados");
            System.out.println("6. Salir");
            System.out.println("Elige una opción: ");
            
            opcion = sc.leerInt();

            switch (opcion) {
                case 1:
                
                    for (Allotjament all : alojamientos) {
                        if (all.isDisponible()) {
                            all.Mostrar_informacio();
                            System.out.println("----");
                        }
                    }
                    break;

                case 2:
                 
                    System.out.println("Introduce el nombre del alojamiento a reservar: ");
                    String nom = sc.leerString();
                    System.out.println("¿Por cuántos días?");
                    int dias = sc.leerInt();
                    System.out.println("¿Para cuántas personas?");
                    int personas = sc.leerInt();
                    boolean found = false;
                    for (Allotjament all : alojamientos) {
                        if (all.getNom().equalsIgnoreCase(nom)) {
                            found = true;
                            if (all.reservar(dias, personas)) {
                                System.out.println("Alojamiento reservado con éxito.");
                            } else {
                                System.out.println("No se puede reservar. Verifica la disponibilidad o la capacidad.");
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Alojamiento no encontrado.");
                    }
                    break;

                case 3:
                    
                    System.out.println("Introduce el nombre del alojamiento a liberar: ");
                    nom = sc.leerString();
                    found = false;
                    for (Allotjament all : alojamientos) {
                        if (all.getNom().equalsIgnoreCase(nom)) {
                            found = true;
                            all.alliberar();
                            System.out.println("Alojamiento liberado con éxito.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Alojamiento no encontrado.");
                    }
                    break;

                case 4:
                   
                    System.out.println("Introduce el precio máximo por noche: ");
                    double precioMaximo = sc.leerdouble();
                    System.out.println("¿Quieres buscar por características específicas? (1 para sí, 0 para no): ");
                    int respuesta = sc.leerInt();

                    boolean filtrarCocina = false;
                    boolean filtrarJardinPiscina = false;

                    if (respuesta == 1) {
                        System.out.println("Selecciona las características que quieres filtrar:");
                        System.out.println("1. Filtrar por Cocina (solo para apartamentos)");
                        System.out.println("2. Filtrar por Jardín/Piscina (solo para casas rurales)");
                        int opcionCaracteristica = sc.leerInt();

                        if (opcionCaracteristica == 1) {
                            System.out.println("¿Filtrar por Cocina disponible? (1 para sí, 0 para no): ");
                            filtrarCocina = sc.leerInt() == 1;
                        } else if (opcionCaracteristica == 2) {
                            System.out.println("¿Filtrar por Jardín o Piscina disponible? (1 para sí, 0 para no): ");
                            filtrarJardinPiscina = sc.leerInt() == 1;
                        } else {
                            System.out.println("Opción no válida.");
                        }
                    }

                    
                    for (Allotjament all : alojamientos) {
                        if (all.getPrecioPorNoche() <= precioMaximo && all.cumpleCaracteristicas(filtrarCocina, filtrarJardinPiscina)) {
                            all.Mostrar_informacio();
                            System.out.println("----");
                        }
                    }
                    break;

                case 5:
                    
                    System.out.println("¿Cómo deseas ordenar los resultados?");
                    System.out.println("1. Precio de menor a mayor");
                    System.out.println("2. Precio de mayor a menor");
                    System.out.println("3. Características específicas (Jardín/Piscina/Cocina)");

                    int opcionOrdenar = sc.leerInt();
                    ordenarAlojamientos(alojamientos, opcionOrdenar);
                    break;

                case 6:
                    System.out.println("Saliendo.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    
    public static void ordenarAlojamientos(Allotjament[] alojamientos, int criterio) {
        Arrays.sort(alojamientos, (a1, a2) -> {
            switch (criterio) {
                case 1:
                    return Double.compare(a1.getPrecioPorNoche(), a2.getPrecioPorNoche()); // Ascendente
                case 2:
                    return Double.compare(a2.getPrecioPorNoche(), a1.getPrecioPorNoche()); // Descendente
                case 3:
                    
                    if (a1 instanceof Casa && a2 instanceof Casa) {
                        Casa casa1 = (Casa) a1;
                        Casa casa2 = (Casa) a2;
                        return Boolean.compare(casa2.isTePiscina() || casa2.isTeJardi(), casa1.isTePiscina() || casa1.isTeJardi());
                    } else if (a1 instanceof Apartament && a2 instanceof Apartament) {
                        Apartament apart1 = (Apartament) a1;
                        Apartament apart2 = (Apartament) a2;
                        return Boolean.compare(apart2.isTeCuina(), apart1.isTeCuina());
                    }
                    return 0;
                default:
                    return 0;
            }
        });

      
        System.out.println("Alojamientos ordenados:");
        for (Allotjament all : alojamientos) {
            all.Mostrar_informacio();
            System.out.println("----");
        }
    }
}
