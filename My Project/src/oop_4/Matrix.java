//package oop_4;
//
//public class Matrix {
//	
//	private double values [][];
//	private int numRows;
//	private int numColumns;
//	
//	public Matrix(){
//		
//	}
//	
//	public Matrix (int m,int n){
//		values= new double [m][n];
//		numRows = m;
//		numColumns = n;
//	}
//	
//	public Matrix (double data[][]){
//		values = data;
//		numRows = data.length;
//		numColumns = data[0].length;
//	}
//	
//	public Matrix add (Matrix other){
//		double result[][] = new double [numRows][numColumns];
//		for(int i = 0 ; i<numRows-1 ; i++){
//			for(int j = 0 ; j<numColumns-1 ; j++){
//				if(i==j)
//					result[i][j] = values[i][j] + other.getValues()[i][j];
//			}
//		}
//		return new Matrix(result);
//	}
//	
//	public Matrix subtract (Matrix other){
//		double result[][] = new double [numRows][numColumns];
//		for(int i = 0 ; i<numRows-1 ; i++){
//			for(int j = 0 ; j<numColumns-1 ; j++){
//				if(i==j)
//					result[i][j] = values[i][j] - other.getValues()[i][j];
//			}
//		}
//		return new Matrix(result);
//	}
//	
//	public Matrix multiply (Matrix other){
//		
//	}
//	
//	public Matrix transpose(){
//		
//	}
//	
//	public double [][] getValues(){
//		return values;
//	}
//	
//	public int getNumRows(){
//		return numRows;
//	}
//	
//	public int getNumColumns(){
//		return numColumns;
//	}
//	
//	public double [] getRow(int r){
//		return ;
//	}
//	
//	public double [] getColumn(int c){
//		return
//	}
//	
//	public String toString(){
//		
//	}
//}
