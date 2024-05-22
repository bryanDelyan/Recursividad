import java.io.File;
//Usando recursividad
public class ejercicio8 {

    public static long getFolderSize(File folder) {
        long length = 0;
        File[] files = folder.listFiles();
        
        if (files != null) { // Caso base de la recursividad
            for (File file : files) {
                if (file.isFile()) { 
                    length += file.length();
                } else {
                    length += getFolderSize(file);   // Llamada recursiva
                }
            }
        }
        
        return length;
    }


    public static void main(String[] args) {
        File folder = new File(""); // Cambiar por la ruta de la carpeta que se desea medir
        long size = getFolderSize(folder);
        System.out.println("Folder size: " + size + " bytes");
    }
}
