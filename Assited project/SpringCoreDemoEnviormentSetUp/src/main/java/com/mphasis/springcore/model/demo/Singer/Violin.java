package com.mphasis.springcore.model.demo.Singer;

import org.springframework.stereotype.Component;

@Component
public class Violin  implements Insturment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
	System.out.println("playing Violin");
		
	}

}
