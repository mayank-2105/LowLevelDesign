package services;

public class Grid {
    char [][]board;
    public Grid(int numRows) {
        board=new char[numRows][numRows];
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<numRows;j++)
            {
                board[i][j]='-';
            }
        }
    }
    public void printBoard() {
        for(int i=0;i<board[0].length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public boolean findWinner(Player p1) {
        
        boolean flag=true;
        for(int i=0;i<board[0].length;i++)
        {
            if(board[i][i]!=p1.piece)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println(p1.name+" won the game");
            return true;
        }
        flag=true;
        for(int i=0;i<board[0].length;i++)
        {
            if(board[i][board[0].length-i-1]!=p1.piece)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println(p1.name+" won the game");
            return true;
        }
        
        for(int i=0;i<board[0].length;i++)
        {
            flag=true;
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]!=p1.piece)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(p1.name+" won the game");
                return true;
            }
        }

        for(int j=0;j<board[0].length;j++)
        {
            flag=true;
            for(int i=0;i<board[0].length;i++)
            {
                if(board[i][j]!=p1.piece)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(p1.name+" won the game");
                return true;
            }
        }
        return false;
    }
    public boolean isValidMove(int row,int col) {
        if(board[row][col]!='-') {
            return false;
        }
        return true;
    }
    public void makeMove(Player pl,int row,int col) {
        board[row][col]=pl.piece;
    }
    public boolean noRemMoves() {
        
        for(int i=0;i<board[0].length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='-')
                return false;
            }
        }
        return true;
    }
}
