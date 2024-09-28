package br.com.fiap.DigitalTraining.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.DigitalTraining.model.Administrador;
import br.com.fiap.DigitalTraining.repository.AdministradorRepository;

@Service
public class AdministradorService {

	@Autowired
	private AdministradorRepository repository;
	
	public Administrador login(String email, String password) {
		Administrador admin = repository.findByEmailAndSenha(email, password);
		return admin;
	}
	
	public Administrador saveAdministrador(Administrador admin) {
		return repository.save(admin);
	}
	
	public Administrador getAdminById(Long adminId) {
		return repository.findById(adminId).orElse(null);
	}
	
	public Administrador removeAdmin(Long adminId) {
		Administrador admin = getAdminById(adminId);
		repository.delete(admin);
		return admin;
	}
	
	public Administrador updateEmail(Long adminId, String mail) {
		Administrador admin = getAdminById(adminId);
		admin.setEmail(mail);
		return repository.save(admin);
	}
	
	public Administrador updateTelefone(Long adminId, String telefone) {
		Administrador admin = getAdminById(adminId);
		admin.setTelefone(telefone);
		return repository.save(admin);
	}
	
	public Administrador updateSenha(Long adminId, String senha) {
		Administrador admin = getAdminById(adminId);
		admin.setSenha(senha);
		return repository.save(admin);
	}
	
}
