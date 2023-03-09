package com.dsu.tictactoe.view.viewFactory;

import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.consoleOne.player.ComputerPlayerView;
import com.dsu.tictactoe.view.consoleOne.player.HumanPlayerView;
import com.dsu.tictactoe.view.consoleOne.player.PlayerManagerView;
import com.dsu.tictactoe.view.consoleOne.BoardView;
import com.dsu.tictactoe.view.consoleOne.TurnView;
import com.dsu.tictactoe.view.consoleOne.TicTacToeView;
import com.dsu.tictactoe.view.viewFactory.player.IPlayerManagerView;
import com.dsu.tictactoe.view.viewFactory.player.IPlayerView;

public class ConsoleOne implements ViewAbstractFatory {

    @Override
    public IPlayerManagerView getPlayerManagerView() {
        return new PlayerManagerView();
    }

    @Override
    public IPlayerView getPlayerView(PlayerType type) {
        assert(type != null);
        switch(type){
            case HUMAN:
                return new HumanPlayerView();
            case COMPUTER:
                return new ComputerPlayerView();
        }
        return null;
    }

    @Override
    public ITicTacToeView getTicTacToeView() {
        return new TicTacToeView();
    }

    @Override
    public ITurnView getTurnView() {
        return new TurnView();
    }

    @Override
    public IBoardView getBoardView() {
        return new BoardView();
    }

}
