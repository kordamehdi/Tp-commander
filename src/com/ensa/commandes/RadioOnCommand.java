package com.ensa.commandes;

import com.ensa.RadioReceiver;

public class RadioOnCommand extends Commande{
    private RadioReceiver radioReceiver;

    public RadioOnCommand(RadioReceiver radioReceiver){
        this.radioReceiver = radioReceiver;
    }

    @Override
    public void executer(){
        this.radioReceiver.on();
    }
    @Override
    public void annuler(){
        this.radioReceiver.off();
    }
}
