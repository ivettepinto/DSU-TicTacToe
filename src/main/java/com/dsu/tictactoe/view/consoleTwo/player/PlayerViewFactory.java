package com.dsu.tictactoe.view.consoleTwo.player;

import com.dsu.tictactoe.model.player.PlayerType;

public class PlayerViewFactory {

    public static PlayerView getPlayerView(PlayerType playerType){
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
