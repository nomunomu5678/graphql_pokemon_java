package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PokemonDimension
 */
public class PokemonDimensionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PokemonDimensionResponseProjection() {
    }

    public PokemonDimensionResponseProjection(PokemonDimensionResponseProjection projection) {
        super(projection);
    }

    public PokemonDimensionResponseProjection(List<PokemonDimensionResponseProjection> projections) {
        super(projections);
    }

    public PokemonDimensionResponseProjection all$() {
        return all$(3);
    }

    public PokemonDimensionResponseProjection all$(int maxDepth) {
        this.minimum();
        this.maximum();
        this.typename();
        return this;
    }

    public PokemonDimensionResponseProjection minimum() {
        return minimum(null);
    }

    public PokemonDimensionResponseProjection minimum(String alias) {
        add$(new GraphQLResponseField("minimum").alias(alias));
        return this;
    }

    public PokemonDimensionResponseProjection maximum() {
        return maximum(null);
    }

    public PokemonDimensionResponseProjection maximum(String alias) {
        add$(new GraphQLResponseField("maximum").alias(alias));
        return this;
    }

    public PokemonDimensionResponseProjection typename() {
        return typename(null);
    }

    public PokemonDimensionResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PokemonDimensionResponseProjection deepCopy$() {
        return new PokemonDimensionResponseProjection(this);
    }


}
