package com.rychlik.rychlikdariusz.converters;

import com.rychlik.rychlikdariusz.commands.ArtistCommand;
import com.rychlik.rychlikdariusz.commands.SongCommand;
import com.rychlik.rychlikdariusz.model.Artist;
import com.rychlik.rychlikdariusz.model.Song;
import com.rychlik.rychlikdariusz.repositories.ArtistRepository;

import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ArtistCommandToArtist implements Converter<ArtistCommand, Artist> {

    @Synchronized
    @Nullable
    @Override
    public Artist convert(ArtistCommand source) {
        if (source == null) {
            return null;
        }

        final Artist artist = new Artist();
        artist.setFirstName(source.getFirstName());
        artist.setLastName(source.getLastName());
        artist.setNick(source.getNick());

        return artist;
    }
}