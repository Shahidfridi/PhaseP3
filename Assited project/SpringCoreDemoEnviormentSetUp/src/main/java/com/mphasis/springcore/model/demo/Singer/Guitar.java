package com.mphasis.springcore.model.demo.Singer;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Insturment {

	public static void main(String[] args) {
	

	}

	@Override
	public void play() {
	System.out.println("palying Guitar");
		
	}

}
