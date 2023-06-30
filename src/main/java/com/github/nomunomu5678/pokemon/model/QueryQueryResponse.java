package com.github.nomunomu5678.pokemon.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

import javax.management.Query;

public class QueryQueryResponse extends GraphQLResult<Map<String, Query>> {

    private static final String OPERATION_NAME = "query";

    public QueryQueryResponse() {
    }

    public Query query() {
        Map<String, Query> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
