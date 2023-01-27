package lab2p2_uliseslargaespada;

/**
 *
 * @author ularg
 */
public class Solar {
  private float ancho;
  private float largo;
  private float area;

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

  @Override
  public String toString() {
    return "Solar{" + "ancho=" + ancho + ", largo=" + largo + ", area=" + area + '}';
  }
  
}
