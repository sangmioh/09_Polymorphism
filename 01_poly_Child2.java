package com.kh.chap01_poly.part01_basic.model.vo;

public class Child2 extends Parent  {

	//�ʵ��
	private int n;
	
	//�����ں�
	public Child2() {
		super();
	}
	public Child2(int x, int y,int n) {
		super(x, y);
		this.n = n;
	}
	
	//�޼ҵ��
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "Child2 [x="+super.getX()+", y="+super.getY()+", n=" + n + "]";
	}
     public void printChild2() {
    	 System.out.println("�� �ι�° �ڽ��̾�");
     }

	public void print() {
		System.out.println("�� �ι�° �ڽ��̾�");
	}
	
	
	
	
	
}