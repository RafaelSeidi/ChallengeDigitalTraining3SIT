package br.com.fiap.DigitalTraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.DigitalTraining.model.Treinamento;
import br.com.fiap.DigitalTraining.service.TreinamentoService;

@CrossOrigin
@RestController
public class TreinamentoController {

	@Autowired
	private TreinamentoService treinamentoService;
	
	@PostMapping("/treinamento/cadastrar")
	public Treinamento cadastrar(@RequestBody Treinamento treino) {
		return treinamentoService.saveTreinamento(treino);
	}
	
	@DeleteMapping("/treinamento/remover")
	public Treinamento remover(@RequestBody Long treinamentoId) {
		return treinamentoService.removeTreinamento(treinamentoId);
	}
	
	@GetMapping("/treinamento/listar")
	public List<Treinamento> listar() {
		return treinamentoService.listaTreinamento();
	}
}
