package TareaAbstractFactory;

public class Main {
    public static void main(String[] args) {
        Banco banco = new BancoBI();
        BancaEnLinea bancaEnLinea = banco.crearBancaEnLinea();
        bancaEnLinea.login();
        CuentaBancaria cuentaAhorro = banco.crearCuentaAhorro();
        cuentaAhorro.tipoDeCuenta();
        CuentaBancaria cuentaMonetaria = banco.crearCuentaMonetaria();
        cuentaMonetaria.tipoDeCuenta();

        System.out.println();

        banco = new BancoGYT();
        bancaEnLinea = banco.crearBancaEnLinea();
        bancaEnLinea.login();
        cuentaAhorro = banco.crearCuentaAhorro();
        cuentaAhorro.tipoDeCuenta();
        cuentaMonetaria = banco.crearCuentaMonetaria();
        cuentaMonetaria.tipoDeCuenta();
    }
}
