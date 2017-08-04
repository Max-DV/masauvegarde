package fichier.sopra.pox3.parcoursRep;

import java.io.File;

public class parcoursApp {


		public static void main(String[] args) {

			new parcoursApp().parcoursRep("C:\\Users\\AELION\\Desktop\\java");
	}


	public void parcoursRep (String path){
		File file = new File(path);
		System.out.println(path);
		
				file.getAbsolutePath(); 
				
			if (file.isDirectory()){
				File[] files = file.listFiles();
				for(File file2: files){
					parcoursRep(file2.getAbsolutePath());}
	
				}
				

}}
