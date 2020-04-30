package com.rychlik.rychlikdariusz.repositories;

import com.rychlik.rychlikdariusz.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
