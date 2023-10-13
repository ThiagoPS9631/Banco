class Conta{
    private int numero;
    private String titular;
    private double saldo;

    public boolean deposita(double grana){
        if (grana < 0){
            return false;
        }else{
            double novoSaldo = this.saldo + grana;
            this.saldo = novoSaldo;
            return true;
        }
    }

    public Boolean saca(double grana){
        if (this.saldo < grana){
            return false;
        }else{
            double novoSaldo = this.saldo - grana;
            this.saldo = novoSaldo;
            return true;
        }
    }

    public double getSaldo(){
        double meuSaldo = this.saldo;
        return meuSaldo;
    }

    public void setTitular(String nome){
        this.titular = nome;
    }

    public void setNumero(int num){
        if (num <= 0){
            System.out.println("Não foi possível definer o número da conta! \nTente novamente mais tarde");
        }else{
            this.numero = num;
            System.out.print("O número da conta foi definido com sucesso!");
        }
    }
}