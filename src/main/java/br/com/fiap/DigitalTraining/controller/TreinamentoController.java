package br.com.fiap.DigitalTraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
}
