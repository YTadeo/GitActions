package proyectocalculadora;

public class Calculadora 
{
        private double memoria=0;
	private char ultimoOperador='=';
        private boolean radianes=true;


	public void operacion(double numero, char operador)
	{
		if(ultimoOperador=='=')
		  memoria = numero;
		else
			switch(ultimoOperador)
			{
				case '+': memoria+=numero; break;
				case '-': memoria-=numero; break;
                                case '*': memoria*=numero; break;
                                case '/': memoria/=numero; break;
                                case'π': memoria=Math.PI; break;
                                case'e':memoria=Math.E; break;
                                case '√': memoria=Math.sqrt(numero);break;
                                case '²': memoria=Math.pow(numero, (2)); break;
                                case '³': memoria=Math.pow(numero,(3)); break;
                                case 's': memoria=Math.sin(numero); break;
                                case 'c': memoria=Math.cos(numero); break;
                                case 't': memoria=Math.tan(numero); break;
                                case 'l': memoria=Math.log10(numero); break;
                                case 'L': memoria=Math.log(numero); break;
                                case 'R': memoria=Math.toRadians(numero);break;
                                case 'D': memoria=Math.toDegrees (numero); break;
                                
                                
                              
                                //case 'R': memoria= ;break;
                                //case 'D': memoria= ;break;
                        }
		     ultimoOperador=operador;
	}

        public void clearMemory()
        {
            memoria=0;
        }
        
	public double getMemoria()
	{
		return memoria;
	}

        public void setRadianes()
        {
            radianes=false;
            
            
        }
        
        public void setDegrees()
        {
            radianes=false;
        }
        
        public boolean isRadianes()
        {
            return radianes;
        }
}
