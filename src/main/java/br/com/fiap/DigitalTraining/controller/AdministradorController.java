package br.com.fiap.DigitalTraining.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.DigitalTraining.model.Administrador;
import br.com.fiap.DigitalTraining.service.AdministradorService;

final class JsonAdminLogin {
	private String email;
	private String senha;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}

final class JsonAdminUpdate {
	private Long administradorId;
	private String dado;
	
	public Long getAdministradorId() {
		return administradorId;
	}
	public void setAdministradorId(Long administradorId) {
		this.administradorId = administradorId;
	}
	public String getDado() {
		return dado;
	}
	public void setDado(String dado) {
		this.dado = dado;
	}
}

@CrossOrigin
@RestController
public class AdministradorController {

	@Autowired
	private AdministradorService adminService;
	
	@PostMapping("/administrador/login")
	public Administrador login(@RequestBody JsonAdminLogin login) {
		Administrador oauthUser = adminService.login(login.getEmail(), login.getSenha());
		
		if (Objects.nonNull(oauthUser)) {
			return oauthUser;
		} else {
			return null;
		}
	}
	
	@PostMapping("/administrador/cadastrar")
	public Administrador cadastrar(@RequestBody Administrador admin) {
		return adminService.saveAdministrador(admin);
	}
	
	@DeleteMapping("/administrador/remover")
	public Administrador remover(@RequestBody Long adminId) {
		return adminService.removeAdmin(adminId);
	}
	
	@PutMapping("/administrador/updateEmail")
	public Administrador mudarEmail(@RequestBody JsonAdminUpdate update) {
		return adminService.updateEmail(update.getAdministradorId(), update.getDado());
	}
	
	@PutMapping("/administrador/updateTelefone")
	public Administrador mudarTelefone(@RequestBody JsonAdminUpdate update) {
		return adminService.updateTelefone(update.getAdministradorId(), update.getDado());
	}
	
	@PutMapping("/administrador/updateSenha")
	public Administrador mudarSenha(@RequestBody JsonAdminUpdate update) {
		return adminService.updateSenha(update.getAdministradorId(), update.getDado());
	}
	
}
