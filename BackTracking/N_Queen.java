public class N_Queen {

    public static void queens(char board[][],int row){
        //base
        if(row==board.length){
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            queens(board, row+1);
            board[row][j]='.';
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("---------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=3;
        char board[][]=new char[n][n];

        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        queens(board, 0);
    }
}
