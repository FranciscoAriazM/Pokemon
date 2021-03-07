package com.test2.service;

import java.util.List;

import com.test2.modelo.Pokemon;

public interface IPokemonService {
	public List<Pokemon> listarPokemon();

	public Pokemon listPokemonId(int id);

	public int agregar(Pokemon p);

	public int editar(Pokemon p);

	public void delete(int id);
}
