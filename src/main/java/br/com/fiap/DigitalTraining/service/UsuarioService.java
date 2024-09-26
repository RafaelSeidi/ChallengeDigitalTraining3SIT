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
	
}
