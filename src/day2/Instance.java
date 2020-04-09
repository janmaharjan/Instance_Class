/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Maharjan
 */
public class Instance {
    public static Instance cust=null;
    private Instance()
    {
        System.out.println("jananan");
    }
    public static Instance getInstance()
    {
        if(cust==null)
        {
            cust=new Instance();
            return cust;
        }
        else{
            return cust;
        }
    }
    
}
