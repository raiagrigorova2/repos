package edu.smg;

import java.util.Arrays;
import java.util.Scanner;

public class arrays05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�������� ��������, ����� ��������� ���� ������ ������� � ������� �� ������ �����. 
//		����� ��� � ����� ������ ������ �� �������� ������ ����� �� 1 �� 9, 
//		����� ������ 3�3 ������ �� ������� ������ ����� �� 1 �� 9.
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter the dimensions of your matrix: ");
		
		final int ROWS = sc.nextInt();
		final int COLS = sc.nextInt();
		
		int arr[][] = new int [ROWS][COLS];
		
		System.out.println("Please enter the numbers:");
		
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLS; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int maskRows[] = new int [COLS];
		int mask3x3[][] = new int [3][3];
		
		boolean solved = true;
		for(int i = 0; i < ROWS && solved; i++) {
			Arrays.fill(maskRows, 0);
			for(int j = 0; j < COLS; j++) {
				if(arr[i][j] == 0) {solved = false; break;}
				
				else{
					maskRows[arr[i][j]-1]=1;
				}
			}
			for(int q = 0; q < COLS; q++) {
				if(maskRows[q]==0) {solved = false; break;}
			}
		}
		
		
		
		
		
	}

}
