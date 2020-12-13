package com.ensa.commandes;


import com.ensa.LightReceiver;

public class LightOffCommand extends Commande {
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void executer(){
        this.lightReceiver.off();
    }
    @Override
    public void annuler(){
        this.lightReceiver.on();
    }
}
