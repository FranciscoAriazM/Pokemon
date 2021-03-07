package com.test2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test2.modelo.Pokemon;
import com.test2.modeloDAO.IPokemon;

@Service
public class PokemonService implements IPokemonService{

	@Autowired
	private IPokemon dao;
	
	@Override
	public List<Pokemon> listarPokemon() {
		return dao.listarPokemon();
	}

	@Override
	public Pokemon listPokemonId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int agregar(Pokemon p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editar(Pokemon p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
