package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class PokemonsQueryResponse extends GraphQLResult<Map<String, java.util.List<Pokemon>>> {

    private static final String OPERATION_NAME = "pokemons";

    public PokemonsQueryResponse() {
    }

    public java.util.List<Pokemon> pokemons() {
        Map<String, java.util.List<Pokemon>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
