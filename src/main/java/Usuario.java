
import java.util.ArrayList;

public class Usuario {
  ArrayList<Guardarropa> guardarropas;
  ArrayList<Propuesta> propuestasPendientes;
  ArrayList<Propuesta> propuestasAceptadas;

  public Usuario() {}

  public void agregarPrenda(Prenda prenda, Guardarropa guardarropa) {
    guardarropa.agregar(prenda);
  }

  public void agregarGuardarropa(Guardarropa guardarropa) {
    guardarropas.add(guardarropa);
  }

  public void enviarPropuesta(Usuario usuario, Propuesta propuesta) {
    usuario.recibirPropuesta(propuesta);
  }

  public void recibirPropuesta(Propuesta propuesta) {
    agregarPropuestaPendiente(propuesta);
  }

  public void aceptarPropuesta(Propuesta propuesta) {
    quitarPropuestaPendiente(propuesta);
    propuesta.setAceptada();
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

  public void deshacerPropuesta(Propuesta propuesta) {
    if (propuesta.fueAceptada()) {
      propuesta.deshacer();
    }
  }
}
