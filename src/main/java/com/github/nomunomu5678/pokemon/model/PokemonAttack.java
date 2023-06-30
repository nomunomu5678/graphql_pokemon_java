package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents a Pokémon's attack types
 */
public class PokemonAttack implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<Attack> fast;
    private java.util.List<Attack> special;

    public PokemonAttack() {
    }

    public PokemonAttack(java.util.List<Attack> fast, java.util.List<Attack> special) {
        this.fast = fast;
        this.special = special;
    }

    /**
     * The fast attacks of this Pokémon
     */
    public java.util.List<Attack> getFast() {
        return fast;
    }
    /**
     * The fast attacks of this Pokémon
     */
    public void setFast(java.util.List<Attack> fast) {
        this.fast = fast;
    }

    /**
     * The special attacks of this Pokémon
     */
    public java.util.List<Attack> getSpecial() {
        return special;
    }
    /**
     * The special attacks of this Pokémon
     */
    public void setSpecial(java.util.List<Attack> special) {
        this.special = special;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fast != null) {
            joiner.add("fast: " + GraphQLRequestSerializer.getEntry(fast));
        }
        if (special != null) {
            joiner.add("special: " + GraphQLRequestSerializer.getEntry(special));
        }
        return joiner.toString();
    }

    public static PokemonAttack.Builder builder() {
        return new PokemonAttack.Builder();
    }

    public static class Builder {

        private java.util.List<Attack> fast;
        private java.util.List<Attack> special;

        public Builder() {
        }

        /**
         * The fast attacks of this Pokémon
         */
        public Builder setFast(java.util.List<Attack> fast) {
            this.fast = fast;
            return this;
        }

        /**
         * The special attacks of this Pokémon
         */
        public Builder setSpecial(java.util.List<Attack> special) {
            this.special = special;
            return this;
        }


        public PokemonAttack build() {
            return new PokemonAttack(fast, special);
        }

    }
}
