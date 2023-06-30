package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents a Pokémon
 */
public class Pokemon implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String id;
    private String number;
    private String name;
    private PokemonDimension weight;
    private PokemonDimension height;
    private String classification;
    private java.util.List<String> types;
    private java.util.List<String> resistant;
    private PokemonAttack attacks;
    private java.util.List<String> weaknesses;
    private Double fleeRate;
    private Integer maxCP;
    private java.util.List<Pokemon> evolutions;
    private PokemonEvolutionRequirement evolutionRequirements;
    private Integer maxHP;
    private String image;

    public Pokemon() {
    }

    public Pokemon(String id, String number, String name, PokemonDimension weight, PokemonDimension height, String classification, java.util.List<String> types, java.util.List<String> resistant, PokemonAttack attacks, java.util.List<String> weaknesses, Double fleeRate, Integer maxCP, java.util.List<Pokemon> evolutions, PokemonEvolutionRequirement evolutionRequirements, Integer maxHP, String image) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.classification = classification;
        this.types = types;
        this.resistant = resistant;
        this.attacks = attacks;
        this.weaknesses = weaknesses;
        this.fleeRate = fleeRate;
        this.maxCP = maxCP;
        this.evolutions = evolutions;
        this.evolutionRequirements = evolutionRequirements;
        this.maxHP = maxHP;
        this.image = image;
    }

    /**
     * The ID of an object
     */
    public String getId() {
        return id;
    }
    /**
     * The ID of an object
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The identifier of this Pokémon
     */
    public String getNumber() {
        return number;
    }
    /**
     * The identifier of this Pokémon
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * The name of this Pokémon
     */
    public String getName() {
        return name;
    }
    /**
     * The name of this Pokémon
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The minimum and maximum weight of this Pokémon
     */
    public PokemonDimension getWeight() {
        return weight;
    }
    /**
     * The minimum and maximum weight of this Pokémon
     */
    public void setWeight(PokemonDimension weight) {
        this.weight = weight;
    }

    /**
     * The minimum and maximum weight of this Pokémon
     */
    public PokemonDimension getHeight() {
        return height;
    }
    /**
     * The minimum and maximum weight of this Pokémon
     */
    public void setHeight(PokemonDimension height) {
        this.height = height;
    }

    /**
     * The classification of this Pokémon
     */
    public String getClassification() {
        return classification;
    }
    /**
     * The classification of this Pokémon
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * The type(s) of this Pokémon
     */
    public java.util.List<String> getTypes() {
        return types;
    }
    /**
     * The type(s) of this Pokémon
     */
    public void setTypes(java.util.List<String> types) {
        this.types = types;
    }

    /**
     * The type(s) of Pokémons that this Pokémon is resistant to
     */
    public java.util.List<String> getResistant() {
        return resistant;
    }
    /**
     * The type(s) of Pokémons that this Pokémon is resistant to
     */
    public void setResistant(java.util.List<String> resistant) {
        this.resistant = resistant;
    }

    /**
     * The attacks of this Pokémon
     */
    public PokemonAttack getAttacks() {
        return attacks;
    }
    /**
     * The attacks of this Pokémon
     */
    public void setAttacks(PokemonAttack attacks) {
        this.attacks = attacks;
    }

    /**
     * The type(s) of Pokémons that this Pokémon weak to
     */
    public java.util.List<String> getWeaknesses() {
        return weaknesses;
    }
    /**
     * The type(s) of Pokémons that this Pokémon weak to
     */
    public void setWeaknesses(java.util.List<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public Double getFleeRate() {
        return fleeRate;
    }
    public void setFleeRate(Double fleeRate) {
        this.fleeRate = fleeRate;
    }

    /**
     * The maximum CP of this Pokémon
     */
    public Integer getMaxCP() {
        return maxCP;
    }
    /**
     * The maximum CP of this Pokémon
     */
    public void setMaxCP(Integer maxCP) {
        this.maxCP = maxCP;
    }

    /**
     * The evolutions of this Pokémon
     */
    public java.util.List<Pokemon> getEvolutions() {
        return evolutions;
    }
    /**
     * The evolutions of this Pokémon
     */
    public void setEvolutions(java.util.List<Pokemon> evolutions) {
        this.evolutions = evolutions;
    }

    /**
     * The evolution requirements of this Pokémon
     */
    public PokemonEvolutionRequirement getEvolutionRequirements() {
        return evolutionRequirements;
    }
    /**
     * The evolution requirements of this Pokémon
     */
    public void setEvolutionRequirements(PokemonEvolutionRequirement evolutionRequirements) {
        this.evolutionRequirements = evolutionRequirements;
    }

    /**
     * The maximum HP of this Pokémon
     */
    public Integer getMaxHP() {
        return maxHP;
    }
    /**
     * The maximum HP of this Pokémon
     */
    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (number != null) {
            joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (weight != null) {
            joiner.add("weight: " + GraphQLRequestSerializer.getEntry(weight));
        }
        if (height != null) {
            joiner.add("height: " + GraphQLRequestSerializer.getEntry(height));
        }
        if (classification != null) {
            joiner.add("classification: " + GraphQLRequestSerializer.getEntry(classification));
        }
        if (types != null) {
            joiner.add("types: " + GraphQLRequestSerializer.getEntry(types));
        }
        if (resistant != null) {
            joiner.add("resistant: " + GraphQLRequestSerializer.getEntry(resistant));
        }
        if (attacks != null) {
            joiner.add("attacks: " + GraphQLRequestSerializer.getEntry(attacks));
        }
        if (weaknesses != null) {
            joiner.add("weaknesses: " + GraphQLRequestSerializer.getEntry(weaknesses));
        }
        if (fleeRate != null) {
            joiner.add("fleeRate: " + GraphQLRequestSerializer.getEntry(fleeRate));
        }
        if (maxCP != null) {
            joiner.add("maxCP: " + GraphQLRequestSerializer.getEntry(maxCP));
        }
        if (evolutions != null) {
            joiner.add("evolutions: " + GraphQLRequestSerializer.getEntry(evolutions));
        }
        if (evolutionRequirements != null) {
            joiner.add("evolutionRequirements: " + GraphQLRequestSerializer.getEntry(evolutionRequirements));
        }
        if (maxHP != null) {
            joiner.add("maxHP: " + GraphQLRequestSerializer.getEntry(maxHP));
        }
        if (image != null) {
            joiner.add("image: " + GraphQLRequestSerializer.getEntry(image));
        }
        return joiner.toString();
    }

    public static Pokemon.Builder builder() {
        return new Pokemon.Builder();
    }

    public static class Builder {

        private String id;
        private String number;
        private String name;
        private PokemonDimension weight;
        private PokemonDimension height;
        private String classification;
        private java.util.List<String> types;
        private java.util.List<String> resistant;
        private PokemonAttack attacks;
        private java.util.List<String> weaknesses;
        private Double fleeRate;
        private Integer maxCP;
        private java.util.List<Pokemon> evolutions;
        private PokemonEvolutionRequirement evolutionRequirements;
        private Integer maxHP;
        private String image;

        public Builder() {
        }

        /**
         * The ID of an object
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The identifier of this Pokémon
         */
        public Builder setNumber(String number) {
            this.number = number;
            return this;
        }

        /**
         * The name of this Pokémon
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The minimum and maximum weight of this Pokémon
         */
        public Builder setWeight(PokemonDimension weight) {
            this.weight = weight;
            return this;
        }

        /**
         * The minimum and maximum weight of this Pokémon
         */
        public Builder setHeight(PokemonDimension height) {
            this.height = height;
            return this;
        }

        /**
         * The classification of this Pokémon
         */
        public Builder setClassification(String classification) {
            this.classification = classification;
            return this;
        }

        /**
         * The type(s) of this Pokémon
         */
        public Builder setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }

        /**
         * The type(s) of Pokémons that this Pokémon is resistant to
         */
        public Builder setResistant(java.util.List<String> resistant) {
            this.resistant = resistant;
            return this;
        }

        /**
         * The attacks of this Pokémon
         */
        public Builder setAttacks(PokemonAttack attacks) {
            this.attacks = attacks;
            return this;
        }

        /**
         * The type(s) of Pokémons that this Pokémon weak to
         */
        public Builder setWeaknesses(java.util.List<String> weaknesses) {
            this.weaknesses = weaknesses;
            return this;
        }

        public Builder setFleeRate(Double fleeRate) {
            this.fleeRate = fleeRate;
            return this;
        }

        /**
         * The maximum CP of this Pokémon
         */
        public Builder setMaxCP(Integer maxCP) {
            this.maxCP = maxCP;
            return this;
        }

        /**
         * The evolutions of this Pokémon
         */
        public Builder setEvolutions(java.util.List<Pokemon> evolutions) {
            this.evolutions = evolutions;
            return this;
        }

        /**
         * The evolution requirements of this Pokémon
         */
        public Builder setEvolutionRequirements(PokemonEvolutionRequirement evolutionRequirements) {
            this.evolutionRequirements = evolutionRequirements;
            return this;
        }

        /**
         * The maximum HP of this Pokémon
         */
        public Builder setMaxHP(Integer maxHP) {
            this.maxHP = maxHP;
            return this;
        }

        public Builder setImage(String image) {
            this.image = image;
            return this;
        }


        public Pokemon build() {
            return new Pokemon(id, number, name, weight, height, classification, types, resistant, attacks, weaknesses, fleeRate, maxCP, evolutions, evolutionRequirements, maxHP, image);
        }

    }
}
