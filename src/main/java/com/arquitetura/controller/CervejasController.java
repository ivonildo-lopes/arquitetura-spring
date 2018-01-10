package com.arquitetura.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arquitetura.model.Cerveja;

@Controller
public class CervejasController {

	@RequestMapping(value = "/cerveja/novo")
	public String novo() {
		return "cerveja/cadastroCerveja";
	}
	
	
	@RequestMapping(value = "/cerveja/novo",method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("nao foi possivel cadastrar");
		}else {
			
			System.out.println(">>> CADASTRAR " + cerveja.getSku());
		}
		return "cerveja/cadastroCerveja";
	}
}
