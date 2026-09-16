import java.io.File;
import java.io.IOException;

public class ManejadorFicheros {

    // 1) Comprueba si la ruta es un directorio existente
    public String eDirectorio(String ruta){
        File f = new File(ruta);
        return (f.exists() && f.isDirectory()) ? "é directorio" : "non é directorio";
    }

    // 2) Comprueba si la ruta es un archivo existente
    public String eFicheiro(String ruta){
        File f = new File(ruta);
        return (f.exists() && f.isFile()) ? "é ficheiro" : "non é ficheiro";
    }

    // 3) Crea un directorio solo si no existe previamente
    public void creaDirectorio(String ruta){
        File f = new File(ruta);
        if (!f.exists()) {
            boolean creado = f.mkdir();
            if (creado) {
                System.out.println("Directorio creado correctamente. ");
            }
        }
    }

    // 4) Crea un fichero en una ruta absoluta solo si el directorio existe y el archivo no
    public void creaFicheiro(String dirName, String fileName) {
        File dir = new File(dirName);
        if (!dir.exists() && dir.isDirectory()) {
            File file = new File(dir, fileName);
            if (!file.exists()) {
                try {
                    if (file.createNewFile()) {
                        System.out.println("Ficheiro creado correctamente");
                    }
                } catch (IOException e) {
                    System.err.println("Error ao crear o ficherio" + e.getMessage());
                }
            }
        }
    }

    // 5) Muestra si el fichero tiene permisos de lectura y escritura
    public void modoAcceso (String dirName, String fileName) {
        File file = new File(dirName, fileName);
        System.out.println(file.canWrite() ? "escritura si" : "escritura non");
        System.out.println(file.canRead() ? "lectura si" : "lectura non");
    }

    // 6) Muestra la longitud del fichero en Bytes
    public void calculaLonxitude(String dirName, String fileName) {
        File file = new File(dirName, fileName);
        System.out.println("Tamaño: " +file.length() + " bytes");
    }

    // 7) Cambia el archivo a solo lectura
    public void mLectura (String dirName, String fileName) {
        File file = new File(dirName, fileName);
        if (file.exists()) {
            file.setWritable(false);
        }
    }

    // 8) Reestablece los permisos de escritura en el archivo
    public void mEscritura (String dirName, String fileName) {
        File file = new File(dirName, fileName);
        if (file.exists()) {
            file.setWritable(true);
        }
    }

    // 9) Elimina el archivo o muestra mensaje de error si no existe
    public void borraFicheiro(String dirName, String fileName) {
        File file = new File(dirName, fileName);
        if (file.exists() && file.isFile()) {
            if (!file.delete()) {
                System.out.println("Ficheiro borrado");
            } else {
                System.out.println("Ficheiro inexistente");
            }
        }
    }

    // 10) Elimina la carpeta solo si existe y no tiene descendencia
    public void borraDirectorio(String dirName) {
        File dir = new File(dirName);
        if (dir.exists() && dir.isDirectory()) {
            if (!dir.delete()) {
                System.out.println("Ruta inexistente ou con descendencia");
            } else {
                System.out.println("Directorio borrado");
            }
        } else {
            System.out.println("Ruta inexistente ou con descendencia");
        }
    }

    // 11)
    public void mContido(String dirName) {

    }
}