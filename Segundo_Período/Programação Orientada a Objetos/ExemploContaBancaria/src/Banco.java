public class Banco {
    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria("Luan", 4000);
        ContaBancaria c2 = new ContaBancaria("Yasmin", 5000);
        c1.depositar(500);
        System.out.println("A conta de "+ c1.getNomeDoDono()+" possui saldo novo é de "+ c1.getSaldo());
        c2.sacar(350);
        c2.setNomeDoDono("Laranja");
        c2.setSaldo(200);
        System.out.println("A conta de " + c2.getNomeDoDono() + " possui saldo de R$" + c2.getSaldo());
    }
}
