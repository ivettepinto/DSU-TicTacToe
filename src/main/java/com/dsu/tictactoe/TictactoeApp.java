package com.dsu.tictactoe;

import com.dsu.tictactoe.controller.TictacToeController;
import com.dsu.tictactoe.model.Tictactoe;
import com.dsu.tictactoe.view.viewFactory.ViewSingleton;

public class TictactoeApp {
    private Tictactoe tictactoe;
    private TictacToeController tictacToeController;
    
    public TictactoeApp(){
        ViewSingleton.setInstance(1);
        tictactoe = new Tictactoe();
        tictacToeController = new TictacToeController(tictactoe);
    }

    public void runGame(){
        tictacToeController.mainMenu();
    }
}
