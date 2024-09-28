package br.com.fiap.DigitalTraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.DigitalTraining.model.Treinamento;

@Repository
public interface TreinamentoRepository extends JpaRepository<Treinamento,Long> {
	Treinamento findByNome(String nome);
}
