package com.ensa.commandes;

import com.ensa.TvReceiver;

public class TvOffCommand extends Commande {
    private TvReceiver tvReceiver;

    public TvOffCommand(TvReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void executer() {
        this.tvReceiver.off();
    }
    @Override
    public void annuler() {
        this.tvReceiver.on();
    }
}
