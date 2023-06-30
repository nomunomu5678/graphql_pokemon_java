package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PokemonQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "pokemon";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public PokemonQueryRequest() {
    }

    public PokemonQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setName(String name) {
        this.input.put("name", name);
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

    public static PokemonQueryRequest.Builder builder() {
        return new PokemonQueryRequest.Builder();
    }

    public static class Builder {

        private String $alias;
        private String id;
        private String name;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public PokemonQueryRequest build() {
            PokemonQueryRequest obj = new PokemonQueryRequest($alias);
            obj.setId(id);
            obj.setName(name);
            return obj;
        }

    }
}
