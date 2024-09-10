package TareaAbstractFactory;

public class BancoGYT implements Banco {
    @Override
    public BancaEnLinea crearBancaEnLinea() {
        return new GYTBancaEnLinea();
    }

    @Override
    public CuentaBancaria crearCuentaAhorro() {
        return new GYTCuentaAhorro();
    }

    @Override
    public CuentaBancaria crearCuentaMonetaria() {
        return new GYTCuentaMonetaria();
    }
}
