package com.example.pokedex.services;

import com.example.pokedex.models.PokemonDetail;
import com.example.pokedex.models.PokemonListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface PokeApiService {
    //DIP: La UI o lógica depende de esta interfaz (abstracción), no de implementaciones concretas.
    @GET("pokemon")
    Call<PokemonListResponse> getPokemonList(
            @Query("limit") int limit,
            @Query("offset") int offset
    );

    @GET
    Call<PokemonDetail> getPokemonDetail(@Url String url);
}
