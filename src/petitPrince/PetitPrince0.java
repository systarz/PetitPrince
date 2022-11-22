package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet{
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	private int cpt;
	
	public PetitPrince0() {
		this.console = new ConsoleJavaBoy(this);
	}
	
	@Override
	public String getNom() {
		return this.nom;
	}
	@Override
	public int getArgent() {
		return this.argent;
	}
	@Override
	public void run() {
		this.cpt++;
		this.console.parler("[");
		this.console.seDirigerVers(0);
		
	}
	
	

}
