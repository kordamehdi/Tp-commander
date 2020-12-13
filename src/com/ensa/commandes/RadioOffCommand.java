package com.ensa.commandes;

import com.ensa.RadioReceiver;

public class RadioOffCommand extends Commande{
    private RadioReceiver radioReceiver;

    public RadioOffCommand(RadioReceiver radioReceiver) {
        this.radioReceiver = radioReceiver;
    }

    @Override
    public void executer(){
        this.radioReceiver.off();
    }
    @Override
    public void annuler(){
        this.radioReceiver.on();
    }
}
