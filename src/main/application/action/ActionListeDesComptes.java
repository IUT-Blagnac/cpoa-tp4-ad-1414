/**
 * 
 */
package application.action;

import banque.AgenceBancaire;

/**
 * @author Etudiant
 *
 */
public class ActionListeDesComptes implements Action{
	private String message;
	ActionListeDesComptes(){
		this.message="Afficher la liste des comptes";
	}
	@Override
	public String actionMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public void execute(AgenceBancaire ag) throws Exception {
		ag.afficher();
		
	}
}
