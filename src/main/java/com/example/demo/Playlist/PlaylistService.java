package com.example.demo.Playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    public List<Playlist> getAllPlaylists() {
        return playlistRepository.findAll();
    }

    public Playlist createPlaylist(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    public Playlist getPlaylistById(String id) {
        return playlistRepository.findById(id).orElse(null);
    }

    public Playlist updatePlaylist(String id, Playlist updatedPlaylist) {
        Playlist playlist = playlistRepository.findById(id).orElse(null);
        if (playlist != null) {
            playlist.setTitle(updatedPlaylist.getTitle());
            return playlistRepository.save(playlist);
        }
        return null;
    }

    public void deletePlaylist(String id) {
        playlistRepository.deleteById(id);
    }
}
