public class Carro {
 public String modelo; 
 public String marca; 
 public int ano; 
 public String placa; 	
 
 public Carro(String modelo, String marca, int ano, String placa) {
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    this.placa = placa;
 
  public String getModelo() {
        return modelo;
   }

  public void setModelo(String modelo) {
        this.modelo = modelo;
  }

  public String getMarca() {
        return marca;
  }
  
  public void setMarca(String marca) {
        this.marca = marca;
   }

  public int getAno() {
        return ano;
    }
