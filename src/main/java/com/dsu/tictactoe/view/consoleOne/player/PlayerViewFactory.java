package com.dsu.tictactoe.view.consoleOne.player;

import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.interfaces.player.IPlayerView;

public class PlayerViewFactory {

    public static IPlayerView getPlayerView(PlayerType playerType){
        assert(playerType != null);
        switch (playerType) {
            case HUMAN:
                return new HumanPlayerView();
            case COMPUTER:
                return new ComputerPlayerView();
        }
        return null;
    }
}
