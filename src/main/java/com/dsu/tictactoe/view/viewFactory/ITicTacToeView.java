package com.dsu.tictactoe.view.viewFactory;

import com.dsu.tictactoe.model.Result;

public interface ITicTacToeView {
    public void showInstruccions();

    public void showStatistics(Result result);

    public int mainMenu();
}
