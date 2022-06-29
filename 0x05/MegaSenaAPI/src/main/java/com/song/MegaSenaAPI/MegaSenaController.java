package com.song.MegaSenaAPI;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/megasena")
public class MegaSenaController {
	
	@GetMapping("/simpleMessageWelcome")
	public String mensagemBoasVindas() {
		return "Bem Vindes a API para gerar numeros aleatórios para Mega Sena";
	}
	
	@GetMapping("/getNumbers")
	public List<Integer> numerosMegaSena(){
		Random random = new Random();
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		
		while(numeros.size() < 6)
			numeros.add(random.nextInt(60) + 1);
		return numeros.stream().toList();
	}
}