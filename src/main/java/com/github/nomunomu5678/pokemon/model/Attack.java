package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents a Pokémon's attack types
 */
public class Attack implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String type;
    private Integer damage;

    public Attack() {
    }

    public Attack(String name, String type, Integer damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    /**
     * The name of this Pokémon attack
     */
    public String getName() {
        return name;
    }
    /**
     * The name of this Pokémon attack
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The type of this Pokémon attack
     */
    public String getType() {
        return type;
    }
    /**
     * The type of this Pokémon attack
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The damage of this Pokémon attack
     */
    public Integer getDamage() {
        return damage;
    }
    /**
     * The damage of this Pokémon attack
     */
    public void setDamage(Integer damage) {
        this.damage = damage;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (damage != null) {
            joiner.add("damage: " + GraphQLRequestSerializer.getEntry(damage));
        }
        return joiner.toString();
    }

    public static Attack.Builder builder() {
        return new Attack.Builder();
    }

    public static class Builder {

        private String name;
        private String type;
        private Integer damage;

        public Builder() {
        }

        /**
         * The name of this Pokémon attack
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The type of this Pokémon attack
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The damage of this Pokémon attack
         */
        public Builder setDamage(Integer damage) {
            this.damage = damage;
            return this;
        }


        public Attack build() {
            return new Attack(name, type, damage);
        }

    }
}
