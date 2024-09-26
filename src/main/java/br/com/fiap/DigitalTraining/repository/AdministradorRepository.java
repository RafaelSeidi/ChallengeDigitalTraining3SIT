package br.com.fiap.DigitalTraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.DigitalTraining.model.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long>{
	Administrador findByEmailAndSenha(String email, String password);
}
