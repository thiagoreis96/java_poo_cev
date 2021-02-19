package cev_final_project;

public class ProjetoYoutube {

	public static void main(String[] args) {
		
		Video[] v = new Video[3];
		v[0] = new Video("Aula de POO");
		v[1] = new Video("Aula de PHP");
		v[2] = new Video("Aula de Java");
		
		Gafanhoto[] g = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

		Visualizacao[] vis = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[0].avaliar(87.0);
		System.out.println(vis[1].toString());
	}
}
