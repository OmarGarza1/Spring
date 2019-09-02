package com.prueba.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm{

	public int[] sort(int[] numbers) 
	{
		return numbers;
	}
	
}
