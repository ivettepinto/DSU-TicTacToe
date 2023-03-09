package com.dsu.tictactoe.view.viewFactory;

import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.viewFactory.player.IPlayerManagerView;
import com.dsu.tictactoe.view.viewFactory.player.IPlayerView;

public interface ViewAbstractFatory {
    public IPlayerManagerView getPlayerManagerView();
    public IPlayerView getPlayerView(PlayerType type);
    public ITicTacToeView getTicTacToeView();
    public ITurnView getTurnView();
    public IBoardView getBoardView();
}