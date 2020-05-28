package com.rychlik.rychlikdariusz.repositories;

import com.rychlik.rychlikdariusz.model.Artist;
import com.rychlik.rychlikdariusz.model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {

    List<Song> getAllByArtistsIsContaining(Artist artist);
}
