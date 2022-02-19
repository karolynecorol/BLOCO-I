package listaexercicio05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	
	public static void main(String[] args) {
		 Date data = new Date ();
		 SimpleDateFormat formatardia = new SimpleDateFormat ("d");
		 String dataformatadaD = formatardia.format(data);
		 System.out.println (dataformatadaD);
		 
		 SimpleDateFormat formatarMes = new SimpleDateFormat ("M");
		 String dataformatadaM = formatarMes.format(data);
		 System.out.println (dataformatadaM);
		 
		 SimpleDateFormat formatarAno = new SimpleDateFormat ("y");
		 String dataformatadaA = formatarAno.format(data);
		 System.out.println (dataformatadaA);
		 
		 //ideia gustavo = transformou string em int 
		 int diasInt = Integer.parseInt(dataformatadaD);
		 int oito = 8;
		 int resultadoDias = oito - diasInt;
		 System.out.println(resultadoDias);
		 
		 int mesInt = Integer.parseInt(dataformatadaD);
		 int doze = 12;
		 int resultadoDias = oito - diasInt;
		 System.out.println(resultadoDias);
		 
		 
		 
	}

}
