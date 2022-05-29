/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author josia
 */
public class Utilidades {
    
  //precisa gravar

    public static int objectToInt(Object Obj){
        int NumInt = Integer.parseInt(objectToString(Obj));
        return NumInt;
    }
    
    public static double objectToDouble(Object Obj) {
        String Str = Obj.toString();
        double NumDouble = Double.valueOf(Str).doubleValue();
        return NumDouble;
    }
    
    public static boolean objectToBoolean(Object Obj){
        String CadBool = objectToString(Obj);
        Boolean bool = new Boolean(CadBool);
        return bool;
    }
    public static String objectToString(Object Obj){
        String Str = "";
        if(Obj != null){
            Str = Obj.toString();
        }
        return Str;
    }

  
}
