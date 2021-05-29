public class PropuestaDeAgregar implements Propuesta {
  Prenda prenda;
  Guardarropa guardarropa;

  public PropuestaDeAgregar(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  public void ejecutar() {
    guardarropa.agregar(prenda);
  }

  public void deshacer() {
    guardarropa.quitar(prenda);
  }
}
