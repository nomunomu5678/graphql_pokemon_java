package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for PokemonAttack
 */
public class PokemonAttackResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PokemonAttackResponseProjection() {
    }

    public PokemonAttackResponseProjection(PokemonAttackResponseProjection projection) {
        super(projection);
    }

    public PokemonAttackResponseProjection(List<PokemonAttackResponseProjection> projections) {
        super(projections);
    }

    public PokemonAttackResponseProjection all$() {
        return all$(3);
    }

    public PokemonAttackResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PokemonAttackResponseProjection.AttackResponseProjection.fast", 0) <= maxDepth) {
            projectionDepthOnFields.put("PokemonAttackResponseProjection.AttackResponseProjection.fast", projectionDepthOnFields.getOrDefault("PokemonAttackResponseProjection.AttackResponseProjection.fast", 0) + 1);
            this.fast(new AttackResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PokemonAttackResponseProjection.AttackResponseProjection.fast", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PokemonAttackResponseProjection.AttackResponseProjection.special", 0) <= maxDepth) {
            projectionDepthOnFields.put("PokemonAttackResponseProjection.AttackResponseProjection.special", projectionDepthOnFields.getOrDefault("PokemonAttackResponseProjection.AttackResponseProjection.special", 0) + 1);
            this.special(new AttackResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PokemonAttackResponseProjection.AttackResponseProjection.special", 0)));
        }
        this.typename();
        return this;
    }

    public PokemonAttackResponseProjection fast(AttackResponseProjection subProjection) {
        return fast(null, subProjection);
    }

    public PokemonAttackResponseProjection fast(String alias, AttackResponseProjection subProjection) {
        add$(new GraphQLResponseField("fast").alias(alias).projection(subProjection));
        return this;
    }

    public PokemonAttackResponseProjection special(AttackResponseProjection subProjection) {
        return special(null, subProjection);
    }

    public PokemonAttackResponseProjection special(String alias, AttackResponseProjection subProjection) {
        add$(new GraphQLResponseField("special").alias(alias).projection(subProjection));
        return this;
    }

    public PokemonAttackResponseProjection typename() {
        return typename(null);
    }

    public PokemonAttackResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PokemonAttackResponseProjection deepCopy$() {
        return new PokemonAttackResponseProjection(this);
    }


}
