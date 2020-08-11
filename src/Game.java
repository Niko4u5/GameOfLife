public class Game {
    boolean[][] board;
    boolean[][] newBoard;

    Game(int height, int with){
        board = new boolean[height][with];
    }

    Game(boolean[][] newBoard) {
        this.board = newBoard;
    }

    public boolean getBoard(int x, int y) {
        try {
            return board[x][y];
        }catch (ArrayIndexOutOfBoundsException e){
            return false;
        }

    }

    public int getNeighbors(int x, int y){
        int count = 0;
        if(getBoard(x - 1,y - 1))
            count++;
        if(getBoard(x - 1,y))
            count++;
        if(getBoard(x - 1,y + 1))
            count++;
        if(getBoard(x,y + 1))
            count++;
        if(getBoard(x,y - 1))
            count++;
        if(getBoard(x + 1,y - 1))
            count++;
        if(getBoard(x + 1,y))
            count++;
        if(getBoard(x + 1,y + 1))
            count++;
        return count;
    }


}
