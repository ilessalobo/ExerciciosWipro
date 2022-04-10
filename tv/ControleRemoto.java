package tv;

import java.util.Scanner;

	public class ControleRemoto {
		
		Scanner scan = new Scanner(System.in);
		private int canal;
		private int volume;

    public ControleRemoto(int canal, int vol) {
    	this.canal = canal;
    	this.volume = vol;
    }
    
    public int getCanal()	{
        return canal;   
        }

    public void setCanal(int canal)	{
        this.canal = canal; 
        }

    public int getVol()	{
        return volume;   
        }

    public void setVol(int vol)	{
        this.volume = vol;    
        }

    public int aumentarVol()	{
    if(this.volume >= 10){
            System.out.println("Volume: "+this.volume);
            return 0;
            }else{
            return this.volume++;
        }
    }
    public int diminuirVol()	{
        if(this.volume <= 0)	{
            System.out.println("Volume: "+this.volume);
            return 0;
            }else{
            return this.volume--;
        }
    }
    
    public int aumentarCanal() {
        if(this.canal >=20)
            return this.canal = 1;
        else{
        return this.canal++;
        }
    }
    
    public int diminuirCanal()	{
        if(this.canal <= 1)
            return this.canal = 20;
        else{
        return this.canal--;
        }
    }
    
    public void consultaTv()	{
        System.out.println("Canal: "+this.canal+" | Volume: "+this.volume);
    }
    
    public void menu() { 
		int opcao = 0;
		do {
			System.out.println("\n===================================================\n");
			System.out.println("          1 - Aumentar canal        "); 
			System.out.println("          2 - Diminuir canal      ");
			System.out.println("          3 - Aumentar volume    ");
			System.out.println("          4 - Diminuir volume      ");
			System.out.println("          5 - Exibir canal e volume ");
			System.out.println("          0 - Sair do Menu         ");
			System.out.println("\n===================================================");		
			
			
               opcao = Integer.parseInt(scan.nextLine());
			
            switch (opcao) {
            
			case 1:
                    aumentarCanal();
			break;
			
		    case 2:
                   diminuirCanal();
			break;
                       
		    case 3:
                   aumentarVol();
            break;
                      
		    case 4:
                   diminuirVol();
            break;
            
			case 5:
                   consultaTv();
			break;
                      
			case 0:
            break;
            
		        default:
                        System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
