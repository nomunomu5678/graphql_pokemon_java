package com.github.nomunomu5678.pokemon;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.nomunomu5678.pokemon.model.PokemonQueryRequest;
import com.github.nomunomu5678.pokemon.model.PokemonQueryResponse;
import com.github.nomunomu5678.pokemon.model.PokemonResponseProjection;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;

public class Main {

  public static void main(String[] args) throws Exception {
    // Request
    PokemonQueryRequest req = PokemonQueryRequest.builder()
        .setName("Pikachu")
        .build();
    PokemonResponseProjection resp = new PokemonResponseProjection()
        .number()
        .name();
    GraphQLRequest graphqlReq = new GraphQLRequest(req, resp);
    System.out.println(graphqlReq.toHttpJsonBody());

    // Response
    String graphqlRes = "{\"data\": {\"pokemon\": {\"id\": \"UG9rZW1vbjowMjU=\"}}}";
    ObjectMapper objectMapper = new ObjectMapper();
    PokemonQueryResponse res = objectMapper.readValue(graphqlRes, PokemonQueryResponse.class);
    System.out.println(res.getData());
  }
}