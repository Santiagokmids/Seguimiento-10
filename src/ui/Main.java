	package ui;

	import java.util.Scanner;

	import model.Championship;

	public class Main {

		//Atributes
			private Championship mainChampionship;

		//Globals variable
		    public Scanner lector;

		public Main(){
			lector = new Scanner(System.in);
			createChampionship();
		} 

	public static void main (String[]args){
		Main objMain = new Main();
		objMain.Menu();
	   }
	 
	//Methods
	   public void createChampionship(){
	   	System.out.println("");
	   	System.out.println("");
	   	System.out.println("-----------------------------------------------------");
	   	System.out.println("            *  FIA : BIENVENIDOS   *                ");
	   	System.out.println("-----------------------------------------------------");
	   	System.out.println("");

	   	System.out.println("INTRODUZCA LOS DATOS DEL CAMPEONATO");
	   	System.out.println("-----------------------------------------------------");
	   	System.out.println("");
	   	System.out.println("EN QUE ANIO SE REALIZO EL CAMPEONATO?");
	   	int year = lector.nextInt();
	   	System.out.println("");
	   	System.out.println("CUANTAS CARRERAS TUVO EL CAMPEONATO?");
	   	int races = lector.nextInt();
	    lector.nextLine();
	   	System.out.println("");

	   	mainChampionship = new Championship(year, races);
	   }

	   public void Menu(){
	   	 boolean stop = false;
	   	 for(int l = 0;!stop;l++){
	   	 	System.out.println("");
	   	 System.out.println("------------------------------------------------------");
         System.out.println(" * QUE DESEA HACER? *");	   	
         System.out.println("-----------------------------------------------------");
         System.out.println("");
         System.out.println("************************************************************************");
         System.out.println("1. AGREGAR UN PILOTO AL CAMPEONATO");
         System.out.println("2. VER EL PROMEDIO DE TODOS LOS PILOTOS EN TODAS LAS CARRERAS");
         System.out.println("3. SALIR DEL PROGRAMA");
         System.out.println("************************************************************************");
         int option = lector.nextInt();
         System.out.println("");
         lector.nextLine();
         
         switch(option){
         	case 1: 
         	   createPilot();
         	   break;

         	case 2:
         	    showAverage();
         	    break;

         	case 3:
         	     stop = true;
         	     System.out.println("GRACIAS POR SU SERVICIO :D");
         	    break;

            default: 
                System.out.println("Ingreso un numero NO valido");
         }
	   }
	}

	   public void createPilot(){
	   	System.out.println("-----------------------------------------------------");
	   	System.out.println("        AGREGAR PILOTOS PARA EL CAMPEONATO        ");
	   	System.out.println("-----------------------------------------------------");
	    System.out.println("");
        
	    System.out.println("INTRODUZCA EL NOMBRE DEL PILOTO");
	    String name = lector.nextLine();
	    System.out.println("");

	    System.out.println("INTRODUZCA LA EDAD DEL PILOTO");
	    int age = lector.nextInt();
	    lector.nextLine();
	    System.out.println("");

	    boolean stop = true;
	    String team="";
	    for(int l=0;stop;l++){
	    System.out.println("INTRODUZCA EL EQUIPO DEL PILOTO. Ya sea\n--[ Scuderia Ferrari ]\n--[ Mclaren F1 Team ]\n--[ Red Bull Racing ]\n--[ Mercedes AMG ]\n--[ Racing Point ]\n--[ Alfa Romeo ]\n--[ Renault ]\n--[ Wiliams ]\n");
	    team = lector.nextLine();
	    System.out.println("");
	       String messageY = mainChampionship.verificTeam(team);
	       System.out.println(messageY);
	       if(messageY.equals("")){
              stop = false;
	       } 
        }

	    System.out.println("INTRODUZCA LOS TIEMPOS EN SEGUNDOS DEL PILOTO EN TODAS LAS CARRERAS SEGUN EL ORDEN");
	    System.out.println("");
	    int []scores = new int [mainChampionship.getRaces()];
	    int l = 0; 

	    for(int i = 0;i<mainChampionship.getRaces();i++){
	          l++;	
	          System.out.println("Tiempo en la carrera #"+(l));
	          scores[i] = lector.nextInt();
	          System.out.println("");
	          lector.nextLine();  
	       }
	      
	      if(mainChampionship.findPilot(name)){

	        mainChampionship.addPilot(name,age,team,scores);
	        System.out.println("");
	        System.out.println("Se agrego el piloto exitosamente");
	       }
	      else {
	      	System.out.println("");

	      	System.out.println("No se pudo crear el piloto, ya hay uno con el mismo nombre o NO existe");
	        }
	   }

	   public void showAverage(){
	   	System.out.println("");
	     System.out.println("----------------------------------------------------------------");
	     System.out.println("    A CONTINUACION VERA LOS PROMEDIOS DE TODOS LOS PILOTOS...  ");
	     System.out.println("----------------------------------------------------------------");
	     String message = mainChampionship.showAverageTimes();
	     System.out.println(message);
	   }
	}