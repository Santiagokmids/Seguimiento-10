	package model;

	enum Team{
		SCUDERIA_FERRARI, MCLAREN_F1_TEAM, RED_BULL_RACING, MERCEDES_AMG, RACING_POINT, ALFA_ROMEO, RENAULT, WILLIAMS ,EXCEP;
	}

	public class Pilot{

	//Atributes
	 private String name;
	 private int age;
	 private String team;
	 private int scores[];

	 //Constructor
	 public Pilot (String name, int age, String team,int scores[]){
	 	this.name = name;
	 	this.age = age;
	 	this.team = team;
	 	this.scores = scores;
	 } 

	 //Methods
	 public String getName() {
			return name;
	  }

	 public void setName(String name) {
			this.name = name;
	  }

	 public int getAge() {
			return age;
	  }

	 public void setAge(int age) {
			this.age = age;
	  }

	 public String getTeam() {
			return team;
	  }

	 public void setTeam(String team) {
			this.team = team;
	  }

	  public int[]getScores(){
	  	return scores;
	  }

	  public void setScores(int []scores){
	  	this.scores = scores;
	  }

	 public double calculateAverage(){
	    int average = 0;
	    double totalAverage;

	 	for(int i = 0;i<scores.length;i++){
	 	average = average + scores[i];
	   }

	   totalAverage = average / scores.length;

	  return totalAverage;
	 }

	 public Team addTeam(String team){
	 	Team message;
	 	if(team.equalsIgnoreCase("SCUDERIA FERRARI")){
	 		message = Team.SCUDERIA_FERRARI;
	 	}
	 	else if(team.equalsIgnoreCase("MCLAREN F1 TEAM")){
	 		message = Team.MCLAREN_F1_TEAM;
	 	}
	 	else if(team.equalsIgnoreCase("RED BULL RACING")){
	 		message = Team.RED_BULL_RACING;
	 	}
	 	else if(team.equalsIgnoreCase("MERCEDES AMG")){
	 		message = Team.MERCEDES_AMG;
	 	}
	 	else if(team.equalsIgnoreCase("RACING POINT")){
	 		message = Team.RACING_POINT;
	 	}
	 	else if(team.equalsIgnoreCase("ALFA ROMEO")){
	 		message = Team.ALFA_ROMEO;
	 	}
	 	else if(team.equalsIgnoreCase("RENAULT")){
	 		message = Team.RENAULT;
	 	}
	 	else if(team.equalsIgnoreCase("WILLIAMS")){
	 		message = Team.WILLIAMS;
	 	}
	 	else 
	 		message = Team.EXCEP;
	 	return message;
	 }

}