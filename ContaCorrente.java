public class ContaCorrente {
  private int numeroDaConta; 
  private double saldo; 

 public ContaCorrente(int n, double s ) {
	 this.numeroDaConta = n;
	 this.saldo = s;
 }
 
 public int getnumeroDaConta() {
	 return numeroDaConta;
 }
 
 public double getSaldo(double saldo) { 
    return saldo; 
 }
	public void setSaldo(double valor) {
		this.saldo += saldo ;
}
	public void depositar(double valor) { 
		saldo += valor ;
	
} 
     public void sacar(double valor)	{
    	 if (valor<=saldo) {
    	 }else {
 }
     Sytem.out.println ("Saldo insuficiente.");
  }
     
     public String to.String() {
    	 return "Conta." + numeroDaConta + "\nsaldo:R$" + saldo;
     }
}
