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
			Line2D l=new Line2D.Double();
			NodoGrafo ng1=listaNodos[in1];
			NodoGrafo ng2=listaNodos[in2];
			double x1=ng1.pocX;
			double y1=ng1.pocY;
			double x2=ng2.pocX;
			double y2=ng2.pocY;		
			double m=(y2-y1);
			m/=(x2-x1);
			double b1=(y1-(m*x1));
			if(x1<x2){
				x1+=7;
				x2-=7;
			}
			else{
				x1-=7;
				x2+=7;
			}
			y1=(m*x1)+b1;
			y2=(m*x2)+b1;
			l.setLine(x1,y1,x2,y2);
			listaAdyacencia.add(l);
			Nodo n=listaNodos[in1].n;
			if(listaNodos[in1].n==null){
				listaNodos[in1].n=new Nodo(in2);
			}
			else{
				Nodo ay=n;
				while(n!=null){
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
		regiones = new ArrayList<Region>();
		for(int i=0;i<listaNodos.length; i++){
			if(listaNodos[i]!=null){
				buscarRegiones(i, i,i+"");
			}
		}
		Polygon p;
		Region r;
		NodoGrafo ng;
		for(int i=0; i<regiones.size();i++){
			r=regiones.get(i);
			p=new Polygon();
			for(int j=0;j<r.nombre.length();j++){
				int ay=Integer.parseInt(r.nombre.toCharArray()[j]+"");
				ng=listaNodos[ay];
				p.addPoint(ng.pocX,ng.pocY);
			}
			regiones.get(i).region=p;
		}
		
		return 0;// todo salio bien
	}
	
	private void buscarRegiones(int in1, int in2, String nom){
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
						Region r=new Region();
						r.nombre=nom+n1.index+""+in1;
						regiones.add(r);
						return;
					}
					n1=n1.sig;
				}
				n2=n2.sig;
			}
		}
		n2=ng2.n;
		while(n2!=null){
			buscarRegiones(in1, n2.index,nom);
			n2=n2.sig;
		}
	}
	
}
