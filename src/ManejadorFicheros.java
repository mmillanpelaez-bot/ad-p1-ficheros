import java.io.File;
import java.io.IOException;

public class ManejadorFicheros {

    // 1) Detecta si es un directorio
    public String eDirectorio(String ruta) {
        File f = new File(ruta);
        return (f.exists() && f.isDirectory()) ? "é directorio" : "non é directorio";
    }

    // 2) Comprueba si es un fichero
    public String eFicheiro(String ruta) {
        File f = new File(ruta);
        return (f.exists() && f.isFile()) ? "é ficheiro" : "non é ficheiro";
    }

    // 3) Crea un directorio solo si no existe previamente
    public void creaDirectorio(String ruta) {
        File f = new File(ruta);
        if (!f.exists()) {
            f.mkdir();
        }
    }

    // 4) Crea un fichero si la ruta existe y el archivo no
    public void creaFicheiro(String dirName, String fileName) {
        File dir = new File(dirName);
        if (dir.exists() && dir.isDirectory()) {
            File file = new File(dir, fileName);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.err.println("Error ao crear o ficheiro: " + e.getMessage());
                }
            }
        }
    }

    // 5) Permisos de lectura y escritura
    public void modoAcceso(String dirName, String fileName) {
        File file = new File(dirName, fileName);
        System.out.println(file.canWrite() ? "escritura si" : "escritura non");
        System.out.println(file.canRead() ? "lectura si" : "lectura non");
    }

    // 6) Longitud del archivo en bytes
    public void calculaLonxitude(String dirName, String fileName) {
        File file = new File(dirName, fileName);
        System.out.println("Tamaño: " + file.length() + " bytes");
    }

    // 7) Solo lectura
    public void mLectura(String dirName, String fileName) {
        File file = new File(dirName, fileName);
        if (file.exists()) {
            file.setReadOnly();
        }
    }

    // 8) Restablecer escritura
    public void mEscritura(String dirName, String fileName) {
        File file = new File(dirName, fileName);
        if (file.exists()) {
            file.setWritable(true);
        }
    }

    // 9) Borrar fichero
    public void borraFicheiro(String dirName, String fileName) {
        File file = new File(dirName, fileName);
        if (file.exists() && file.isFile()) {
            if (!file.delete()) {
                System.out.println("No se pudo borrar el archivo");
            }
        } else {
            System.out.println("ficheiro inexistente");
        }
    }

    // 10) Borrar directorio
    public void borraDirectorio(String dirName) {
        File dir = new File(dirName);
        if (dir.exists() && dir.isDirectory()) {
            if (!dir.delete()) {
                System.out.println("ruta inexistente ou con descencencia");
            }
        } else {
            System.out.println("ruta inexistente ou con descencencia");
        }
    }

    // 11) Listar primer nivel
    public void mContido(String dirName) {
        File f = new File(dirName);
        if (f.exists() && f.isDirectory()) {
            String[] lista = f.list();
            if (lista != null) {
                for (String name : lista) {
                    System.out.println(name);
                }
            }
        }
    }

    // 12) Opcional: Listar recursivo
    public void recur(File f) {
        if (f.exists() && f.isDirectory()) {
            File[] elementos = f.listFiles();
            if (elementos != null) {
                for (File elem : elementos) {
                    System.out.println(elem.getName());
                    if (elem.isDirectory()) {
                        recur(elem);
                    }
                }
            }
        }
    }
}