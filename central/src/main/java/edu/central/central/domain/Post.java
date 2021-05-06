package edu.central.central.domain;

import java.util.Date;

public class Post {

    private int id;
    private String Descripcion;
    private String urlImg;
    private Date fecha;
    private String Titulo;

    public Post(int id, String Descripcion, String urlImg, Date fecha, String Titulo) {
        this.id = id;
        this.Descripcion = Descripcion;
        this.urlImg = urlImg;
        this.fecha = fecha;
        this.Titulo = Titulo;
    }

    public Post() {

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUrlImg() {
        return this.urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

}
