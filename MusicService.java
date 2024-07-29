package com.example.demo.service;

import com.example.demo.entiti.Music;

public interface MusicService {
	Iterable<Music> findAll();
	
	void insertMusic(Music music);
}
