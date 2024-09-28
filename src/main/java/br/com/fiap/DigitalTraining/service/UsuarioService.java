package br.com.fiap.DigitalTraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.DigitalTraining.model.Usuario;
import br.com.fiap.DigitalTraining.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario login(String email, String password) {
		Usuario user = repository.findByEmailAndSenha(email, password);
		return user;
	}
	
	public Usuario saveUsuario(Usuario user) {
		return repository.save(user);
	}
	
	public Usuario getUserById(Long usuarioId) {
		return repository.findById(usuarioId).orElse(null);
	}
	
	public List<Usuario> listaUsuario() {
		return repository.findAll();
	}
	
	public Usuario removeUsuario(Long userId) {
		Usuario user = getUserById(userId);
		repository.delete(user);
		return user;
	}
	
	public Usuario updateEmail(Long uid, String mail) {
		Usuario user = getUserById(uid);
		user.setEmail(mail);
		return repository.save(user);
	}
	
	public Usuario updateTelefone(Long uid, String telefone) {
		Usuario user = getUserById(uid);
		user.setTelefone(telefone);
		return repository.save(user);
	}
	
	public Usuario updateSenha(Long uid, String senha) {
		Usuario user = getUserById(uid);
		user.setSenha(senha);
		return repository.save(user);
	}
	
}
