package com.ensa.commandes;


import com.ensa.LightReceiver;

public class LightOnCommand extends Commande {
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void executer(){
            this.lightReceiver.on();
    }

    @Override
    public void annuler(){
        this.lightReceiver.off();
    }
}