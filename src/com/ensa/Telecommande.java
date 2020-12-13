package com.ensa;


import com.ensa.commandes.Commande;

public class Telecommande {
    private Commande[] commandesMarche;
    private Commande[] commandesArret;
    private Commande annulation;

    public Telecommande() {
        commandesMarche = new Commande[3];
        commandesArret = new Commande[3];
    }
    public void setCommande (int empt, Commande comMarche, Commande comArret){
        commandesMarche[empt] = comMarche;
        commandesArret[empt] = comArret;
    }

    public void boutonMarchePresse (int empt){
        commandesMarche[empt].executer();
        this.annulation = this.commandesMarche[empt];
    }
    public void boutonArretPresse(int empt){
        commandesArret[empt].executer();
        this.annulation = this.commandesArret[empt];
    }

    public void annuler(){
        this.annulation.annuler();
    }
    //redef de toString affiche chaque emplacement et sa cmd correspondante
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("------------Telecommande-------------");
        for (int i= 0; i< commandesMarche.length; i++){
            stringBuff.append("[empt " +i+ "]"+ commandesMarche[i].getClass().getName()+""+commandesArret[i].getClass().getName());
        }
        return stringBuff.toString();
    }
}
