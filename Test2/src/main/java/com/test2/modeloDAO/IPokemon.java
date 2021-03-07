package com.test2.modeloDAO;

import java.util.List;

import com.test2.modelo.Pokemon;

public interface IPokemon {
	public List<Pokemon> listarPokemon();

	public Pokemon listPokemonId(int id);

}
