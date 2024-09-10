package TareaAbstractFactory;

public class BancoBI implements Banco {
    @Override
    public BancaEnLinea crearBancaEnLinea() {
        return new BiBancaEnLinea();
    }

    @Override
    public CuentaBancaria crearCuentaAhorro() {
        return new BiCuentaMonetaria();
    }

    @Override
    public CuentaBancaria crearCuentaMonetaria() {
        return new BICuentaAhorro();
    }
}
