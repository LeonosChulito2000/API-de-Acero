/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CL.acero.model; // PAQUETE QUE CONTIENE EL MODELO

/**
 * CLASE QUE REPRESENTA UN CÓDIGO DE RESPUESTA PARA LAS PETICIONES A LA API.
 *
 * @author Leo
 * @author Caye
 */
public class ResponseCode {

    private int code;        // CÓDIGO DE RESPUESTA
    private String message;   // MENSAJE DE RESPUESTA

    // CONSTRUCTOR VACÍO
    public ResponseCode() {
    }

    // CONSTRUCTOR CON TODOS LOS PARÁMETROS
    public ResponseCode(int code, String message) {
        this.code = code;       // ASIGNA EL CÓDIGO DE RESPUESTA
        this.message = message; // ASIGNA EL MENSAJE DE RESPUESTA
    }

    // GETTERS Y SETTERS
    public int getCode() {
        return code; // RETORNA EL CÓDIGO DE RESPUESTA
    }

    public void setCode(int code) {
        this.code = code; // ESTABLECE EL CÓDIGO DE RESPUESTA
    }

    public String getMessage() {
        return message; // RETORNA EL MENSAJE DE RESPUESTA
    }

    public void setMessage(String message) {
        this.message = message; // ESTABLECE EL MENSAJE DE RESPUESTA
    }
}
