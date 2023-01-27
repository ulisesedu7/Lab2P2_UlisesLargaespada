package lab2p2_uliseslargaespada;

import java.awt.Color;

/**
 *
 * @author ularg
 */
public class Casa {
  private int numeroCasa;
  private int numeroBloque;
  private Color colorCasa;
  private float ancho;
  private float largo;
  private int numeroBaths;
  private int numeroCuartos;
  private String estado;
  private User owner;

  public Casa() {
  }

  public Casa(int numeroCasa, int numeroBloque, Color colorCasa, float ancho, float largo, int numeroBaths, int numeroCuartos) {
    this.numeroCasa = numeroCasa;
    this.numeroBloque = numeroBloque;
    this.colorCasa = colorCasa;
    this.ancho = ancho;
    this.largo = largo;
    this.numeroBaths = numeroBaths;
    this.numeroCuartos = numeroCuartos;
    this.estado = "Estado de Demolicion";
  }

  public int getNumeroCasa() {
    return numeroCasa;
  }

  public void setNumeroCasa(int numeroCasa) {
    this.numeroCasa = numeroCasa;
  }

  public int getNumeroBloque() {
    return numeroBloque;
  }

  public void setNumeroBloque(int numeroBloque) {
    this.numeroBloque = numeroBloque;
  }

  public Color getColorCasa() {
    return colorCasa;
  }

  public void setColorCasa(Color colorCasa) {
    this.colorCasa = colorCasa;
  }

  public float getAncho() {
    return ancho;
  }

  public void setAncho(float ancho) {
    this.ancho = ancho;
  }

  public float getLargo() {
    return largo;
  }

  public void setLargo(float largo) {
    this.largo = largo;
  }

  public int getNumeroBaths() {
    return numeroBaths;
  }

  public void setNumeroBaths(int numeroBaths) {
    this.numeroBaths = numeroBaths;
  }

  public int getNumeroCuartos() {
    return numeroCuartos;
  }

  public void setNumeroCuartos(int numeroCuartos) {
    this.numeroCuartos = numeroCuartos;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  @Override
  public String toString() {
    return "Casa{" + "numeroCasa=" + numeroCasa + ", numeroBloque=" + numeroBloque + ", colorCasa=" + colorCasa + ", ancho=" + ancho + ", largo=" + largo + ", numeroBaths=" + numeroBaths + ", numeroCuartos=" + numeroCuartos + '}';
  }
  
}
