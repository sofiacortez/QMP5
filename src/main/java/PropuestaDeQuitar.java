public class PropuestaDeQuitar implements Propuesta {
  Prenda prenda;
  Guardarropa guardarropa;

  public PropuestaDeQuitar(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  public void ejecutar() {
    guardarropa.quitar(prenda);
  }

  public void deshacer() {
    guardarropa.agregar(prenda);
  }

}
