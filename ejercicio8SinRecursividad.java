import java.io.File;
import java.util.Stack;

public class ejercicio8SinRecursividad{

    public static long getFolderSize(File folder) {
        long length = 0;
        Stack<File> stack = new Stack<>();
        stack.push(folder);
        
        while (!stack.isEmpty()) {
            File current = stack.pop();
            File[] files = current.listFiles();
            
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        length += file.length();
                    } else {
                        stack.push(file);
                    }
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
