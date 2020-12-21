import java.util.Scanner;
public class ConversorDeTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		
		double c, f, k, result;
		int opc; 
		
		System.out.println("Insira 1 para converter de Celsius para Fahrenheit");
		System.out.println("Insira 2 para converter de Fahrenheit para Celsius");
		System.out.println("Insira 3 para converter de Celsius para Kelvin");
		System.out.println("Insira 4 para converter de Fahrenheit para Kelvin");
		System.out.println("Insira 5 para converter de Kelvin para Celsius");
		System.out.println("Insira 6 para converter de Kelvin para Fahrenheit");
		opc = s.nextInt();
		
		switch (opc) {
		
		case 1: System.out.println("Você escolheu converter de Celsius para Fahrenheit\n");
		
				System.out.println("Insira a temperatura em Celsius");
				c = s.nextDouble();
				
				result = f = (c * 9/5) + 32;
				
				System.out.println(c + "° Celsius é igual a: " + result + "° Fahrenheit");
				break;
				
		case 2: System.out.println("Você escolheu converter de Fahrenheit para Celsius\n");
		
				System.out.println("Insira a temperatura em Fahrenheit");
				f = s.nextDouble();
				
				result = (f - 32) / 1.8;
				
				System.out.println(f + "° Fahrenheit é igual a: " + result + "° Celsius");
				break;
				
		case 3: System.out.println("Você escolheu converter de Celsius para Kelvin\n");
		
				System.out.println("Insira a temperatura em Celsius");
				c = s.nextDouble();
				
				result = c + 273;  
						
				System.out.println(c + "° Fahrenheit é igual a: " + result + "° Kelvin");
				break;
				
		case 4: System.out.println("Você escolheu converter de Fahrenheit para Kelvin\n");
		
				System.out.println("Insira a temperatura em Fahrenheit");
				f = s.nextDouble();
				
				result = (f - 32) / 1.8000 + 273.15;
				
				System.out.println(f + "° Fahrenheit é igual a: " + result + "° Kelvin");
				break;
				
		case 5: System.out.println("Você escolheu converter de Kelvin para Celsius\n");
		
				System.out.println("Insira a temperatura em Kelvin");
				k = s.nextDouble();
				
				result = k = 273.15;
				
				System.out.println(k + "° Kelvin é igual a: " + result + "° Celsius");
				break;
				
		case 6: System.out.println("Você escolheu converter de Kelvin para Fahrenheit\n");
		
				System.out.println("Insira a temperatura em Kelvin");
				k = s.nextDouble();
				
				result = (k - 273.15) * 1.8000 + 32;
				
				System.out.println(k + "° Kelvin é igual a: " + result + "° Fahrenheit");
				break;
				
				
		
		}
		
		
	}

}