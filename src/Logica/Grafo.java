package Logica;

import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class Grafo {
	public final int CAN=10;
	public int nodos;
	public NodoGrafo[] listaNodos;
	public ArrayList<Line2D> listaAdyacencia;
	public ArrayList<Region> regiones;
	public ArrayList<String> nombres;
	
	public Grafo() {
		nodos=0;
		listaNodos=new NodoGrafo[CAN];
		for(int i=0 ; i<CAN ; i++){
			listaNodos[i]=null;
		}
		listaAdyacencia=new ArrayList<Line2D>();
		regiones=new ArrayList<Region>();
	}
	
	public void AgregarNodo(int x, int y){
		if(nodos<CAN){
			listaNodos[nodos]=new NodoGrafo(nodos, x, y);
			nodos++;
		}
		else{
			System.out.println("No se puede agregar mas nodos");
		}
	}
	
	public void AgregarArista(int in1, int in2){
		if(listaNodos[in1]!= null && listaNodos[in2]!=null){
			NodoGrafo ng1=listaNodos[in1];
			NodoGrafo ng2=listaNodos[in2];
			double x1=ng1.pocX;
			double y1=ng1.pocY;
			double x2=ng2.pocX;
			double y2=ng2.pocY;
			agregarLinea(x1,y1,x2,y2);
			Nodo n=listaNodos[in1].n;
			if(listaNodos[in1].n==null){
				listaNodos[in1].n=new Nodo(in2);
			}
			else{
				Nodo ay=n;
				while(n!=null){
					if(n.index==in2){
						return;
					}
					ay=n;
					n=n.sig;
				}
				ay.sig=new Nodo(in2);
			}
		}
		else{
			System.out.println("No se puede agregar adyacencia");
		}
	}
	
	public int generarRegiones(){
		for(int i=0; i<listaAdyacencia.size(); i++){
			for(int j=i+1; j<listaAdyacencia.size();j++){
				if(listaAdyacencia.get(i).intersectsLine(listaAdyacencia.get(j))){
					System.out.println("Hay aristas que se intersectan");
					return 1;//intersenccion de aristas
				}
			}
		}
		nombres = new ArrayList<String>();
		regiones = new ArrayList<Region>();
		for(int i=0;i<listaNodos.length; i++){
			if(listaNodos[i]!=null){
				buscarRegiones(i, i,i+"");
			}
		}
		Polygon p;
		Region r;
		String s;
		NodoGrafo ng;
		for(int i=0; i<nombres.size();i++){
			s=nombres.get(i);
			p=new Polygon();
			for(int j=0;j<s.length();j++){
				int ay=Integer.parseInt(s.toCharArray()[j]+"");
				ng=listaNodos[ay];
				p.addPoint(ng.pocX,ng.pocY);
			}
			r=new Region();
			r.nombre=s;
			r.region=p;
			regiones.add(r);
		}
		
		return 0;// todo salio bien
	}
	
	private String buscarRegiones(int in1, int in2, String nom){
		NodoGrafo ng1=listaNodos[in1];
		NodoGrafo ng2=listaNodos[in2];
		Nodo n1=ng1.n;
		Nodo n2=ng2.n;
			if(in1<in2){
				nom+=in2;
				while(n2!=null){
					n1=ng1.n;
					while(n1!=null){
						if(n2.index==n1.index){
							return nom+""+n1.index+""+in1;
						}
						n1=n1.sig;
					}
					n2=n2.sig;
				}
			}
		n2=ng2.n;
		while(n2!=null){
			String s=buscarRegiones(in1, n2.index,nom);
			if(s.length()>3){
				nombres.add(s);
			}
			n2=n2.sig;
		}
		return "";
	}
	
	private void agregarLinea(double x1, double y1, double x2, double y2){
		double a,b,c,d;
		double ayx1=0,ayx2=0;
		double sx1,sx2,sy1,sy2;
		double m=(y2-y1);
		m/=(x2-x1);
		double b1=(y1-(m*x1));
		// primer punto
		a=1+(m*m);
		b=2*((m*b1)-x1-(m*y1));
		c=(x1*x1)+(b1*b1)-(2*b1*y1)-400+(y1*y1);
		d=(b*b)-(4*a*c);
		ayx1=((-1)*b)+Math.sqrt(d);
		ayx1=ayx1/(2*a);
		ayx2=((-1)*b)-Math.sqrt(d);
		ayx2=ayx2/(2*a);
		if(x1>x2){
			if(ayx1>ayx2){
				sx1=ayx2;
			}
			else{
				sx1=ayx1;
			}
		}
		else{
			if(ayx1>ayx2){
				sx1=ayx1;
			}
			else{
				sx1=ayx2;
			}
		}
		sy1=(m*sx1)+b1;

		// segundo punto
		a=1+(m*m);
		b=2*((m*b1)-x2-(m*y2));
		c=(x2*x2)+(b1*b1)-(2*b1*y2)-400+(y2*y2);
		d=(b*b)-(4*a*c);
		ayx1=((-1)*b)+Math.sqrt(d);
		ayx1/=(2*a);
		ayx2=((-1)*b)-Math.sqrt(d);
		ayx2/=(2*a);
		if(x1>x2){
			if(ayx1>ayx2){
				sx2=ayx1;
			}
			else{
				sx2=ayx2;
			}
		}
		else{
			if(ayx1>ayx2){
				sx2=ayx2;
			}
			else{
				sx2=ayx1;
			}
		}
		sy2=(m*sx2)+b1;
		// crear linea
		Line2D l=new Line2D.Double();
		l.setLine(sx1, sy1, sx2, sy2);
		listaAdyacencia.add(l);
	}
	
}
