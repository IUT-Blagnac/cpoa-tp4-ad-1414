package application.action;

import java.util.Locale;
import java.util.Scanner;


import application.AccesAgenceBancaire;
import banque.AgenceBancaire;
import banque.Compte;
import banque.exception.CompteException;


public class ActionVoirCompteNumero implements Action{
	private String message;
	ActionVoirCompteNumero(){
		this.message="Afficher le(s) compte(s) avec le numéro de compte";
	}
	@Override
	public String actionMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	@Override
	public void execute(AgenceBancaire ag) throws Exception {
		Scanner lect = new Scanner ( System.in );
		lect.useLocale(Locale.US);
		System.out.print("Num compte -> ");
		String numero;
		Compte c ;
		numero = lect.next();
		c = ag.getCompte(numero);
		if (c==null) {
			System.out.println("Compte inexistant ...");
		} else {
			c.afficher();
		}
		
	}

}
