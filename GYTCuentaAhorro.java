package TareaAbstractFactory;

public class GYTCuentaAhorro implements CuentaBancaria {
    @Override
    public void tipoDeCuenta() {
        System.out.println("Cuenta de Ahorro en GYT Continental");
    }
}
