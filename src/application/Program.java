package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		
		ChessMatch chessM = new ChessMatch();
		
		UI.printBoard(chessM.getPieces());
	
	}

}
