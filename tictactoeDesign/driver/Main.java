package driver;
import java.util.Scanner;
import services.Player;
import services.Grid;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Grid grid = new Grid(3);
        Player pl1= new Player("dummy1", 'X');
        Player pl2= new Player("dummy2", 'O');
        Player curPlayer = pl1;
        while(true) {
            String cmd = sc.nextLine();
            String[] cmdList=cmd.split(" ");
            
            if(cmd.contains("X")) {
                pl1 = new Player(cmdList[1],cmdList[0].charAt(0));
                curPlayer=pl1;
            } else if(cmd.contains("O")) {
                pl2 = new Player(cmdList[1],cmdList[0].charAt(0));
            } else if(cmd.contains("exit")) {
                break;
            } else {
                int row=Integer.parseInt(cmdList[0])-1;
                int col=Integer.parseInt(cmdList[1])-1;
                if(grid.isValidMove(row,col)==true) {
                    grid.makeMove(curPlayer, row, col);
                    grid.printBoard();
                    boolean res= grid.findWinner(curPlayer);
                    if(res==true)
                    break;
                    if(grid.noRemMoves()==true)
                    {
                        System.out.println("Game Over!");
                        break;
                    }
                    if(curPlayer==pl1)
                    curPlayer=pl2;
                    else
                    curPlayer=pl1;
                }
                else {
                    System.out.println("Invalid Move!");
                }

                
            }
            
        }
        sc.close();
    }
}