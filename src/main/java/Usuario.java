
import java.util.ArrayList;

public class Usuario {
  ArrayList<Guardarropa> guardarropas = new ArrayList<>();
  ArrayList<Propuesta> propuestasPendientes = new ArrayList<>();
  ArrayList<Propuesta> propuestasAceptadas = new ArrayList<>();

  public Usuario() {}

  public void agregarPrenda(Prenda prenda, Guardarropa guardarropa) {
    guardarropa.agregar(prenda);
  }

  public void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropas.add(guardarropa);
  }

  public void aceptarPropuesta(Propuesta propuesta) {
    quitarPropuestaPendiente(propuesta);
    agregarPropuestaAceptada(propuesta);
    propuesta.ejecutar();
  }

  public void rechazarPropuesta(Propuesta propuesta) {
    quitarPropuestaPendiente(propuesta);
  }

  public void agregarPropuestaPendiente(Propuesta propuesta) {
    propuestasPendientes.add(propuesta);
  }

  public void quitarPropuestaPendiente(Propuesta propuesta) {
    propuestasPendientes.remove(propuesta);
  }

  public void agregarPropuestaAceptada(Propuesta propuesta) {
    propuestasAceptadas.add(propuesta);
  }

  public void quitarPropuestaAceptada(Propuesta propuesta) {
    propuestasAceptadas.remove(propuesta);
  }

  public void deshacerPropuesta(Propuesta propuestaAceptada) {
    propuestaAceptada.deshacer();
    quitarPropuestaAceptada(propuestaAceptada);
  }
}
