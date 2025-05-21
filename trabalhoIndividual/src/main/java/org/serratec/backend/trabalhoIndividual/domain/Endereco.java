package org.serratec.backend.trabalhoIndividual.domain;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class Endereco {
	
	
	@NotBlank(message = "Rua é obrigatória.")
	private String rua;
	
	@NotBlank(message = "Cidade é obtigatória.")
	private String cidade;
	
	@NotBlank(message = "Estado é obrigatório. ")
	private String estado;
	
	@NotBlank(message = "CEP é obrigatório.")
	@Size(min = 9, max = 10, message = "Cep deve ter entre {min} e {max}")
	private String cep;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
