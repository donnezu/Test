package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entiti.Music;
import com.example.demo.repository.MusicCrudRepository;
@Service
public class MusicServiceImpl implements MusicService{
	@Autowired
	MusicCrudRepository repository;
	
	@Override
	public Iterable<Music> findAll(){
		return repository.findAll();
		}
	@Override
	public void insertMusic(Music music) {
		repository.save(music);
	}
}
