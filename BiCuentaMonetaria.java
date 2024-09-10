package TareaAbstractFactory;

public class BiCuentaMonetaria implements CuentaBancaria {
    @Override
    public void tipoDeCuenta() {
        System.out.println("Cuenta Monetaria en BI");
    }
}
