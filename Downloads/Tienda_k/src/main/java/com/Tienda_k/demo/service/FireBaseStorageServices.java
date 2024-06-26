package com.tienda_k.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface FireBaseStorageServices{

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-97598.appspot.com";

    //Esta es la ruta bÃ¡sica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    //UbicaciÃ³n donde se encuentra el archivo de configuraciÃ³n Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-97598-firebase-adminsdk-y5hgg-dc21d4c60c.json";
}

