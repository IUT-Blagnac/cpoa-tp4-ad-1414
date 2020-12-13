package application.actionList;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import application.action.Action;
import application.action.ActionList;
import banque.AgenceBancaire;

public class ActionListAgenceBancaire implements ActionList{
	String message;
	ArrayList<Action> listeActions;
	ActionListAgenceBancaire(){
		message = "Menu Général";
		listeActions = new ArrayList<Action>();
		
	}
	@Override
	public String actionMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public void execute(AgenceBancaire ag) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Choisir: ");
		String a ;
		for (int i = 0; i < listeActions.size();i ++) {
			a = (i+1) + listeActions.get(i).actionMessage();
			System.out.println(a);	
		}
		boolean continuer = true; 
		Scanner lect = new Scanner ( System.in );
		lect.useLocale(Locale.US);
		String choix = lect.next();
		choix = choix.toLowerCase();
		int c = Integer.parseInt(choix);
		c =c-1;
		for (int i = 0; i < listeActions.size();i ++) {
			if (c == i)
				listeActions.get(i).execute(ag);
			else if(c == -1) {
				
			}
		}
	}

	@Override
	public String listTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addAction(Action ac) {
		// TODO Auto-generated method stub
		return false;
	}

}
