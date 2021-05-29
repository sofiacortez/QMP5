
import java.util.ArrayList;

public class Guardarropa {
  ArrayList<Prenda> prendas = new ArrayList<>();

  public Guardarropa(ArrayList<Prenda> prendas) {
    this.prendas = prendas;
  }

  public void quitar(Prenda prenda) {
    prendas.remove(prenda);
  }

  public void agregar(Prenda prenda) {
    prendas.add(prenda);
  }
}
