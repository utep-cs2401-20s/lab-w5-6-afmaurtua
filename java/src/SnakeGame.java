public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveCheck;

    //default constructors
    public SnakeGame(){
        int[][] gameboard = new int[1][];
    }

    //constructors
    public SnakeGame(int x, int y, boolean [][] g){
       game = g;
       headPosition = new int[]{x, y};
       headPosition[0] = x;
       headPosition[1] = y;
        //head[x][y] = true;
    }

    public int[] findTailExhaustive(){ //test cases
        int[] tail = new int[3];
        int length = 0;
        for(int i = 0; i < game.length; i++){ //going through the board
            for(int k = 0; k < game[i].length; k++){
               if(game[i][k] == true){//checking to see if the tail is there
                   length++;
                   if(neighbors(i, k) == 1){
                       if(i == headPosition[0] && k == headPosition[1]){ //this is the head
                           continue;
                       }
                       else{
                           tail[0] = i; //storing where the tail is
                           tail[1] = k;
                       }
                   }
               }
            }
        }

        tail[2] = length;
        return tail;
    }


    public int neighbors(int i, int k){
       int neighbors = 0;
       //top
        if((i -1) >= 0){ // if it's inside the array
           if(game[i-1][k]){
               neighbors ++;
           }
        }
        //bottom
        if((i +1) < game.length){
            if(game[i +1][k]){
                neighbors ++;
            }
        }
        //left
        if((k -1) < game.length){
            if(game[i][k -1]){
                neighbors ++;
            }
        }
        //right
        if((k +1) < game.length){
            if(game[i][k +1]){
                neighbors ++;
            }
        }
        return neighbors;

    }
    public int Snakelength(){ //finds the length of the snake
        int length = 0;
        for(int i = 0; i < game.length; i++){
            for(int k = 0; k < game[i].length; k++){
                if(this.game[i][k] == true){
                    length++;
                }
            }
        }
        return length;
    }

    public int[] findTailRecursive(){
        resetCounters();
        return findTailRecursive(headPosition, headPosition);
    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){ //test cases
        // base case

        if(neighbors(currentPosition[0], currentPosition[1]) ==1){
            if (headPosition[0] != currentPosition[0] && headPosition[1] != currentPosition[1]) {
            }
            return new int[]{currentPosition[0], currentPosition[1], Snakelength()};
            //top
            if((currentPosition[0]-1 < game.length) && (game[0 - 1][1] == true) && (previousPosition[0] != currentPosition[0]-1)){
                int[] newPos = new int[]{currentPosition[0]-1, currentPosition[1]};
                return findTailRecursive(newPos, currentPosition);

            }
            //Bottom
            if((currentPosition[0]+1 < game.length) && (game[0 + 1][1] == true) && (previousPosition[0] != currentPosition[0]+1)){
                int[] newPos = new int[]{currentPosition[0]+1, currentPosition[1]};
                return findTailRecursive(newPos, currentPosition);
            }
            //left
            if((currentPosition[0] < game.length) && (game[0][1-1] == true) && (previousPosition[0] != currentPosition[0]-1)){
                int[] newPos = new int[]{currentPosition[0], currentPosition[1]-1};
                return findTailRecursive(newPos, currentPosition);
            }
            //right
            if((currentPosition[0] < game.length) && (game[0][1+1] == true) && (previousPosition[0] != currentPosition[0]+1)){
                int[] newPos = new int[]{currentPosition[0], currentPosition[1]+1};
                return findTailRecursive(newPos, currentPosition);
            }

        }


    }

    private void resetCounters(){
        int neighbors = 0;
        int length = 0;

    }

    private static int getRecursiveChecks(){
       return recursiveCheck;
    }

    private static int getExhaustiveChecks(){
        return exhaustiveChecks;
    }




}
