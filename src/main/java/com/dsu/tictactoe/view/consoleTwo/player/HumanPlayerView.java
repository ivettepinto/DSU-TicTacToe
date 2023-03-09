package com.dsu.tictactoe.view.consoleTwo.player;

import com.dsu.tictactoe.model.board.Coordinate;
import com.dsu.tictactoe.model.board.PutMarkError;
import com.dsu.tictactoe.model.player.Player;
import com.dsu.tictactoe.utils.Console;
import com.dsu.tictactoe.view.interfaces.player.IPlayerView;

public class HumanPlayerView implements IPlayerView {

    @Override
    public String getName( String message) {
        return Console.readString(message);
    }

    @Override
    public Coordinate getCoordinate(PutMarkError putMarkError) {
        return new Coordinate(Console.readInt("Input coordinate x:"), Console.readInt("Input coordinate y:"));
    }

    @Override
    public Player getPlayer(String errorMessage, String numberPlayer) {
        if (errorMessage!=null){
            Console.printLine(errorMessage);
        }
        String name = "";
        do {
            name = getName( "Name of "+numberPlayer+" the player:");
            //Console.readString("Name of "+numberPlayer+" the player:")
            name = name.trim();
            if (name.length()==0){
                errorMessage = "Invalid username, enter again.";;
            }
        } while (name.length()==0);
        return new Player(name);
    }
    
}