package com.bolsadeideas.springboot.app;

import java.util.List;

public class Response {
	
	private final long id;
	//private  Integer num;
	List<Integer> Divisible;
	List<Integer> NoDivisible;
	

	public Response(long id, List<Integer> Divisible,List<Integer> NoDivisible) {
		this.id = id;
		this.Divisible = Divisible;
	
		this.NoDivisible=NoDivisible;
	}

	public long getId() {
		return id;
	}
/*
	public Integer getNum() {
		return num;
	}
	*/

	public List<Integer> getDivisible() {
		return Divisible;
	}

	public void setDivisible(List<Integer> Divisible) {
		this.Divisible =Divisible;
	}



	public List<Integer> getNoDivisible() {
		return NoDivisible;
	}

	public void setNo(List<Integer> NoDivisible) {
		this.NoDivisible =NoDivisible;
	}
	
	
	
}
