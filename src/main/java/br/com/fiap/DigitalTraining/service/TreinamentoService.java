package br.com.fiap.DigitalTraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.DigitalTraining.model.Treinamento;
import br.com.fiap.DigitalTraining.repository.TreinamentoRepository;

@Service
public class TreinamentoService {
	
	@Autowired
	private TreinamentoRepository repository;
	
	public Treinamento saveTreinamento(Treinamento treinamento) {
		return repository.save(treinamento);
	}
	
	public Treinamento getTreinamentoById(Long treinamentoId) {
		return repository.findById(treinamentoId).orElse(null);
	}
	
	public Treinamento removeTreinamento(Long treinamentoId) {
		Treinamento treino = getTreinamentoById(treinamentoId);
		repository.delete(treino);
		return treino;
	}
	
	public List<Treinamento> listaTreinamento() {
		return repository.findAll();
	}
	
}
