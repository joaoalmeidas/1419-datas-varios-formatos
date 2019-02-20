
public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(String[] data) {
		
		mes = Integer.parseInt(data[0]);
		dia = Integer.parseInt(data[1]);
		ano = Integer.parseInt(data[2]);
		
	}
	
	public String retornaDataExtenso() {
		
		String data = "";
		
		if(mes == 1) {
			
			data += "Janeiro";
			
		}else if(mes == 2) {
			
			data += "Fevereiro";
			
		}else if(mes == 3) {
			
			data += "Março";
			
		}else if(mes == 4) {
			
			data += "Abril";
			
		}else if(mes == 5) {
			
			data += "Maio";
			
		}else if(mes == 6) {
			
			data += "Junho";
			
		}else if(mes == 7) {
			
			data += "Julho";
			
		}else if(mes == 8) {
			
			data += "Agosto";
			
		}else if(mes == 9) {
			
			data += "Setembro";
			
		}else if(mes == 10) {
			
			data += "Outubro";
			
		}else if(mes == 11) {
			
			data += "Novembro";
			
		}else if(mes == 12) {
			
			data += "Dezembro";
			
		}
		
		data += String.format(" %d, %d", dia, ano);
		
		return data;
		
	}
	
}
