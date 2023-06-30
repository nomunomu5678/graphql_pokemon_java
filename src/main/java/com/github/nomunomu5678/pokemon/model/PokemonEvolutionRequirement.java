package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents a Pokémon's requirement to evolve
 */
public class PokemonEvolutionRequirement implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer amount;
    private String name;

    public PokemonEvolutionRequirement() {
    }

    public PokemonEvolutionRequirement(Integer amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    /**
     * The amount of candy to evolve
     */
    public Integer getAmount() {
        return amount;
    }
    /**
     * The amount of candy to evolve
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * The name of the candy to evolve
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the candy to evolve
     */
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (amount != null) {
            joiner.add("amount: " + GraphQLRequestSerializer.getEntry(amount));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

    public static PokemonEvolutionRequirement.Builder builder() {
        return new PokemonEvolutionRequirement.Builder();
    }

    public static class Builder {

        private Integer amount;
        private String name;

        public Builder() {
        }

        /**
         * The amount of candy to evolve
         */
        public Builder setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * The name of the candy to evolve
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public PokemonEvolutionRequirement build() {
            return new PokemonEvolutionRequirement(amount, name);
        }

    }
}
