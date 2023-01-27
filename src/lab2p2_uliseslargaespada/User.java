/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_uliseslargaespada;

/**
 *
 * @author ularg
 */
public class User {
  private String nombre;
  private int edad;
  private String username;
  private String password;
  
  public User(){
  }

  public User(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public User(String nombre, int edad, String username, String password) {
    this.nombre = nombre;
    this.edad = edad;
    this.username = username;
    this.password = password;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" + "nombre=" + nombre + ", edad=" + edad + ", username=" + username + ", password=" + password + '}';
  }
  
}
