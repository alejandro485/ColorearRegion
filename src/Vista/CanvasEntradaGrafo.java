package Vista;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import Logica.Grafo;
import Logica.Nodo;
import Logica.NodoGrafo;

public class CanvasEntradaGrafo extends Canvas {
	
	private static final long serialVersionUID = 1L;
	private Image imagen;
	private Graphics graficas;
	private Grafo grafo;
	
	
	public CanvasEntradaGrafo() {
		// TODO Auto-generated constructor stub
		grafo=null;
	}
	
	public void setLista(Grafo g){
		grafo=g;;
		repaint();
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	@Override
	public void paint(Graphics g) {
		imagen = createImage(this.getWidth(), this.getHeight());
		graficas= imagen.getGraphics();
		graficas.setColor(Color.white);
		graficas.fillRect(0, 0, this.getWidth(), this.getHeight());
		if(grafo!=null){
			pintarGrafo();
		}
		g.drawImage(imagen, 0, 0, this);
	}
	
	private void pintarGrafo(){
		NodoGrafo ng,ay;
		Nodo n;
		graficas.setColor(Color.black);
		for(int i=0;i<grafo.nodos;i++){
			ng=grafo.listaNodos[i];
			n=ng.n;
			while(n!=null){
				ay=grafo.listaNodos[n.index];
				graficas.drawLine(ng.pocX, ng.pocY, ay.pocX, ay.pocY);
				n=n.sig;
			}
		}
		if(grafo.regiones.size()>0){
			for(int i=0; i<grafo.regiones.size();i++){
				graficas.setColor(generarColor());
				graficas.fillPolygon(grafo.regiones.get(i).region);
				System.out.println("n: "+(i+1)+" - "+grafo.regiones.get(i).nombre);
			}
		}
		for(int i=0;i<grafo.nodos;i++){
			ng=grafo.listaNodos[i];
			graficas.setColor(Color.white);
			graficas.fillOval(ng.pocX-10, ng.pocY-10, 20, 20);
			graficas.setColor(Color.black);
			graficas.drawOval(ng.pocX-10, ng.pocY-10, 20, 20);
			graficas.drawString(ng.ver+"", ng.pocX-2, ng.pocY+3);
		}
	}
	
	private Color generarColor(){
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		Color randomColor = new Color(r, g, b);
		return randomColor;
	}
}
