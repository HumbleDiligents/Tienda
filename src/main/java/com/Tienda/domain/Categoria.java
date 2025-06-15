
package com.Tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name= "categoria")

public class Categoria implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private static final long serialVersionUID= 1l;
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }

    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}