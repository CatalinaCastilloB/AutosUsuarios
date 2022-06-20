package com.generationg1.repositories;

import com.generationg1.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//con jpa repo.. podemos usar metodos para conectarse con bases de datos
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { //JpaRepository<objeto, tipo de dato de FOREING KEY >
    /* las INTERFASE solo definen los metodos*/
    //podremos usar metodos de repository

    //Query y usar metodos
}
