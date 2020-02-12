import java.util.Scanner;

class Main {
 	public static void Main (String[] args) {
		Scanner sc = new Scanner (System.in);
		//bloco para receber os dados
		System.out.println ("P1: ");
			double P1 = sc.nextDouble();
			
		System.out.println ("P2: ");
			double P2 = sc.nextDouble();
		
		System.out.println ("P3: ");
			double P3 = sc.nextDouble();
		
		System.out.println ("P4: ");
			double P4 = sc.nextDouble();
		sc.close();
		//bloco dos calculos	
		double N1 = (P1 + P2) /2;
		double N2 = (P3 + P4) /2;
		double N5 = (N1 + N2) /2;
		
		//Aluno com nota maior que 7
		
		if (N5>=7) {
			System.out.println ("Aprovado, nota final: "+ N5);
		                                                      //Aluno com nota menor que 7 e maior que 4
		}else if (N5>4){
			System.out.println ("PF: ");
			double PF = sc. nextDouble();		                  //PF=provafinal
			double NF =	(N5 + PF)/2;				              //NF= Nota final
			
		    if (NF>5)  {                                 //condicoes do resultado final maior que 5
		    	 System.out.println ("Aprovado, nota final: "+ NF);
		}else {
			System.out.println ("Reprovado, nota final: "+ NF);
		}
	} else if (N5<4){
		System.out.println ("Reprovado, nota final: " + N5);
	}
 }
}