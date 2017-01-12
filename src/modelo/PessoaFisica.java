package modelo;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity

public class PessoaFisica implements Serializable {

	
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private static final long serialVersionUID = 1L;

	public PessoaFisica() {
		super();
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}   
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
   
}
