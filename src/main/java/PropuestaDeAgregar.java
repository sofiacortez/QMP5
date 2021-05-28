public class PropuestaDeAgregar implements Propuesta {
  Prenda prenda;
  Guardarropa guardarropa;
  Boolean aceptada;

  public PropuestaDeAgregar(Prenda prenda) {
    this.prenda = prenda;
  }

  public void setAceptada() {
    aceptada = true;
  }

  public boolean fueAceptada() {
    return aceptada == true;
  }

  public void ejecutar() {
    guardarropa.agregar(prenda);
  }

  public void deshacer() {
    guardarropa.quitar(prenda);
  }
}
