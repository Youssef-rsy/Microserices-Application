package com.local.ysf.Readers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("readers")
public class ReadersController {

	@Autowired
	public ReadersRepository application;
	
	
	private List<Readers> listOfReaders;
	

	@PostMapping()
	public List<Readers> Addingreader(@RequestBody Readers reader){
		application.save(reader);
		return application.findAll();
	}
	@GetMapping()
	public List<Readers> gettingAllReaders(){
		return application.findAll();
	}
	@GetMapping("/{ReadersId}")
	public Readers gettingReadersInfos(@PathVariable UUID ReadersId) {
		Optional<Readers> val =application.findById(ReadersId);
		if(val.isPresent())
			return val.get();
		return null;
	}
	@DeleteMapping("/{ReadersId}")
	public List<Readers> deletereader(@PathVariable UUID ReadersId){
		application.deleteById(ReadersId);
		return application.findAll();
	}
	@PutMapping()
	public List<Readers> updatingreader(@RequestBody Readers newReadersVal){
		//application.updateReaders( newReadersVal);
		return application.findAll();
	}
}
