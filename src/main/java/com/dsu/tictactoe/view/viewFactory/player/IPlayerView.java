package com.dsu.tictactoe.view.viewFactory.player;

import com.dsu.tictactoe.model.board.Coordinate;
import com.dsu.tictactoe.model.board.PutMarkError;
import com.dsu.tictactoe.model.player.Player;

public interface IPlayerView {
    public Player getPlayer(String errorMessage, String numberPlayer);
    public abstract String getName(String message);
    public abstract Coordinate getCoordinate(PutMarkError putMarkError);
}
