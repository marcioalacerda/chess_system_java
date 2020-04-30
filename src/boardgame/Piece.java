package boardgame;

public abstract class Piece {
	
	protected Position position; // vari�vel
	private Board board; //associa��o com a classe Board
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // somente as classes no mesmo pacote Board e as subclasses das pe�as ter�o acesso
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	//"Hook Methods"Um m�todo concreto usando um m�todo abstrato
	// Template Mothods
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
