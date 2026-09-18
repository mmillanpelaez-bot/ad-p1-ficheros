import java.io.File;

public class Main {
    public static void main(String[] args) {
        ManejadorFicheros mf = new ManejadorFicheros();
        String basePath = "/home/dam26/IdeaProjects/ad-p1-ficheros/arquivosdir"; // ruta base

//        // 1) Crear 'arquivosdir' y comprobar
//        mf.creaDirectorio(basePath);
//        System.out.println("Comprobar directorio: " + mf.eDirectorio(basePath));
//
//        // 2) Crear Products1.txt y comprobar
//        mf.creaFicheiro(basePath, "Products1.txt");
//        System.out.println("Comprobar fichero: " + mf.eFicheiro(basePath + "/Products1.txt"));
//
//        // 3) Crear 'subdir' y Products2.txt dentro
//        String subDirPath = basePath + "/subdir";
//        mf.creaDirectorio(subDirPath);
//        mf.creaFicheiro(subDirPath, "Products2.txt");
//
//        // 4) Mostrar contenido de primer nivel
//        System.out.println("\n--- Contenido de primer nivel ---");
//        mf.mContido(basePath);
//
//        // 5) Info de Products1.txt (permisos y tamaño)
//        System.out.println("\n--- Info Products1.txt ---");
//        mf.modoAcceso(basePath, "Products1.txt");
//        mf.calculaLonxitude(basePath, "Products1.txt");
//
//        // 6) Forzar solo lectura
//        mf.mLectura(basePath, "Products1.txt");
//
//        // 7) Forzar permisos de escritura nuevamente
//        mf.mEscritura(basePath, "Products1.txt");
//
//        // 8) Borrar Products1.txt
//        mf.borraFicheiro(basePath, "Products1.txt");
//
//        // 9) Borrar resto (primero el archivo interno, luego las carpetas)
//        mf.borraFicheiro(subDirPath, "Products2.txt");
//        mf.borraDirectorio(subDirPath);
//        mf.borraDirectorio(basePath);

        // 10) Opcional: Probar método recursivo en una ruta existente
         mf.recur(new File("/home/dam26/IdeaProjects/PSP_Tarea_01"));
    }
}