package com.dsu.tictactoe.view.viewFactory;

import com.dsu.tictactoe.model.board.Mark;
import com.dsu.tictactoe.model.board.PutMarkError;

public interface ITurnView {
    public void playerTurn(Mark turnMark, PutMarkError putMarkError, String playerName);
}
