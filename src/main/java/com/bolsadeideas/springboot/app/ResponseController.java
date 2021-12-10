package com.bolsadeideas.springboot.app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResponseController {


	private final AtomicLong counter = new AtomicLong();

	 Integer[] primo = {2, 3, 5, 7, 11, 13, 17};
	   List<Integer> numeros = new ArrayList<>();
	   
	   Integer [] A1 = {2,4,5,6,7,8};
	   List<Integer> vasos = new ArrayList<>();
	   
	   
	   Integer [] A2 = {3,7,9,5,4,2};
	   Integer [] A3 = {5,7,9,11,13};
	   Integer [] A4 = {6,4,2,12,15};
	   Integer [] A5 = {7,10,15,11,9};
	   
	   public ResponseController(Integer [] A1,Integer []A2,Integer [] A3,Integer [] A4,Integer [] A5) {
		   A1 = this.A1;
		   A2 = this.A2;
		   A3 = this.A3;
		   A4 = this.A4;
		   A5 = this.A5;
	   }
		
	 
	@GetMapping("/rest/{num}")
	public Response response(@PathVariable Integer num) {
		
		List<Integer> B = new ArrayList<>();
		List<Integer> A = new ArrayList<>();
	

		if(num>=0) {
			for(int i=0; i<num; i++) {

				for(int j=0; j<primo.length; j++) {
					
					numeros.add(primo[j]);
					
					
					for(int k=0; k<A1.length; k++) {
						vasos.add(A1[k]);
						
						if(vasos.get(k)%numeros.get(j)==0) {
							B.add(vasos.get(k));
						}else {
							A.add(numeros.get(j));
						}
						
					}
				
				}
					
	
				
		      }
		
		}
		

		return new Response(counter.incrementAndGet(), B,A);
	}
	

	
}
