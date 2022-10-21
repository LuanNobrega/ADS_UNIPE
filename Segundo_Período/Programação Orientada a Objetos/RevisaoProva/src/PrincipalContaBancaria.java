public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Luan", 1000);
        System.out.println(c1);
        c1.setNome("João");
        System.out.println(c1);
        c1.setSaldo(1500);
        System.out.println(c1);
        c1.sacar(900);
        System.out.println("Saldo após sacar: " + c1.getSaldo());
        c1.depositar(2000);
        System.out.println("Saldo após depositar: " + c1.getSaldo());
    }
}
