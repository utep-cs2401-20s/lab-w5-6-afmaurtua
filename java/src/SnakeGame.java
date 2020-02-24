public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveCheck;

    //default constructors
    public SnakeGame(){
        int[] gameboard = new int[1];
    }

    //constructors
    public SnakeGame(int x, int y, boolean [][] g){
       game = g;
       headPosition = new int[]{x, y};
       headPosition[0] = x;
       headPosition[1] = y;
        //head[x][y] = true;
    }

    public int[] findTailExhaustive(){
        int[] result = new int[3];
        int count = 0;
        for(int i = 0; i < game.length; i++){ //going through the board
            for(int k = 0; k < game[i].length; k++){
               if(game[i][k] == true){ //checking to see if the tail is there
                   if(i == headPosition[0] && k == headPosition[1]){ //this is the head
                       continue;
                   }
                   if(neighbors(i, k) == 1){ //checking
                       result[0] = i;
                       result[1] = k;
                   }
               }
            }
        }
        result[2] = length();
    }

    private int length() {
        int length = 0;
        return length;
    }

    public int neighbors(int i, int k){
       int length = 0;
       //top
        if (){

        }

    }

    public int[] findTailRecursive(){

    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){

    }

    private void resetCounters(){

    }

    private static int getRecursiveChecks(){
       return RecursiveChecks;
    }

    private static int getExhaustiveChecks(){
        return getExhaustiveChecks();
    }




}
