package com.ensa.commandes;

import com.ensa.TvReceiver;

public class TvOnCommand extends Commande{
    private TvReceiver tvReceiver;

    public TvOnCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void executer() {
        this.tvReceiver.on();

    }

    @Override
    public void annuler() {
        this.tvReceiver.off();

    }
}
