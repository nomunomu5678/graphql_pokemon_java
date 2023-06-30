package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Pokemon
 */
public class PokemonResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PokemonResponseProjection() {
    }

    public PokemonResponseProjection(PokemonResponseProjection projection) {
        super(projection);
    }

    public PokemonResponseProjection(List<PokemonResponseProjection> projections) {
        super(projections);
    }

    public PokemonResponseProjection all$() {
        return all$(3);
    }

    public PokemonResponseProjection all$(int maxDepth) {
        this.id();
        this.number();
        this.name();
        if (projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonDimensionResponseProjection.weight", 0) <= maxDepth) {
            projectionDepthOnFields.put("PokemonResponseProjection.PokemonDimensionResponseProjection.weight", projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonDimensionResponseProjection.weight", 0) + 1);
            this.weight(new PokemonDimensionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonDimensionResponseProjection.weight", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonDimensionResponseProjection.height", 0) <= maxDepth) {
            projectionDepthOnFields.put("PokemonResponseProjection.PokemonDimensionResponseProjection.height", projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonDimensionResponseProjection.height", 0) + 1);
            this.height(new PokemonDimensionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonDimensionResponseProjection.height", 0)));
        }
        this.classification();
        this.types();
        this.resistant();
        if (projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonAttackResponseProjection.attacks", 0) <= maxDepth) {
            projectionDepthOnFields.put("PokemonResponseProjection.PokemonAttackResponseProjection.attacks", projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonAttackResponseProjection.attacks", 0) + 1);
            this.attacks(new PokemonAttackResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonAttackResponseProjection.attacks", 0)));
        }
        this.weaknesses();
        this.fleeRate();
        this.maxCP();
        if (projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonResponseProjection.evolutions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PokemonResponseProjection.PokemonResponseProjection.evolutions", projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonResponseProjection.evolutions", 0) + 1);
            this.evolutions(new PokemonResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonResponseProjection.evolutions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonEvolutionRequirementResponseProjection.evolutionRequirements", 0) <= maxDepth) {
            projectionDepthOnFields.put("PokemonResponseProjection.PokemonEvolutionRequirementResponseProjection.evolutionRequirements", projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonEvolutionRequirementResponseProjection.evolutionRequirements", 0) + 1);
            this.evolutionRequirements(new PokemonEvolutionRequirementResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PokemonResponseProjection.PokemonEvolutionRequirementResponseProjection.evolutionRequirements", 0)));
        }
        this.maxHP();
        this.image();
        this.typename();
        return this;
    }

    public PokemonResponseProjection id() {
        return id(null);
    }

    public PokemonResponseProjection id(String alias) {
        add$(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PokemonResponseProjection number() {
        return number(null);
    }

    public PokemonResponseProjection number(String alias) {
        add$(new GraphQLResponseField("number").alias(alias));
        return this;
    }

    public PokemonResponseProjection name() {
        return name(null);
    }

    public PokemonResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PokemonResponseProjection weight(PokemonDimensionResponseProjection subProjection) {
        return weight(null, subProjection);
    }

    public PokemonResponseProjection weight(String alias, PokemonDimensionResponseProjection subProjection) {
        add$(new GraphQLResponseField("weight").alias(alias).projection(subProjection));
        return this;
    }

    public PokemonResponseProjection height(PokemonDimensionResponseProjection subProjection) {
        return height(null, subProjection);
    }

    public PokemonResponseProjection height(String alias, PokemonDimensionResponseProjection subProjection) {
        add$(new GraphQLResponseField("height").alias(alias).projection(subProjection));
        return this;
    }

    public PokemonResponseProjection classification() {
        return classification(null);
    }

    public PokemonResponseProjection classification(String alias) {
        add$(new GraphQLResponseField("classification").alias(alias));
        return this;
    }

    public PokemonResponseProjection types() {
        return types(null);
    }

    public PokemonResponseProjection types(String alias) {
        add$(new GraphQLResponseField("types").alias(alias));
        return this;
    }

    public PokemonResponseProjection resistant() {
        return resistant(null);
    }

    public PokemonResponseProjection resistant(String alias) {
        add$(new GraphQLResponseField("resistant").alias(alias));
        return this;
    }

    public PokemonResponseProjection attacks(PokemonAttackResponseProjection subProjection) {
        return attacks(null, subProjection);
    }

    public PokemonResponseProjection attacks(String alias, PokemonAttackResponseProjection subProjection) {
        add$(new GraphQLResponseField("attacks").alias(alias).projection(subProjection));
        return this;
    }

    public PokemonResponseProjection weaknesses() {
        return weaknesses(null);
    }

    public PokemonResponseProjection weaknesses(String alias) {
        add$(new GraphQLResponseField("weaknesses").alias(alias));
        return this;
    }

    public PokemonResponseProjection fleeRate() {
        return fleeRate(null);
    }

    public PokemonResponseProjection fleeRate(String alias) {
        add$(new GraphQLResponseField("fleeRate").alias(alias));
        return this;
    }

    public PokemonResponseProjection maxCP() {
        return maxCP(null);
    }

    public PokemonResponseProjection maxCP(String alias) {
        add$(new GraphQLResponseField("maxCP").alias(alias));
        return this;
    }

    public PokemonResponseProjection evolutions(PokemonResponseProjection subProjection) {
        return evolutions(null, subProjection);
    }

    public PokemonResponseProjection evolutions(String alias, PokemonResponseProjection subProjection) {
        add$(new GraphQLResponseField("evolutions").alias(alias).projection(subProjection));
        return this;
    }

    public PokemonResponseProjection evolutionRequirements(PokemonEvolutionRequirementResponseProjection subProjection) {
        return evolutionRequirements(null, subProjection);
    }

    public PokemonResponseProjection evolutionRequirements(String alias, PokemonEvolutionRequirementResponseProjection subProjection) {
        add$(new GraphQLResponseField("evolutionRequirements").alias(alias).projection(subProjection));
        return this;
    }

    public PokemonResponseProjection maxHP() {
        return maxHP(null);
    }

    public PokemonResponseProjection maxHP(String alias) {
        add$(new GraphQLResponseField("maxHP").alias(alias));
        return this;
    }

    public PokemonResponseProjection image() {
        return image(null);
    }

    public PokemonResponseProjection image(String alias) {
        add$(new GraphQLResponseField("image").alias(alias));
        return this;
    }

    public PokemonResponseProjection typename() {
        return typename(null);
    }

    public PokemonResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PokemonResponseProjection deepCopy$() {
        return new PokemonResponseProjection(this);
    }


}
