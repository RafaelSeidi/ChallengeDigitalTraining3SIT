package br.com.fiap.DigitalTraining.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.DigitalTraining.model.Usuario;
import br.com.fiap.DigitalTraining.service.UsuarioService;

final class JsonUserLogin {
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

final class JsonUserUpdate {
	private Long uid;
	private String dado;
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
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
public class UsuarioController {

	@Autowired
	private UsuarioService userService;
	
	@PostMapping("/usuario/cadastrar")
	public Usuario cadastrar(@RequestBody Usuario user) {
		return userService.saveUsuario(user);
	}
	
	@PostMapping("/usuario/login")
	public Usuario login(@RequestBody JsonUserLogin login) {
		Usuario oauthUser = userService.login(login.getEmail(), login.getSenha());
		
		if (Objects.nonNull(oauthUser)) {
			return oauthUser;
		} else {
			return null;
		}
	}
	
	@GetMapping("/usuario/listar")
	public List<Usuario> listar() {
		return userService.listaUsuario();
	}
	
	@DeleteMapping("/usuario/remover")
	public Usuario remover(@RequestBody Long userId) {
		return userService.removeUsuario(userId);
	}
	
	@PutMapping("/usuario/updateEmail")
	public Usuario mudarEmail(@RequestBody JsonUserUpdate update) {
		return userService.updateEmail(update.getUid(), update.getDado());
	}
	
	@PutMapping("/usuario/updateTelefone")
	public Usuario mudarTelefone(@RequestBody JsonUserUpdate update) {
		return userService.updateTelefone(update.getUid(), update.getDado());
	}
	
	@PutMapping("/usuario/updateSenha")
	public Usuario mudarSenha(@RequestBody JsonUserUpdate update) {
		return userService.updateSenha(update.getUid(), update.getDado());
	}
	
}