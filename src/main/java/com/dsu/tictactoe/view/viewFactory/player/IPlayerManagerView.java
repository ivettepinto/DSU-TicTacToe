package com.dsu.tictactoe.view.viewFactory.player;

import com.dsu.tictactoe.model.player.Player;
import com.dsu.tictactoe.model.player.PlayerError;
import com.dsu.tictactoe.model.player.PlayerType;

public interface IPlayerManagerView {
    public Player getNewPlayer(PlayerError playerError, Player newPlayer, PlayerType[] playerTypevalues);
}
