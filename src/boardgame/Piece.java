package boardgame;

public class Piece {
	
	protected Position position; // variável
	private Board board; //associação com a classe Board
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // somente as classes no mesmo pacote Board e as subclasses das peças terão acesso
		return board;
	}
}
