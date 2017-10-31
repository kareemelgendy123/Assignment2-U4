/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignmentjava.recursions;

/**
 *
 * @author Kareem
 */
public class MazeSolver {
    
    public void printMaze  (char[][] maze){
        // Loop thorugh all the rows
        for (int i = 0; i < maze.length; i++){
            // Go through the row
            for (int j = 0; j < maze[i].length; j++){
                // Printing the current row
                System.out.print(maze[i][j]);
            }
            System.out.println("");
        } 
    }
    
    public boolean solveMaze (char[][] maze, int row, int col){
        // Did I find the end
        if (maze[row][col] == 'e'){
            printMaze(maze);
            return true;
        }
        // Am I off the map?
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length){
            return false;
        }
        // Is this a bad spot?
        if (maze[row][col] == '+' || maze[row][col] == 'w'){
            return false;
        }
        // Im on a valid spot
        // mark ive been here!
        maze[row][col] = '+';
        // Check north
        boolean check = solveMaze(maze, row-1, col);
        if (check){
            return true;
        }
        // Check east
        boolean check1 = solveMaze(maze, row, col+1);
        if (check){
            return true;
        }
        // Check south
        boolean check2 = solveMaze(maze, row+1, col);
        if (check){
            return true;
        }
        // Check west
        boolean check3 = solveMaze(maze, row, col-1);
        if (check){
            return true;
        }
        
        return true;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //char[][] maze = new char [10][10];
        char[][] maze = {{'w', 'w', 'w', 'w', '.', '.'},
                         {'s', '.', 'w', '.', 'w', '.'},
                         {'w', '.', 'w', '.', 'w', '.'},
                         {'w', '.', '.', '.', '.', '.'},
                         {'w', 'w', 'w', 'e', 'w', 'w'}};
        
        
        MazeSolver test = new MazeSolver();
        test.printMaze(maze);

    }
    
}
