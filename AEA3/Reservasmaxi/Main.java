package Reservasmaxi;

import UTILIDADES.lectordatosterminal;

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

            switch (tipo) {
                case 1:
                    System.out.println("Introduce la capacidad:");
                    capacitat = sc.leerInt();
                    System.out.println("Introduce el número de habitaciones:");
                    int habitacions = sc.leerInt();
                    System.out.println("¿Tiene cocina? (1 para Sí, 0 para No):");
                    boolean Cocina = sc.leerInt() == 1;
                    alojamientos[i] = new Apartament(nom, capacitat, habitacions, Cocina);
                    System.out.println("Registrado con éxito.");
                    break;
                
                case 2:
                    System.out.println("Introduce la capacidad:");
                    capacitat = sc.leerInt();
                    System.out.println("¿Tiene piscina? (1 para Sí, 0 para No):");
                    boolean piscina = sc.leerInt() == 1;
                    System.out.println("¿Tiene jardín? (1 para Sí, 0 para No):");
                    boolean jardin = sc.leerInt() == 1;
                    alojamientos[i] = new Casa(nom, capacitat, jardin, piscina);
                    System.out.println("Registrado con éxito.");
                    break;
                
                case 3:
                    System.out.println("Introduce el número de camas:");
                    int numLlits = sc.leerInt();
                    System.out.println("Introduce la capacidad:");
                    capacitat = sc.leerInt();
                    alojamientos[i] = new Habitacion(nom, capacitat, numLlits);
                    System.out.println("Registrado con éxito.");
                    break;

                default:
                    System.out.println("Tipo no válido.");
                    i--; 
                    break;
            }
            System.out.println();
        }

        opcion = 0;
        while (opcion != 5) {
            System.out.println("\nMENÚ:");
            System.out.println("1. Mostrar alojamientos disponibles");
            System.out.println("2. Reservar alojamiento");
            System.out.println("3. Liberar alojamiento");
            System.out.println("4. Búsqueda personalizada");
            System.out.println("5. Salir");
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
                    boolean found = false;
                    for (Allotjament all : alojamientos) {
                        if (all.getNom().equalsIgnoreCase(nom)) {
                            found = true;
                            if (all.reservar()) {
                                System.out.println("Alojamiento reservado con éxito.");
                            } else {
                                System.out.println("Este alojamiento ya está reservado.");
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
                
                    if (respuesta == 1) {
                        System.out.println("Selecciona las características que quieres filtrar:");
                
                       
                        boolean filtrarCocina = false;
                        boolean filtrarJardinPiscina = false;
                        
                        
                        if (cuantos > 0) {
                            System.out.println("1. Filtrar por Cocina (solo para apartamentos)");
                            System.out.println("2. Filtrar por Jardín/Piscina (solo para casas rurales)");
                            int opcionCaracteristica = sc.leerInt();
                
                            
                            switch (opcionCaracteristica) {
                                case 1: 
                                    System.out.println("¿Quieres filtrar por Cocina disponible? (1 para sí, 0 para no): ");
                                    filtrarCocina = sc.leerInt() == 1;
                                    break;
                                case 2: 
                                    System.out.println("¿Quieres filtrar por Jardín o Piscina disponible? (1 para sí, 0 para no): ");
                                    filtrarJardinPiscina = sc.leerInt() == 1;
                                    break;
                                default:
                                    System.out.println("Opción no válida.");
                                    break;
                            }
                        }
                
                      
                        for (Allotjament all : alojamientos) {
                            boolean cumpleCocina = true;
                            boolean cumpleJardinPiscina = true;
                
                          
                            if (all instanceof Apartament) {
                                if (filtrarCocina && !((Apartament) all).isTeCuina()) {
                                    cumpleCocina = false;
                                }
                            } else if (all instanceof Casa) {
                                if (filtrarJardinPiscina) {
                                    Casa casa = (Casa) all;
                                    if (!casa.isTeJardi() && !casa.isTePiscina()) {
                                        cumpleJardinPiscina = false;
                                    }
                                }
                            }
                
                            if (all.costenoche() <= precioMaximo && cumpleCocina && cumpleJardinPiscina) {
                                all.Mostrar_informacio();
                                System.out.println("----");
                            }
                        }
                    } else {
                        
                        for (Allotjament all : alojamientos) {
                            if (all.costenoche() <= precioMaximo) {
                                all.Mostrar_informacio();
                                System.out.println("----");
                            }
                        }
                    }
                    break;
                

                case 5:
                    System.out.println("Saliendo.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
