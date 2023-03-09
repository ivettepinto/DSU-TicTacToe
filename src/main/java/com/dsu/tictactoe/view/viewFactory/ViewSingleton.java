package com.dsu.tictactoe.view.viewFactory;

public class ViewSingleton {
    private static ViewAbstractFatory instance;
    
    public static ViewAbstractFatory getInstance(){
        if(instance != null){
            return instance;
        }
        return null;
    }

    public static void setInstance(int view) {
        switch(view){
            case 1:
                instance = new ConsoleOne();
                break;
            case 2:
                instance = new ConsoleTwo();
                break;
            default:
                break;
        }
    }

    
}
