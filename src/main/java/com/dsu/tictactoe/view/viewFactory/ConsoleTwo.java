package com.dsu.tictactoe.view.viewFactory;

import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.consoleTwo.BoardView;
import com.dsu.tictactoe.view.consoleTwo.TicTacToeView;
import com.dsu.tictactoe.view.consoleTwo.TurnView;
import com.dsu.tictactoe.view.consoleTwo.player.ComputerPlayerView;
import com.dsu.tictactoe.view.consoleTwo.player.HumanPlayerView;
import com.dsu.tictactoe.view.consoleTwo.player.PlayerManagerView;
import com.dsu.tictactoe.view.interfaces.IBoardView;
import com.dsu.tictactoe.view.interfaces.ITicTacToeView;
import com.dsu.tictactoe.view.interfaces.ITurnView;
import com.dsu.tictactoe.view.interfaces.player.IPlayerManagerView;
import com.dsu.tictactoe.view.interfaces.player.IPlayerView;

public class ConsoleTwo implements ViewAbstractFatory {

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
