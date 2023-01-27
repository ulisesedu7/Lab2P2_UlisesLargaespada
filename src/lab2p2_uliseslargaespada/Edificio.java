package lab2p2_uliseslargaespada;

/**
 *
 * @author ularg
 */
public class Edificio {
  private int numeroPisos;
  private int cantidadLocales;
  private String direccion;
  private String estado;
  
  public Edificio() {
  }

  public Edificio(int numeroPisos, int cantidadLocales, String direccion) {
    this.numeroPisos = numeroPisos;
    this.cantidadLocales = cantidadLocales;
    this.direccion = direccion;
  }

  public int getNumeroPisos() {
    return numeroPisos;
  }

  public void setNumeroPisos(int numeroPisos) {
    this.numeroPisos = numeroPisos;
  }

  public int getCantidadLocales() {
    return cantidadLocales;
  }

  public void setCantidadLocales(int cantidadLocales) {
    this.cantidadLocales = cantidadLocales;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return "Edificio{" + "numeroPisos=" + numeroPisos + ", cantidadLocales=" + cantidadLocales + ", direccion=" + direccion + '}';
  }
}
