package com.test.gaal;

import com.lxl.ga.simplega.Individual;

/**
 * 
 * @author yelj
 * @date   2018年1月21日
 */
public class Population {
	Individual[] individuals;
	public Population(int populationSize,int individualSize) {
		individuals = new Individual[populationSize];       
		for (int i = 0; i < sizeOfPopulation(); i++) {
			Individual individual = new Individual(individualSize);
			saveIndividual(i, individual);
		}

	}
	private int sizeOfPopulation() {
		// TODO Auto-generated method stub
		return 0;
	}
}
