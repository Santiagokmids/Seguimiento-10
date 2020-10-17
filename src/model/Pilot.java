package model;

enum Team(){
	SCUDERIA_FERRARI,MCLAREN_F1_TEAM,RED_BULL_RACING,MERCEDES_AMG,RACING_POINT,ALFA_ROMEO,RENAULT,WILLIAMS;
}

public class Pilot{

//Atributes
 private Pilot name;
 private Pilot age;
 private Pilot team;
 private Pilot scores[];

 //Constructor
 public Pilot(String name, int age, Team team,int scores[]){
 	this.name = name;
 	this.age = age;
 	this.team = team;
 	this.scores[] = scores[];
 } 

 //Methods
 public double calculateAverage(){
    double average = 0.0;
    boolean stop = true;
 	for(int i = 0;i<14 || stop != false;i++){
 	average = average + getScores[i];
 	if (getScores[i] == null){
 		stop = false;
 	}
   }
   average = average / scores.length;
  return average;
 }

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

 public Team getTeam() {
		return team;
  }

 public void setTeam(Team team) {
		this.team = team;
  }

  public int[]getScores(){
  	return scores
  }

  public void setScores(int []scores){
  	this.scores = scores
  }

}