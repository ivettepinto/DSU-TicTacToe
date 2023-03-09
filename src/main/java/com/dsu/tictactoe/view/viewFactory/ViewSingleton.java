package com.dsu.tictactoe.view.viewFactory;

public class ViewSingleton {
    private static ViewAbstractFatory instance;
    
    public ViewAbstractFatory getInstance(){
        if(instance != null){
            return instance;
        }
        instance = new ConsoleOne();
        return instance;
    }
}
