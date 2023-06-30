package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PokemonEvolutionRequirement
 */
public class PokemonEvolutionRequirementResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PokemonEvolutionRequirementResponseProjection() {
    }

    public PokemonEvolutionRequirementResponseProjection(PokemonEvolutionRequirementResponseProjection projection) {
        super(projection);
    }

    public PokemonEvolutionRequirementResponseProjection(List<PokemonEvolutionRequirementResponseProjection> projections) {
        super(projections);
    }

    public PokemonEvolutionRequirementResponseProjection all$() {
        return all$(3);
    }

    public PokemonEvolutionRequirementResponseProjection all$(int maxDepth) {
        this.amount();
        this.name();
        this.typename();
        return this;
    }

    public PokemonEvolutionRequirementResponseProjection amount() {
        return amount(null);
    }

    public PokemonEvolutionRequirementResponseProjection amount(String alias) {
        add$(new GraphQLResponseField("amount").alias(alias));
        return this;
    }

    public PokemonEvolutionRequirementResponseProjection name() {
        return name(null);
    }

    public PokemonEvolutionRequirementResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PokemonEvolutionRequirementResponseProjection typename() {
        return typename(null);
    }

    public PokemonEvolutionRequirementResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PokemonEvolutionRequirementResponseProjection deepCopy$() {
        return new PokemonEvolutionRequirementResponseProjection(this);
    }


}
