package br.com.eduardacf.service;


import br.com.eduardacf.type.CommitsEnum;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class CommitsService {


    public String setCommit(String tipoDeCommit,
                            String linkTask,
                            String comentario) {
        if(tipoDeCommit.equals(CommitsEnum.FEAT.name().toLowerCase(Locale.ROOT))){
            return "git commit -m" + " \"" + "✨"+  tipoDeCommit +": " + comentario +" - \n "+" see: " + linkTask + "\"";
        }

        return "git commit -m" + " \"" + tipoDeCommit + ": " + comentario +" - \n "+" see: " + linkTask + "\"";


    }


}
