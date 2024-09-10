package TareaAbstractFactory;

public interface Banco {
    BancaEnLinea crearBancaEnLinea();
    CuentaBancaria crearCuentaAhorro();
    CuentaBancaria crearCuentaMonetaria();
}
