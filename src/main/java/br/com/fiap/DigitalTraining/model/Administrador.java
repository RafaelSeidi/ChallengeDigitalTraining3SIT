package br.com.fiap.DigitalTraining.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="administradores")
public class Administrador {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "administrador_id")
	private Long administradorId;
	
	@Column(name = "first_name", nullable = false, length = 25)
	private String firstName;
	
	@Column(name = "last_name", nullable = false, length = 25)
	private String lastName;
	
	@Column(name = "email", nullable = false, length = 25)
	private String email;
	
	@Column(name = "telefone", nullable = true, length = 20)
	private String telefone;
	
	@Column(name = "senha", nullable = false, length = 50)
	private String senha;
	
	// construtores
	
	public Administrador() {
		
	}

	public Administrador(Long administradorId, String firstName, String lastName, String email, String telefone, String senha) {
		this.administradorId = administradorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}

	// getters e setters
	
	public Long getAdministradorId() {
		return administradorId;
	}

	public void setAdministradorId(Long administradorId) {
		this.administradorId = administradorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	// to String
	
	@Override
	public String toString() {
		return "Administrador [administradorId=" + administradorId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", telefone=" + telefone + ", senha=" + senha + "]";
	}
	
}
