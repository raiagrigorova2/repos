package edu.smg;

import java.util.*;



public class arrays04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� ��������, ����� ������� 4 ������ ����� �� ���� �� ����� � 52 �����
		 * �� ����. ����������, ��������� ���������� ����������� �� ���� ����� ��� ���
		 * ������ ����.
		 */
		Random random = new Random();
		String ranks []= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String suits []= {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		List <String> cards = new ArrayList <String> ();
		Collections.fill(cards, null);
		
		int rand1,rand2;
		
		
		for(int i=0;i < 4;i++) {
			do {
				rand1 = random.nextInt(ranks.length);
				rand2= random.nextInt(suits.length);
			}
			while (cards.contains(ranks[rand1] + " of " + suits[rand2]) );
			
			cards.add(ranks[rand1] + " of " + suits[rand2] + "");
		}
		
		System.out.println("Your 4 random cards are:" + cards);
		
		

	}

}
