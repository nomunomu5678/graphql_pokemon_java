package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

public class PokemonQueryResponse extends GraphQLResult<Map<String, Pokemon>> {

    private static final String OPERATION_NAME = "pokemon";

    public PokemonQueryResponse() {
    }

    public Pokemon pokemon() {
        Map<String, Pokemon> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
