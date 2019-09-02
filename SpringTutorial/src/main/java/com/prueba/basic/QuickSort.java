package com.prueba.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSort implements SortAlgorithm{

	public int[] sort(int[] numbers) 
	{
		return numbers;
	}
}
