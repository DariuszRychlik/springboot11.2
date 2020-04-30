package com.rychlik.rychlikdariusz.repositories;

import com.rychlik.rychlikdariusz.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
