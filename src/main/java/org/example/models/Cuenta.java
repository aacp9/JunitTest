package org.example.models;

import org.example.exception.DineroInsuficienteException;

public class Cuenta {
    private String persona;
    private Integer saldo;
    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cuenta(String persona, Integer saldo) {
        this.persona = persona;
        this.saldo = saldo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    // metodos
    public void deposit(int deposit) {
        if(deposit>0) {
            this.saldo = this.saldo + deposit;
        }
    }
    public void retiro(int monto){
        if (monto>0 && (monto < this.saldo)){
            this.saldo = this.saldo - monto;
        }else if (monto > this.saldo){
            throw new DineroInsuficienteException("NO HAY MONEY!!");
        }
    }
}
