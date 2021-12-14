package vectores;
import principal.registro_usuario;
import java.util.Vector;
import java.io.FileWriter;
import java.io.IOException;
public class metodos_usuario {
	
	Vector vprin=new Vector();
	
	// Reescribir los datos en vetores
	public void guardado(registro_usuario uncliente) {
		vprin.addElement(uncliente);
	}
	//TXT
	public void vprin(registro_usuario principal) throws IOException {
		FileWrite  ficher= new FileWrite("C:/Users/luisc/eclipse-workspace/Ruta_Entraga/src/usuario.txt")
	}ficher.close();

}

/*try {
			FileWriter fw= new FileWriter("C:/Users/luisc/eclipse-workspace/Ruta_Entraga/cliente.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.print(principal.getNombre());
			pw.print("|"+principal.getDocumento());
			pw.print("|"+principal.getTelefono());
			pw.print("|"+principal.getDireccion());
			pw.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}*/
