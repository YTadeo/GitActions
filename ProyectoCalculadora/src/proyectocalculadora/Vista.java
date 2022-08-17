
package proyectocalculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

public class Vista extends JFrame implements ActionListener
{
        // El objeto calculadora es el que realmente realiza las operaciones
    	private Calculadora casio = new Calculadora();
    	private boolean nuevo=true;

	private JMenuBar barraMenus = new JMenuBar();

	private JMenu archivo 	  = new JMenu("Archivo");
	private JMenuItem salir   = new JMenuItem("Salir");

	private JTextField display = new JTextField();
        private JButton b0 = new JButton("0");
	private JButton b1 = new JButton("1");
	private JButton b2 = new JButton("2");
	private JButton b3 = new JButton("3");
	private JButton b4 = new JButton("4");
	private JButton b5 = new JButton("5");
	private JButton b6 = new JButton("6");
	private JButton b7 = new JButton("7");
	private JButton b8 = new JButton("8");
	private JButton b9 = new JButton("9");
	private JButton mas= new JButton("+");
	private JButton menos=new JButton("-");
	private JButton igual=new JButton("=");
        private JButton cE   = new JButton("CE");
        private JButton sin = new JButton("sin"); //seno 
        private JButton coseno = new JButton("cos");//coseno
        private JButton tangente = new JButton("tan"); //tan
        private JButton inverso = new JButton("inv"); //inverso
        private JButton pot2 = new JButton("²"); //potencia 2 
        private JButton pot3 = new JButton("³"); //potencia 3
        private JButton raiz2 = new JButton("√"); //raiz cuadrada
        private JButton raiz3 = new JButton("^√"); //raiz cubica
        private JButton e = new JButton("e"); //constante e
        private JButton pi = new JButton("π"); //pi
        private JButton log = new JButton("lg"); //logaritmo base 10
        private JButton ln = new JButton("Ln"); //logarimot natural
        private JButton deg = new JButton("DEG"); // grados deg
        private JButton rad = new JButton("RAD"); //radianes
        private JButton mult = new JButton("*"); //multiplicacion
        private JButton div = new JButton("/"); //division
        private JButton punto = new JButton("."); //punto
        private JButton C = new JButton("C");//clear memory
        
	public Vista()
	{
		initComponents();
		this.setTitle("Calculadora");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLayout(null); // Se deshabilita el Gestor de Distribución
		this.setBounds(100,100,630,300);
		this.setJMenuBar(barraMenus);
		this.setVisible(true);

	}

	public void initComponents()
	{
		// Diseña el menu

		barraMenus.add(archivo);
		archivo.add(salir);

		// Al desabilitar el LayoutManager, el programador tiene
		// la responsabilidad de situar los componentes

		display.setBounds(10,5,570,40);
		sin.setBounds(10,50,60,30); //1era
		coseno.setBounds(80,50,60,30);
		tangente.setBounds(150,50,60,30);
                
		pi.setBounds(10,90,60,30);//2da
                raiz2.setBounds(80,90,60,30);
		raiz3.setBounds(150,90,60,30);
                
		pot2.setBounds(10,130,60,30);//3era
		pot3.setBounds(80,130,60,30);
                deg.setBounds(150,130,60,30);
                
		log.setBounds(10,170,60,30);//4ta
		ln.setBounds(80,170,60,30);
		rad.setBounds(150,170,60,30);
                
                b7.setBounds(230,50,60,30);
                b8.setBounds(300,50,60,30);
                b9.setBounds(370,50,60,30);
                
                b4.setBounds(230,90,60,30);
                b5.setBounds(300,90,60,30);
                b6.setBounds(370,90,60,30);
                
                b1.setBounds(230,130,60,30);
                b2.setBounds(300,130,60,30);
                b3.setBounds(370,130,60,30);
                
                b0.setBounds(230,170,60,30);
                punto.setBounds(300,170,60,30);
                e.setBounds(370,170,60,30);
                
                cE.setBounds(450,50,60,30);
                C.setBounds(520,50,60,30);
                
                mas.setBounds(450,90,60,30);
                menos.setBounds(520,90,60,30);
                
                mult.setBounds(450,130,60,30);
                div.setBounds(520,130,60,30);
                 
                igual .setBounds(450,170,60,30);
                inverso.setBounds(520,170,60,30);

		display.setBackground(Color.black);
		display.setForeground(Color.orange);
		display.setFont(new Font("Consolas",Font.BOLD, 26));
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setEditable(false);

		this.add(display);

		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b0);
		this.add(mas);
		this.add(menos);
		this.add(igual);
                this.add(cE);
                this.add(sin);
                this.add(coseno);
                this.add(tangente);
                this.add(inverso);
                this.add(pot2);
                this.add(pot3);
                this.add(raiz2);
                this.add(raiz3);
                this.add(e);
                this.add(pi);
                this.add(log);
                this.add(ln);
                this.add(rad);
                this.add(mult);
                this.add(deg);
                this.add(div);
                this.add(punto);
                this.add(C);

                salir.addActionListener(this);
                
                b0.addActionListener(this);

                b1.addActionListener(this);

                b2.addActionListener(this);

                b3.addActionListener(this);

                b4.addActionListener(this); // // <== Método que se invoca cuando se hace click sobre la tecla 4
               
                b5.addActionListener(this);

                b6.addActionListener(this);

                b7.addActionListener(this);

                b8.addActionListener(this);

                b9.addActionListener(this);

                mas.addActionListener(this);

                menos.addActionListener(this);
                
                igual.addActionListener(this);
                
                sin.addActionListener(this);
                
                coseno.addActionListener(this);
                
                raiz2.addActionListener(this);
                
                raiz3.addActionListener(this);
                
                pot2.addActionListener(this);
                
                pot3.addActionListener(this);
                
                e.addActionListener(this);
                
                pi.addActionListener(this);
                
                log.addActionListener(this);
                
                ln.addActionListener(this);
                
                rad.addActionListener(this);
                
                mult.addActionListener(this);
                
                deg.addActionListener(this);
                
                div.addActionListener(this);
                
                punto.addActionListener(this);
                
                C.addActionListener(this);
                
                tangente.addActionListener(this);
                
                inverso.addActionListener(this);

                
                // Al ser una tecla con dos símbolos en la cara le asignamos
                // un Listener diferente
                
                cE.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesarCe(); // <== Método que se invoca cuando se hace click sobre la opción tecla Ce
                    }
                });
                
                
		class MyWindowAdapter extends WindowAdapter
		{
			public void windowClosing(WindowEvent e)
			{
				exit();
			}
		}
		addWindowListener(new MyWindowAdapter());

	}
        
        
        // Gestor de eventos
        
	public void actionPerformed(ActionEvent objetoEvento)
	{

		Object fuenteDelEvento = objetoEvento.getSource();

		// Identifica sobre qué objeto generó el evento

		if(fuenteDelEvento == salir) exit();  // Cierra el Programa

		String teclazo = objetoEvento.getActionCommand();

                // Cada botón tiene un simbolo numérico o operador en la cara
                // Se obtiene con charAt
		char simbolo = teclazo.charAt(0);
                
		if( (simbolo >= '0' && simbolo <= '9') || simbolo == '.') // En caso de número
		{
                    if(nuevo) display.setText(""); // Si es una nueva cifra se borra el diaplay
		    display.setText(display.getText()+simbolo);
		    nuevo = false; // Se pone en falso cuando se pone el primer dígito de una cifra
		}
                else if(simbolo=='+'||simbolo=='-'||simbolo=='*'||simbolo=='/') // En caso de operador
		{
			double numero = Double.parseDouble(display.getText());

			casio.operacion(numero,simbolo);         // Invoca la funcionalidad de la calculadora

			display.setText(""+casio.getMemoria());  // Obtiene el estado de la memoria de la calculadora

			nuevo = true;
		}
                else if(simbolo=='C') 
                {    
                    casio.clearMemory();
                    display.setText("");
                }
                else if(simbolo=='π'){
                    double numero = Math.PI;
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo= true;
                }
                else if(simbolo=='e'){
                    double numero = Math.E;
                    casio.operacion(numero,simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo= true;
                }    
                else if(simbolo=='√'){
                    double numero = 0;
                    Math.sqrt(numero);
                    casio.operacion(numero,simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo= true;
                }
                else if(simbolo=='²'){
                    double numero = 0;
                    Math.pow(numero,(2));
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo=true;
                }
                else if (simbolo=='³'){
                    double numero= 0;
                    Math.pow(numero, (3));
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo=true;
                }
                else if (simbolo=='s'){
                    double numero = 0;
                    Math.sin(numero);
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo = true;
                }
                else if (simbolo=='c'){
                    double numero = 0; 
                    Math.cos(numero);
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo = true;
                }
                else if (simbolo=='t'){
                    double numero = 0;
                    Math.tan(numero);
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo = true;
                }
                else if (simbolo=='l'){
                    double numero = 0 ; 
                    Math.log10(numero);
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo = true;
                }
                else if ( simbolo == 'L'){
                    double numero = 0;
                    Math.log(numero);
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo = true;
                }
                else if (simbolo =='='){
                    double numero= Double.parseDouble(display.getText());
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo = true;
                }
                else if(simbolo=='R'){
                 double numero = 0;
                    Math.toRadians (numero);
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    nuevo = true;
                }
                else if(simbolo=='D'){
                    double numero = 0;
                    Math.toDegrees (numero);
                    casio.operacion(numero, simbolo);
                    display.setText(""+casio.getMemoria());
                    
                    nuevo = true;
                
                }
                
 	}

        // Salir
        public void salir(java.awt.event.ActionEvent evt)
        {
            exit();
        }

        public void exit()
        {
            int respuesta = JOptionPane.showConfirmDialog(rootPane, "Desea salir?","Federación deportiva",JOptionPane.YES_NO_OPTION);
            if(respuesta==JOptionPane.YES_OPTION) System.exit(0);
        }
        
        public void procesarCe()
        {
            // Codigo para procesar CE
            display.setText("");
            nuevo=true;
        }    
}
