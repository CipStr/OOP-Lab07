/**
 * 
 */
package it.unibo.oop.lab.enum2;
import static it.unibo.oop.lab.enum2.Place.*;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */

public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(INDOOR,10,"basket"),
	VOLLEY(INDOOR,12,"volley"),
	TENNIS(OUTDOOR,2,"tennis"),
	BIKE(OUTDOOR,1,"bike"),
	F1(OUTDOOR,10,"f1"),
	MOTOGP(OUTDOOR,15,"motogp"),
	SOCCER(OUTDOOR,22,"soccer");
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final Place p;
	private final int noTeamMembers;
	private final String actualName;
	
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private Sport (final Place p, final int noTeamMembers, final String actualName) {
		this.p=p;
		this.noTeamMembers=noTeamMembers;
		this.actualName=actualName;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public boolean isIndividualSport() {
		if(this.noTeamMembers<=2 || (this.p==OUTDOOR && this.actualName!="soccer")) {
			return true;
		}
		return false;
	}
	
	public boolean isIndoorSport() {
		if(this.p==INDOOR) {
			return true;
		}
		return false;
	}
	
	public Place getPlace() {
		return this.p;
	}
	
	public String toString() {
		return "Sport:" +this.actualName +"\t noTeamMembers:" + this.noTeamMembers + "\t" + this.p;
	}
}
