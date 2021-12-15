package com.example.Userbooking.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Userbooking.model.bookingorder;
import com.example.Userbooking.repository.Userbookingrepository;

@RestController
@RequestMapping("/book")
public class Userbookingcontroller {
	
	@Autowired 
	private Userbookingrepository Userbookingrepository;
	
	@PostMapping("/orders/addorder")
	public String saveBook(@RequestBody bookingorder book) {
		Userbookingrepository.save(book);
		return book.getId();
	    }

	@GetMapping("/")
	public String Check(){
		return("checked");
	}
	@GetMapping("/orders")
	public List<bookingorder> getAllTrains(){
		return Userbookingrepository.findAll();
	}
	@GetMapping("/orders/{id}")
	public Optional<bookingorder> getBook(@PathVariable String id){
		return Userbookingrepository.findById(id);
	}
	@PutMapping("/orders/update/{id}")
	public bookingorder updateOrder(@PathVariable("id") String id,@RequestBody bookingorder order ) {
		
		order.setId(id);
		Userbookingrepository.save(order);
		return order;
	}
	@DeleteMapping("/orders/delete/{id}")
	 public String deleteOrder (@PathVariable String id) {
	  Userbookingrepository.deleteById(id);
		return null;
		}
}
