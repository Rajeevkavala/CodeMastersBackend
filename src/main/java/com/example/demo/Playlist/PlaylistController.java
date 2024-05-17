package com.example.demo.Playlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/playlists")
@CrossOrigin(origins = "https://codemasters-edu.netlify.app/")
public class PlaylistController {
	 	@Autowired
	    private PlaylistRepository playlistRepository;

	    @GetMapping
	    public List<Playlist> getAllPlaylists() {
	        return playlistRepository.findAll();
	    }

	    @PostMapping
	    public Playlist createPlaylist(@RequestBody Playlist playlist) {
	        return playlistRepository.save(playlist);
	    }

	    @GetMapping("/{id}")
	    public Playlist getPlaylistById(@PathVariable String id) {
	        return playlistRepository.findById(id).orElse(null);
	    }

	    @PutMapping("/{id}")
	    public Playlist updatePlaylist(@PathVariable String id, @RequestBody Playlist updatedPlaylist) {
	        Playlist playlist = playlistRepository.findById(id).orElse(null);
	        if (playlist != null) {
	            playlist.setTitle(updatedPlaylist.getTitle());
	            return playlistRepository.save(playlist);
	        }
	        return null;
	    }

	    @DeleteMapping("/{id}")
	    public void deletePlaylist(@PathVariable String id) {
	        playlistRepository.deleteById(id);
	    }
}
