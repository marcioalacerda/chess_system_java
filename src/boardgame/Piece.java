package boardgame;

public class Piece {
	
	protected Position position; // vari�vel
	private Board board; //associa��o com a classe Board
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // somente as classes no mesmo pacote Board e as subclasses das pe�as ter�o acesso
		return board;
	}
}
