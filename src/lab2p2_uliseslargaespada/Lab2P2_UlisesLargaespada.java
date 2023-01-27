package lab2p2_uliseslargaespada;

import java.util.*;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author ularg
 */
public class Lab2P2_UlisesLargaespada {

  // Usuario de la sesion del momento como variable global
  private static User currentUser;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Set loginState to false
    currentUser = new User();
    currentUser.setLoginState(false);

    // Llamar al menu principal
    mainMenu();
  }

  public static void mainMenu() {
    // Initialize scanner
    Scanner entry = new Scanner(System.in);

    System.out.println("-- Bienvenido al Laboratorio #2 de Program II --");
    System.out.println("Aqui podrás realizar administracion en el sistema de bienes y raices Black Floyd");
    System.out.println("Es posible registrar inmuebles, manejar sus estados, y mas");
    System.out.println("Primero tendras que iniciar sesion para poder hacer algun cambio");

    System.out.println("¿Cómo te llamas?");
    String nombre = entry.nextLine();

    System.out.println("Mucho gusto " + nombre + "\n");

    // ArrayLists para cada
    ArrayList inmuebles = new ArrayList();
    ArrayList<User> usuarios = new ArrayList();

    // Crear el usuario admin
    User admin = new User("Ulises Largaespada", 23, "admin", "admin1234");

    usuarios.add(admin);

    do {
      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - Registro de Inmuebles/Solares");
      System.out.println("2 - Manejo de Estados");
      System.out.println("3 - Log In/Sign Up");
      System.out.println("4 - Log Out");
      System.out.println("5 - Salir \n");

      System.out.print("Ingrese la opción: ");
      int option = entry.nextInt();

      switch (option) {
        case 1 -> {
          inmuebles = registrarInmuebles(inmuebles);
        }

        case 2 -> {
          inmuebles = manejoDeEstados(inmuebles);
        }

        case 3 -> {
          usuarios = loginOrSignp(usuarios);
        }

        case 4 -> {
          logout();
        }

        case 5 -> {
          System.out.println("Ten un buen dia " + nombre);
        }

        default ->
          System.out.println("Elija una opcion de las anteriores");
      }

      // Salir del programa 
      if (option == 5) {
        break;
      }
    } while (true);
  }

  // Metodo para administrar el registro de cosas
  public static ArrayList registrarInmuebles(ArrayList inmuebles) {
    // Initialize scanner
    Scanner entry = new Scanner(System.in);

    ArrayList updateInmuebles = inmuebles;

    if (currentUser.isLoginState()) {
      System.out.println("Bienvenido " + currentUser.getNombre() + "!");
      System.out.println("En esta seccion podras hacer varias acciones en el registro de inmuebles");
      
      do {
        System.out.println("Elije la opcion que deseas: ");
        System.out.println("1 - Crear Casa/Edificios/Solares");
        System.out.println("2 - Listar Casa/Edificios/Solares");
        System.out.println("3 - Modificar Casa/Edificios/Solares");
        System.out.println("4 - Borrar Casa/Edificios/Solares");
        System.out.println("5 - Vender Casa/Edificios/Solares");
        System.out.println("6 - Regresar al menu principal");
        
        int option = entry.nextInt();
        
        switch(option) {
          case 1 -> {
            updateInmuebles = crearInmuebles(updateInmuebles);
          }
          
          case 2 -> {
            
          }
          
          case 3 -> {
            
          }
          
          case 4 -> {
            
          }
          
          case 5 -> {
            
          }
          
          case 6 -> {
            System.out.println("Regresando al menu principal \n");
          }
        }

        // Salir del programa 
        if (option == 5) {
          break;
        }
      } while (true);

    } else {
      System.out.println("No has iniciado sesion, por lo que no puedes ver esta seccion \n");
    }

    return updateInmuebles;
  }
  
  // Metodo para crear inmuebles
  public static ArrayList crearInmuebles(ArrayList inmuebles) {
    // Initialize scanner
    Scanner entry = new Scanner(System.in);
    
    ArrayList updateInmuebles = inmuebles;
    
    System.out.println("En este menu podras agregar inmuebles");
    System.out.println("Elije la opcion que desees agregar: ");
    System.out.println("1 - Crear casas");
    System.out.println("2 - Crear edificios");
    System.out.println("3 - Crear solares");
    
    int option = entry.nextInt();
    switch(option) {
      case 1 -> {
        System.out.println("Para crear una casa debes de brindar los siguientes parametros: ");
        System.out.print("Numero de casa: ");
        int numCasa = entry.nextInt();
        
        System.out.print("Numero de bloque: ");
        int numBloqueCasa = entry.nextInt();
        
        System.out.print("Color de la casa: ");
        Color colorCasa = JColorChooser.showDialog(null, "Seleccione un color", Color.red);
        
        System.out.print("Ancho de la casa: ");
        float ancho = entry.nextFloat();
        
        System.out.print("Largo de la casa: ");
        float largo = entry.nextFloat();
        
        System.out.print("Numero de baths: ");
        int numBaths = entry.nextInt();
        
        System.out.print("Numero de cuartos: ");
        int numRooms = entry.nextInt();
        
        Casa casaNueva = new Casa(numCasa, numBloqueCasa, colorCasa, ancho, largo, numBaths, numRooms);
        casaNueva.setOwner(currentUser);
       updateInmuebles.add(casaNueva);
       
        System.out.println("--Casa creada exitosamente!!--");       
      }
      
      case 2 -> {
        System.out.println("Para crear un edificio debes de brindar los siguientes parametros: ");
        System.out.print("Numero de pisos: ");
        int numPisos = entry.nextInt();
        
        System.out.print("Numero de locales: ");
        int numLocales = entry.nextInt();
        
        System.out.print("Describe la direccion: ");
        entry.nextLine();
        String direccion = entry.nextLine();
        
        Edificio edificioNuevo = new Edificio(numPisos, numLocales, direccion);
        edificioNuevo.setOwner(currentUser);
        
        updateInmuebles.add(edificioNuevo);
        
        System.out.println("--Edificio creado exitosamente!!--");
      }
      
      case 3 -> {
        System.out.println("Para crear un solar debes de brindar los siguientes parametros: ");
        
        System.out.print("Ancho del solar: ");
        float ancho = entry.nextFloat();
        
        System.out.print("Largo del solar: ");
        float largo = entry.nextFloat();
        
        Solar solarNuevo = new Solar(ancho, largo);
        solarNuevo.setOwner(currentUser);
        
        updateInmuebles.add(solarNuevo);
        
        System.out.println("--Solar creado exitosamente!!--");
      }
      
      default -> {
        System.out.println("Opcion no listada - Regresando al menu anterior");
      }
    }
    
    return updateInmuebles;
  }
  
  // Metodo para listar muebles
  public static void listarInmuebles(ArrayList inmuebles) {
    
  }
  
  // Metodo para modificar inmuebles
  public static ArrayList modificarInmuebles(ArrayList inmuebles) {
    // Initialize scanner
    Scanner entry = new Scanner(System.in);
    
    ArrayList updateInmuebles = inmuebles;
    
    return updateInmuebles;
  }
  
  // Metodo para borrar inmuebles
  public static ArrayList borrarInmuebles(ArrayList inmuebles) {
    // Initialize scanner
    Scanner entry = new Scanner(System.in);
    
    ArrayList updateInmuebles = inmuebles;
    
    return updateInmuebles;
  }
  
  // Metodo para vender inmuebles
  public static ArrayList venderInmuebles(ArrayList inmuebles) {
    // Initialize scanner
    Scanner entry = new Scanner(System.in);
    
    ArrayList updateInmuebles = inmuebles;
    
    return updateInmuebles;
  }
  

  // Metodo para manejar el estado de las casas o edificios
  public static ArrayList manejoDeEstados(ArrayList inmuebles) {
    ArrayList updateEstadosInmuebles = inmuebles;

    if (currentUser.isLoginState()) {

    } else {
      System.out.println("No has iniciado sesion como administrador, por lo que no puedes ver esta seccion \n");
    }

    return updateEstadosInmuebles;
  }

  // Metodo para manejar el inicio de sesion
  public static ArrayList loginOrSignp(ArrayList<User> usuarios) {
    System.out.println("--Aqui podras iniciar sesion o crear un usuario--");
    // Initialize scanner
    Scanner entry = new Scanner(System.in);

    ArrayList<User> updatedUsers = usuarios;

    System.out.println("Elija la option que desea");
    System.out.println("1 - Iniciar Sesion con un Usuario");
    System.out.println("2 - Crear un nuevo usuario");

    int option = entry.nextInt();

    switch (option) {
      case 1 -> {
        logInUser(updatedUsers);
      }

      case 2 -> {
        updatedUsers.add(singUpUser());
      }

      default -> {
        System.out.println("Opcion no listada - Regreso al menu principal \n");
      }
    }

    return updatedUsers;
  }

  // Metodo para iniciar sesion
  public static void logInUser(ArrayList<User> usuarios) {
    System.out.println("Aqui podras iniciar iniciar sesion");

    // Initialize scanner
    Scanner entry = new Scanner(System.in);

    System.out.print("Indica el username: ");
    String username = entry.nextLine();

    System.out.print("Indique la password: ");
    String password = entry.nextLine();

    // Comparar si existe un usuario con esas credeniales
    for (User user : usuarios) {
      if (user.getUsername().equals(username)) {
        if (user.getPassword().equals(password)) {
          System.out.println("Excelente!");
          System.out.println("Has iniciado sesion como: " + user.getUsername() + "\n");
        } else {
          System.out.println("Incorrect password \n");
        }
      } else {
        System.out.println("Ese username no existe \n");
      }
    }

    currentUser = new User();
    currentUser.setLoginState(true);

  }

  // Metodo para crear un nuevo usuario
  public static User singUpUser() {
    System.out.println("Aqui podras crear un usuario con toda su informacion correspondiente");

    // Initialize scanner
    Scanner entry = new Scanner(System.in);

    System.out.print("Indique el nombre completo del nuevo usuario: ");
    String nombre = entry.nextLine();

    System.out.print("Indique la edad del usuario: ");
    int edad = entry.nextInt();

    // Reiniciar scanner
    entry.nextLine();

    System.out.print("Indique el username: ");
    String username = entry.nextLine();

    System.out.print("Indique la password: ");
    String password = entry.nextLine();

    User nuevoUsuario = new User(nombre, edad, username, password);

    System.out.println("--Usuario creado Exitosamente--\n");

    return nuevoUsuario;
  }

  // Metodo para manejar el espape de sesion
  public static void logout() {
    if (currentUser.isLoginState()) {
      System.out.println("Saliendo de sesion...");
      System.out.println("Listo!");
      currentUser = new User();
      currentUser.setLoginState(false);

    } else {
      System.out.println("No has iniciado sesion todavia");
      System.out.println("Debes iniciar sesion primero para salir de una \n");
    }
  }
}
