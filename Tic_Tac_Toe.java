package practiseProblemsDay7;

import java.util.Scanner;

public class Tic_Tac_Toe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of Player 1 ");
		String p1 = sc.nextLine();
		System.out.println("Enter the name of Player 2 ");
		String p2 = sc.nextLine();
		
		
		char[][] board = new char[3][3];
		
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				board[i][j] = '-';
			}
		 
		}
	}
	public static void drawBoard(char [][] board) {
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}

