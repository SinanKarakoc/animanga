package com.example.Animanga.Repository;

import com.example.Animanga.Entity.Anime;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AnimeRepository extends CrudRepository<Anime, Long> {

    Anime findByMovieName(String movieName);


}
