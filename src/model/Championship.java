package model;

public class Championship{

  //Relationships
	private Pilot[] pilots;

  //Atributes
    private int years;
    private int races;	

  //Constructor
    public Championship(int years, int races){
    	this.years = years;
    	this.races = races;
    }

    //Methods
    public void addPilot(String name, int age, Team team, int scores[]){
    	for(int i = 0;i<14;i++){
    		if (pilot[i] == null){
    			pilot[i] = new Pilot(name,age,team,scores[]);
    		}
    	}
    }

    public boolean findPilot(String name){
    	boolean find = true;
    	for(int i=0;i<14 || find != false;i++)
    	if(name.equalsIgnoreCase(pilots[i].getName()) && pilots[i] != null){
    		find = false;
    	}
    }

    public String showAverage(){
    	String message = "";
    	boolean exit = true;
        for(int i = 0;i<14 || exit != false;i++){
    	 if(pilots[i] != null){
    		timeprom = pilots.calculateAverage();
    		timeprom = (int)(timeprom);
	    	horas1 = (int)(timeprom/3600);
		    conta1 = timeprom%3600;
            minu1 = (int)(conta1/60);
		    conta1 = (int)(conta1);
		    seg1 = conta1 % 60;
	        find = false;

            message = ("El piloto "+pilots[i].getName()+" obtuvo un promedio de "+horas[l]+ " horas, " +minu[l]+ "minutos y "
              +segu[l]+ " segundos" );
    	} 
      }
      return message;
   }
}