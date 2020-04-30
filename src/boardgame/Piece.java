package boardgame;

public abstract class Piece {
	
	protected Position position; // variável
	private Board board; //associação com a classe Board
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // somente as classes no mesmo pacote Board e as subclasses das peças terão acesso
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	//"Hook Methods"Um método concreto usando um método abstrato
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
