package com.sopra.pox3.inheritance;

import java.util.List;

public interface LivingStuff {
	
	
	List<? extends LivingStuff> multiply();
	void eat();
	void die();
}
