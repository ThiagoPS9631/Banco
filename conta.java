class Conta{
    private int numero;
    private String titular;
    private double saldo;
    
    public String getTitular(){
        String nomeTitular = this.titular;
        return nomeTitular;
    }
    public void setTitular(String nome){
        this.titular = nome;
    }
    
    public int getNumero(){
        int numeroConta = this.numero;
        return numeroConta;
    }
    public void setNumero(int num){
        if (num <= 0){
            System.out.println("Não foi possível definer o número da conta! \nTente novamente mais tarde");
        }else{
            this.numero = num;
            System.out.print("O número da conta foi definido com sucesso!");
        }
    }
    
    public double getSaldo(){
        double meuSaldo = this.saldo;
        return meuSaldo;
    }
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
    public boolean transfere(Conta destino, double grana){
        if (grana < 0){
            return false;
        }else{
            Double minhaGrana = this.saldo;
            if (minhaGrana < grana){
                return false;
            }else{
                minhaGrana -= grana;
                this.saldo = minhaGrana;

                destino.deposita(grana);

                return true;
            }
        }
    }

}