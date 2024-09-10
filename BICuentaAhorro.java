package TareaAbstractFactory;

public class BICuentaAhorro implements CuentaBancaria {
    @Override
    public void tipoDeCuenta() {
        System.out.println("Cuenta de Ahorro en BI");
    }
}
