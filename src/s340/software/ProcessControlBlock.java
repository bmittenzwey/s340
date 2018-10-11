/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s340.software;

/**
 *
 * @author DannySuarez
 */

public class ProcessControlBlock {
    private int acc;
    private int x;
    private int pc;
    private ProcessState status;
    private int base;
    private int limit;
    
    public ProcessControlBlock(int base) {
        //initial values for each program
        this.acc = 0;
        this.x = 0;
        this.pc = 0; //programmer identifies the starting point for each program
        this.status = ProcessState.READY;
        this.base = base;
        this.limit = 0;
    }
    
    
    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public ProcessState getStatus() {
        return status;
    }

    public void setStatus(ProcessState status) {
        this.status = status;
    }
    
    
}


