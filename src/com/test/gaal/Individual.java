package com.test.gaal;
/**
 * 个体
 * @author yelj
 * @date   2018年1月21日
 */
public class Individual {
	/**
	 * 基因型(一般为二进制编码)染色体的内部表现
	 */
	private byte[] genotype ;
	/**
	 * 表现型()根据基因型形成的个体的外部表现
	 */
	int phenotype;
	/**
	 * 创建一个随机的 基因个体
	 * @param geneSize
	 */
	public void generateIndividual(int geneSize) {
		genotype= new byte[geneSize];
		for (int i = 0; i < sizeOfGenotype(); i++) {
			byte gene = (byte) Math.round(Math.random());
			genotype[i] = gene;
		}
	}
	private int sizeOfGenotype() {
		// TODO Auto-generated method stub
		return genotype.length;
	}
	public byte[] getGenotype() {
		return genotype;
	}
	public void setGenotype(byte[] genotype) {
		this.genotype = genotype;
	}
	public int getPhenotype() {
		return phenotype;
	}
	public void setPhenotype(int phenotype) {
		this.phenotype = phenotype;
	}
	

}
