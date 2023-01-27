package lab2p2_uliseslargaespada;

/**
 *
 * @author ularg
 */
public class Solar {
  private float ancho;
  private float largo;
  private float area;
  private User owner;

  public Solar() {
  }

  public Solar(float ancho, float largo) {
    this.ancho = ancho;
    this.largo = largo;
    this.area = this.largo*this.ancho;
  }

  public float getAncho() {
    return ancho;
  }

  public void setAncho(float ancho) {
    this.ancho = ancho;
  }

  public float getArea() {
    return area;
  }

  public void setArea(float area) {
    this.area = area;
  }

  public float getLargo() {
    return largo;
  }

  public void setLargo(float largo) {
    this.largo = largo;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  @Override
  public String toString() {
    return "Solar{" + "ancho=" + ancho + ", largo=" + largo + ", area=" + area + '}';
  }
  
}
