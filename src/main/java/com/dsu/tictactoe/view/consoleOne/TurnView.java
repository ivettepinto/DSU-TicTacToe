package com.dsu.tictactoe.view.consoleOne;

import com.dsu.tictactoe.model.board.Mark;
import com.dsu.tictactoe.model.board.PutMarkError;
import com.dsu.tictactoe.utils.Console;
import com.dsu.tictactoe.view.viewFactory.ITurnView;

public class TurnView implements ITurnView{

    @Override
    public void playerTurn(Mark turnMark, PutMarkError putMarkError, String playerName) {
        Console.printWhiteLine();
        Console.printTitle("Player Turn: "+turnMark.toString()+" - "+playerName);
        if (putMarkError != PutMarkError.NOT_ERROR){
            Console.printLine("Input error: "+putMarkError.getErrorDescription());
        }
    }
    
}