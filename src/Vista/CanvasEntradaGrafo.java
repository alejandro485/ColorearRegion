package Vista;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.geom.Line2D;
import java.util.Random;

import Logica.Grafo;
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
		NodoGrafo ng;
		Line2D l;
		if(grafo.regiones.size()>0){
			System.out.println();
			System.out.println("Regiones");
			for(int i=0; i<grafo.regiones.size();i++){
				graficas.setColor(generarColor());
				graficas.fillPolygon(grafo.regiones.get(i).region);
				System.out.println("n"+(i+1)+": "+grafo.regiones.get(i).nombre);
			}
		}
		for(int i=0;i<grafo.nodos;i++){
			ng=grafo.listaNodos[i];
			graficas.setColor(Color.white);
			graficas.fillOval(ng.pocX-20, ng.pocY-20, 40, 40);
			graficas.setColor(Color.black);
			graficas.drawOval(ng.pocX-20, ng.pocY-20, 40, 40);
			graficas.drawString(ng.ver+"", ng.pocX-2, ng.pocY+3);
		}
		for(int i=0;i<grafo.listaAdyacencia.size(); i++){
			l=grafo.listaAdyacencia.get(i);
			graficas.setColor(Color.black);
			graficas.drawLine((int)l.getX1(),(int)l.getY1(),(int)l.getX2(),(int)l.getY2());
			graficas.setColor(Color.red);
			graficas.fillOval((int)l.getX1()-3,(int)l.getY1()-3,6, 6);
			graficas.fillOval((int)l.getX2()-3,(int)l.getY2()-3,6, 6);
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
