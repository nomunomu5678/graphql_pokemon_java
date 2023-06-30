package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PokemonsQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "pokemons";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public PokemonsQueryRequest() {
    }

    public PokemonsQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setFirst(int first) {
        this.input.put("first", first);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static PokemonsQueryRequest.Builder builder() {
        return new PokemonsQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private int first;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setFirst(int first) {
            this.first = first;
            return this;
        }


        public PokemonsQueryRequest build() {
            PokemonsQueryRequest obj = new PokemonsQueryRequest($alias);
            obj.setFirst(first);
            return obj;
        }

    }
}
