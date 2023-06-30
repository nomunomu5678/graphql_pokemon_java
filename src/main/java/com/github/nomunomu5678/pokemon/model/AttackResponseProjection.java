package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Attack
 */
public class AttackResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AttackResponseProjection() {
    }

    public AttackResponseProjection(AttackResponseProjection projection) {
        super(projection);
    }

    public AttackResponseProjection(List<AttackResponseProjection> projections) {
        super(projections);
    }

    public AttackResponseProjection all$() {
        return all$(3);
    }

    public AttackResponseProjection all$(int maxDepth) {
        this.name();
        this.type();
        this.damage();
        this.typename();
        return this;
    }

    public AttackResponseProjection name() {
        return name(null);
    }

    public AttackResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public AttackResponseProjection type() {
        return type(null);
    }

    public AttackResponseProjection type(String alias) {
        add$(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public AttackResponseProjection damage() {
        return damage(null);
    }

    public AttackResponseProjection damage(String alias) {
        add$(new GraphQLResponseField("damage").alias(alias));
        return this;
    }

    public AttackResponseProjection typename() {
        return typename(null);
    }

    public AttackResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public AttackResponseProjection deepCopy$() {
        return new AttackResponseProjection(this);
    }


}
