public class P14{
	public static void main(String args[]){
		char Mapa[][] = new char[5][5];
		for(int i= 0;i<Mapa.length;i++){
			for(int j=0;j<Mapa[i].length;j++){
				if((i==0)||(j==0)||(i==4)||(j==4)){
				Mapa[i][j] = '*';
				}else{
				Mapa[i][j] ='+';
				}			
			}
		}
		for(int i= 0;i<Mapa.length;i++){
			System.out.println("");		
			for(int j=0;j<Mapa[i].length;j++){
				System.out.print(Mapa[i][j]);
			}
		}
	}
}