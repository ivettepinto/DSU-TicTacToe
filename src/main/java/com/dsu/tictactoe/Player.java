package com.dsu.tictactoe;

import com.dsu.tictactoe.board.Coordinate;
import com.dsu.tictactoe.utils.Console;
import com.dsu.tictactoe.utils.Mark;

public class Player {
    //Counter to make player id incrementable
    private static int counter = 0;
    private int id;
    private String name;
    private Mark mark;
    
    public Player(String name) {
        this.id = ++counter;
        this.name = name;
    }

    public Coordinate putMark(){
        boolean validRow = false, validColumn = false;
        int row = 0, column = 0;

        //Select the row where the player wants to put the mark
        do{
            System.out.println(this.name + " select a row to put your mark");
            System.out.print("ROW: ");
            row = Console.getInt();

            //Row range in board
            if(row <= 0 || row > 3){
                System.out.println("Invalid row! It must be between 1 and 3");
                validRow = false;
            }else{
                validRow = true;
            }
        }while(validRow == false);

        //Select the row where the player wants to put the mark
        do{
            System.out.println(this.name + " now select a column to put your mark");
            System.out.print("COLUMN: ");
            column = Console.getInt();

            //Column range in board
            if(column <= 0 || column > 3){
                System.out.println("Invalid column! It must be between 1 and 3");
                validColumn = false;
            }else{
                validColumn = true;
            }
        }while(validColumn == false);

        return new Coordinate(row - 1, column - 1);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tNAME: " + name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
    
    
}
