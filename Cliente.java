public class Cliente {
	 private String nome; 
	 private int cpf; 
	 private int dataNascimento;

public Cliente(String nome, int cpf, int dataNascimento) {
	this.nome= nome;
	this.cpf= cpf;
	this.dataNascimento= dataNascimento; 
}
public String getNome() { 
	return nome; 
}
public void setNome(String nome) { 
   this.nome= nome;
}
public int getCpf() { 
	return cpf; 
}
public void setCpf(int cpf) { 
	this.cpf= cpf;
}
public int getDataNascimento() { 
	return dataNascimento;
}
public void setDataNascimento(int dataNascimento) { 
	this.dataNascimento= dataNascimento;
}

}
