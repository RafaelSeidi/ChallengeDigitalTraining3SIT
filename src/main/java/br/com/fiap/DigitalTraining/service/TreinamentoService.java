package br.com.fiap.DigitalTraining.service;

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
	
}
