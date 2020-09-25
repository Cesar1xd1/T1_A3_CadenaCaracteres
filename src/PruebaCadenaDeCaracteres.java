import java.util.Scanner;

class CadenaDeCaracteres{
	Scanner entrada = new Scanner (System.in);
	private String cadena;

	public CadenaDeCaracteres () {}
	
	public CadenaDeCaracteres(String cadena) {
		super();
		this.cadena = cadena;
	}



	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	public void CadenaAlrevez(String cad) {
		System.out.println("Cadena al revez por letras");
		for (int i = 1;i<=cad.length();i=i+1) {
			System.out.print(cad.charAt(cad.length()-i));
		}
		
		
		System.out.println();
		String aux[] = cad.split(" ");
		System.out.println("Cadena Alrevez por palabras");
		for(int q = aux.length;q>0;q=q-1) {
			System.out.print(aux[q-1] + " ");	
		}
	}//CadenaAlrevez
	
	public void eliminarFragmento(String cad) {
		System.out.println("Seleccione la opción que desea:");
		System.out.println("Digite 1 para eliminar una letra en una posiscion");
		System.out.println("Digite 2 para eliminara una PALABRA en una posiscion");
		String op = "";
		
		
		int opn = 0;
		System.out.println("Ingresa una opcion:");
		op = entrada.next();
		System.out.println();
		if(op.equals("1")) {
			opn = 1;
		}else if(op.equals("2")){
			opn = 2;
		}else {
			System.out.println("Ups... Escoge una opcion valida");
			opn =0;
		}
		while(opn==0) {
			System.out.println("Ingresa una opcion:");
			op = entrada.next();
			System.out.println();
			if(op.equals("1")) {
				opn = 1;
			}else if(op.equals("2")){
				opn = 2;
			}else {
				System.out.println("Ups... Escoge una opcion valida");
				opn =0;
			}
		
		}//Wile
		int posiscion = 0;
		if(opn == 1) {
			System.out.println("Ingresa la posiscion de la letra que desea eliminar");
			posiscion = entrada.nextInt();
		
			for (int x =0;x<cad.length();x=x+1) {
				
				if(x+1==posiscion) {
					System.out.print("_");
				}else System.out.print(cad.substring(x,x+1));
			}
			
		}else if(opn == 2) {
			String aux[] = cad.split(" ");
			System.out.println("Ingresa la posiscion de la palabra que dea eliminar");
			posiscion = entrada.nextInt();
			for(int b = 0;b<aux.length;b=b+1) {
				if(b+1==posiscion) {
					System.out.print(" ___ ");
				}else System.out.print(aux[b]);
			}
		}
		
		
		
	}//EliminarFragmento
	
	public void camelCase(String cad) {
		String auxcad = "";
		System.out.println();
		System.out.println("La cadena con un Camel Case Especial es:");
		System.out.println();
		for(int j = 0;j<cad.length();j=j+1) {
			
			if((j%2)==0) {
				auxcad= (cad.substring(j, j+1)).toUpperCase();
			}else auxcad = cad.substring(j, j+1);
			System.out.print(auxcad);
		}
		
	}//camelCase
	
	public void primerLetraMayuscula(String cad) {
		String aux[] = cad.split(" ");
		System.out.println();
		System.out.println("La cadena con la letra de cada palabra en mayuscula es: ");
	
		for(int i =0;i<aux.length;i=i+1) {
			for(int j = 0;j<aux[i].length();j=j+1) {
				if(j==0) {
					String x = aux[i].substring(j, j+1);
					System.out.print(x.toUpperCase());
				}
				
			}
			System.out.println(aux[i].substring(1));
		}
		
	}
	
}



public class PruebaCadenaDeCaracteres {

	public static void main(String[] args) {
		
	CadenaDeCaracteres cdc = new CadenaDeCaracteres();
	String cadena = "cesar ramirez rodriguez";
	
	cdc.CadenaAlrevez(cadena);
	cdc.eliminarFragmento(cadena);
	cdc.camelCase(cadena);
	cdc.primerLetraMayuscula(cadena);
	}

}
