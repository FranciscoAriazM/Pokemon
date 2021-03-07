package com.test2.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test2.modelo.Pokemon;

@Repository
public class PokemonDao implements IPokemon {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Pokemon> listarPokemon() {
		String sql = "select * from pokemon";
		List<Pokemon>pokemones = template.query(sql,new BeanPropertyRowMapper<Pokemon>(Pokemon.class));
		return pokemones;
	}

	@Override
	public Pokemon listPokemonId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
