package com.ensa;

import com.ensa.commandes.*;

public class Main {

    public static void main(String[] args) {

        Telecommande telecommande = new Telecommande();

        LightReceiver lightReceiver = new LightReceiver();
        RadioReceiver radioReceiver = new RadioReceiver();
        TvReceiver tvReceiver = new TvReceiver();

        Commande onLightCommande = new LightOnCommand(lightReceiver);
        Commande offLightCommande = new LightOffCommand(lightReceiver);

        Commande onTvCommand = new TvOnCommand(tvReceiver);
        Commande offTvCommand = new TvOffCommand(tvReceiver);

        Commande onRadioCommand = new RadioOnCommand(radioReceiver);
        Commande offRadioCommand = new RadioOffCommand(radioReceiver);

        telecommande.setCommande(0,onLightCommande, offLightCommande);
        telecommande.setCommande(1, onTvCommand, offTvCommand);
        telecommande.setCommande(2,onRadioCommand, offRadioCommand);

        System.out.println("-------------telecommande: "+telecommande);

        telecommande.boutonMarchePresse(0);
        telecommande.boutonArretPresse(0);
        telecommande.boutonMarchePresse(1);
        telecommande.boutonArretPresse(1);
        telecommande.boutonMarchePresse(2);
        telecommande.boutonArretPresse(2);

    }
}

