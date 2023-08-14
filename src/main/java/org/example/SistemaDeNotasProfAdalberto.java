package org.example;

public class NotaEscola {

    public static int arredondaNota(int nota) {
        if (nota < 38) {
            return nota;
        }

        int proximoMultiploDe5 = ((nota + 4) / 5) * 5;

        if (proximoMultiploDe5 - nota < 3) {
            return proximoMultiploDe5;
        } else {
            return nota;
        }
    }


}

