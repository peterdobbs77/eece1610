/*
 * Homework 10 Problem 3a
 * References: Introduction to Programming Using Java, Anthony J. Dos Reis
 * 
 * @author Peter Dobbs
 */
public class IntHasher {
	
	public int[] ia;
	private boolean[] available;
	private int entryCount;
	private long probeCount;
	private int currentSlot;
	//----------------------
	public IntHasher(){
		
		ia = new int[1000];
		available = new boolean[1000];
		for (int i=0; i<available.length; i++){
			available[i]=true;
		}
		entryCount=0;
		probeCount=0;
	}
	//---------------------------
	public boolean enter(int x){
		currentSlot = Math.abs(x)%1000;
		// stores values in slots, unless slots are unavailable
		if (available[currentSlot]==true){
			ia[currentSlot]=x;
			available[currentSlot]=false;
		}
		// if slots are unavailable, search for an available slot
		else{
			while (available[currentSlot]==false){
				// check if next slot is available
				currentSlot+=1;
				if (currentSlot<ia.length){
					if (available[currentSlot]==true){
						ia[currentSlot]=x;
						available[currentSlot]=false;
						break;
					}
					else continue;
				}
				else if (currentSlot==ia.length) currentSlot=0;
				else {
					return false;
			}
		}
		}
		entryCount+=1;
		return true;
	}
	//--------------------------
	public int getIndex(int x){
		probeCount+=1;
		if (ia[Math.abs(x)%1000]==x){
			return (Math.abs(x)%1000);
		}
		for (int i=0; i<ia.length; i++){
			probeCount+=1;
			if (ia[i]==x){
				return i;
			}
			else continue;
		}
		return -1;
	}
	//------------------------
	public long getProbeCount(){
		return probeCount;
	}
	public int getEntryCount(){
		return entryCount;
	}
	//---------------------------
	public void clear(){
		for (int i=0; i<available.length; i++){
			available[i]=true;
		}
		entryCount=0;
		probeCount=0;
	}
}
