public class PropuestaDeQuitar implements Propuesta {
  Prenda prenda;
  Guardarropa guardarropa;
  Boolean aceptada;

  public PropuestaDeQuitar(Prenda prenda) {
    this.prenda = prenda;
  }

  public void setAceptada() {
    aceptada = true;
  }

  public boolean fueAceptada() {
    return aceptada == true;
  }

  public void ejecutar() {
    guardarropa.quitar(prenda);
  }

  public void deshacer() {
    guardarropa.agregar(prenda);
  }

}
