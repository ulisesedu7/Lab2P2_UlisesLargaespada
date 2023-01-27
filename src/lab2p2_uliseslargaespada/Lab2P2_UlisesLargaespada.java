package lab2p2_uliseslargaespada;

import java.util.*;

/**
 *
 * @author ularg
 */
public class Lab2P2_UlisesLargaespada {

  // Usuario de la sesion del momento 
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
    System.out.println("Aqui podrás realizar administracion en el sistema de bienes y racies Black Floyd");
    System.out.println("Es posible registrar inmuebles, manejar sus estados, y mas");
    System.out.println("Primero tendras que iniciar sesion para poder hacer algun cambio");

    System.out.println("¿Cómo te llamas?");
    String nombre = entry.nextLine();

    System.out.println("Mucho gusto " + nombre + "\n");

    // ArrayLists para cada
    ArrayList inmuebles = new ArrayList();
    ArrayList<User> usuarios = new ArrayList();

    do {
      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - Registro de Inmuebles/Solares");
      System.out.println("2 - Manejo de Estados");
      System.out.println("3 - Log In/Sign Up");
      System.out.println("4 - Log Out");
      System.out.println("5 - Vender Inmuebles");
      System.out.println("6 - Salir \n");

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
          inmuebles = venderInmuebles(currentUser, inmuebles);
        }

        default ->
          System.out.println("Elija una opcion de las anteriores");
      }

      // Salir del programa 
      if (option == 6) {
        break;
      }
    } while (true);
  }

  // Metodo para administrar el registro de cosas
  public static ArrayList registrarInmuebles(ArrayList inmuebles) {
    ArrayList updateInmuebles = inmuebles;

    return updateInmuebles;
  }

  // Metodo para manejar el estado de las casas o edificios
  public static ArrayList manejoDeEstados(ArrayList inmuebles) {
    ArrayList updateEstadosInmuebles = inmuebles;

    return updateEstadosInmuebles;
  }

  // Metodo para manejar el inicio de sesion
  public static ArrayList loginOrSignp(ArrayList<User> usuarios) {
    System.out.println("--Aqui podras iniciar sesion o crear un usuario--");
    // Initialize scanner
    Scanner entry = new Scanner(System.in);

    ArrayList<User> updatedUser = usuarios;

    System.out.println("Elija la option que desea");
    System.out.println("1 - Iniciar Sesion con un Usuario");
    System.out.println("2 - Crear un nuevo usuario");

    int option = entry.nextInt();

    switch (option) {
      case 1 -> {
        logInUser();

      }

      case 2 -> {

      }

      default -> {
        System.out.println("Opcion no listada - Regreso al menu principal \n");
      }
    }

    return updatedUser;
  }

  // Metodo para iniciar sesion
  public static User logInUser() {
    System.out.println("Aqui podras iniciar iniciar sesion");

    // Initialize scanner
    Scanner entry = new Scanner(System.in);

    System.out.print("Indica el username: ");
    String username = entry.nextLine();
    
    System.out.print("Indique la password: ");
    String password = entry.nextLine();
    
    User nuevoUsuario = new User();
    
    return nuevoUsuario;
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
    
    return nuevoUsuario;
  }
  // Metodo para manejar el espape de sesion
  public static void logout() {
     if(currentUser.isLoginState()) {
       
     } else {
       System.out.println("No has iniciado sesion todavia");
     }
  }

  // Metodo para las ventas de cosas
  public static ArrayList venderInmuebles(User currentUser, ArrayList inmuebles) {
    ArrayList updateInmuebles = inmuebles;

    return updateInmuebles;
  }
}
