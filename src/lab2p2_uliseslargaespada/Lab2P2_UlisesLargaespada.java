package lab2p2_uliseslargaespada;

import java.util.*;

/**
 *
 * @author ularg
 */
public class Lab2P2_UlisesLargaespada {
  private static boolean loginState;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Set loginState to false
    loginState = false;

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
      System.out.println("5 - Salir \n");

      System.out.print("Ingrese la opción: ");
      int option = entry.nextInt();

      switch (option) {
        case 1 -> {
          inmuebles = registrarInmuebles(loginState, inmuebles);
        }

        case 2 -> {
          inmuebles = manejoDeEstados(loginState, inmuebles);
        }

        case 3 -> {
          loginState = loginOrSignp(loginState);
        }
        
        case 4 -> {
          loginState = logout(loginState);
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
  public static ArrayList registrarInmuebles(boolean loginInfo, ArrayList inmuebles) {
    ArrayList updateInmuebles = inmuebles;
    
    return updateInmuebles;
  }
  
  // Metodo para manejar el estado de las casas o edificios
  public static ArrayList manejoDeEstados(boolean loginInfo, ArrayList inmuebles) {
    ArrayList updateEstadosInmuebles = inmuebles;
    
    return updateEstadosInmuebles;
  }
  
  // Metodo para manejar el inicio de sesion
  public static boolean loginOrSignp(boolean loginInfo) {
    boolean updatedLogin = loginInfo;
    
    return updatedLogin;
  }
  
  // Metodo para manejar el espape de sesion
  public static boolean logout(boolean loginInfo) {
    boolean updatedLogin = loginInfo;
    
    return updatedLogin;
  }
}
