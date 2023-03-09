package com.dsu.tictactoe.view.viewFactory.player;

import com.dsu.tictactoe.model.player.Player;

public interface IPlayerView {
    public Player getPlayer(String errorMessage, String numberPlayer);
}
