package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents a Pokémon's dimensions
 */
public class PokemonDimension implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String minimum;
    private String maximum;

    public PokemonDimension() {
    }

    public PokemonDimension(String minimum, String maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    /**
     * The minimum value of this dimension
     */
    public String getMinimum() {
        return minimum;
    }
    /**
     * The minimum value of this dimension
     */
    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    /**
     * The maximum value of this dimension
     */
    public String getMaximum() {
        return maximum;
    }
    /**
     * The maximum value of this dimension
     */
    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (minimum != null) {
            joiner.add("minimum: " + GraphQLRequestSerializer.getEntry(minimum));
        }
        if (maximum != null) {
            joiner.add("maximum: " + GraphQLRequestSerializer.getEntry(maximum));
        }
        return joiner.toString();
    }

    public static PokemonDimension.Builder builder() {
        return new PokemonDimension.Builder();
    }

    public static class Builder {

        private String minimum;
        private String maximum;

        public Builder() {
        }

        /**
         * The minimum value of this dimension
         */
        public Builder setMinimum(String minimum) {
            this.minimum = minimum;
            return this;
        }

        /**
         * The maximum value of this dimension
         */
        public Builder setMaximum(String maximum) {
            this.maximum = maximum;
            return this;
        }


        public PokemonDimension build() {
            return new PokemonDimension(minimum, maximum);
        }

    }
}
