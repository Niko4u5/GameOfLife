public class Game {
    boolean[][] board;
    boolean[][] newBoard;
    int count;

    Game(int x){
        board = new boolean[x][x];
    }

    Game(boolean[][] setBoard) {
        board = setBoard;
    }

    public boolean getBoard(int x, int y) {
            return board[Math.floorMod(x, board.length)][Math.floorMod(y, (board.length))];
    }

    public int getNeighbors(int x, int y){
        count = 0;
        if(getBoard((x - 1),(y - 1))) {
            count++;}

        if(getBoard((x - 1),y)){
            count++;}

        if(getBoard((x - 1),(y + 1))){
            count++;}

        if(getBoard(x,(y + 1))){
            count++;}

        if(getBoard(x,(y - 1))){
            count++;}

        if(getBoard((x + 1),(y - 1))){
            count++;}

        if(getBoard((x + 1),y)){
            count++;}

        if(getBoard((x + 1),(y + 1))){
            count++;}

        return count;
    }

    public void step(){
        newBoard = new boolean[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(getNeighbors(i, j) == 2 && board[i][j]){
                    newBoard[i][j] = true;
                } else if(getNeighbors(i, j) == 3){
                    newBoard[i][j] = true;
                }else{
                    newBoard[i][j] = false;
                }
            }
        }
        board = newBoard;
    }
}
