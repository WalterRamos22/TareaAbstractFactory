package TareaAbstractFactory;

public class GYTCuentaMonetaria implements CuentaBancaria {
    @Override
    public void tipoDeCuenta() {
        System.out.println("Cuenta Monetaria en GYT Continental");
    }
}
