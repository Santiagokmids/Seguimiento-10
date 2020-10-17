	package model;

	public class Championship{

	  //Relationships
		private Pilot[]pilots;

	  //Atributes
	    private int years;
	    private int races;	

	  //Constructor
	    public Championship(int years, int races){
	    	this.years = years;
	    	this.races = races;
	    	pilots = new Pilot[15];
	    }

	    //Methods
	    public void addPilot(String name, int age, String team, int scores[]){
	    	boolean exit = true;
	    	if (findPilot(name)){  
	    	for(int i = 0;i<15 && exit;i++){
	    		if (pilots[i] == null){
	    			pilots[i] = new Pilot(name,age,team,scores);
	    			exit = false;
	    		}
	    	}
	      }
	    }

	    public boolean findPilot(String name){
	    	boolean find = true;
	    	for(int i=0;i<15 && find;i++){
	    	 if(pilots[i] != null && pilots[i].getName().equalsIgnoreCase(name)){
	    		find = false;
	    	       }
	       }
	    	return find;
	    }

	    public String showAverageTimes(){
	    	String message = "";
	    	boolean exit = true;
	        for(int i = 0;i<15 || exit;i++){
	    	 if(pilots[i] != null){
	    		double timeprom = pilots[i].calculateAverage();
	    	    timeprom = (int)(timeprom);
		    	double horas = (int)(timeprom/3600);
			    int conta = (int)timeprom % 3600;
	            double minu = (int)(conta/60);
			    conta = (int)(conta);
			    double segu = conta % 60;
	            message += "El piloto "+pilots[i].getName()+" obtuvo un promedio de "+horas+ " horas, " +minu+ " minutos y "
	              +segu+ " segundos" ;
	            exit = false;
	      }
	   }
	   return message;
	}

	 public int getYears() {
			return years;
	  }

	 public void setYears(int years) {
			this.years = years;
	  }

	 public int getRaces() {
			return races;
	  }

	 public void setRaces(int races) {
			this.races = races;
	  }

	}