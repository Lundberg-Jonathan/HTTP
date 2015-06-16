/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package http;

/**
 *
 * @author Architect
 */
public class Pokemon {
    
    private String pokemonName;
    private Integer pokemonNumber;
    private String[] pokemonTypes;
    
    public Pokemon() {
        
        pokemonName = null;
        pokemonNumber = null;
        pokemonTypes = null;
        
    }
    
    public String getPokemonName() {
        
        return pokemonName;
        
    }
    
    public void setPokemonName(String pokemonName) {
        
        this.pokemonName = pokemonName;
        
    }
    
    public Integer getPokemonNumber() {
        
        return pokemonNumber;
        
    }
    
    public void setPokemonNumber(Integer pokemonNumber) {
        
        this.pokemonNumber = pokemonNumber;
        
    }
    
    public String[] getPokemonTypes() {
        
        return pokemonTypes;
        
    }
    
    public void setPokemonTypes(String[] pokemonTypes) {
        
        this.pokemonTypes = pokemonTypes;
        
    }
    
}
