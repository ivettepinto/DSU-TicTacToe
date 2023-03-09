package com.dsu.tictactoe.view.viewFactory;

import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.interfaces.IBoardView;
import com.dsu.tictactoe.view.interfaces.ITicTacToeView;
import com.dsu.tictactoe.view.interfaces.ITurnView;
import com.dsu.tictactoe.view.interfaces.player.IPlayerManagerView;
import com.dsu.tictactoe.view.interfaces.player.IPlayerView;

public interface ViewAbstractFatory {
    public IPlayerManagerView getPlayerManagerView();
    public IPlayerView getPlayerView(PlayerType type);
    public ITicTacToeView getTicTacToeView();
    public ITurnView getTurnView();
    public IBoardView getBoardView();
}