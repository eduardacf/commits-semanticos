package br.com.eduardacf.api;


import br.com.eduardacf.service.CommitsService;
import br.com.eduardacf.type.CommitsEnum;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Locale;


@RestController
@RequestMapping("/commits")
public class CommitsApi {

    private final Logger logger = LoggerFactory.getLogger(CommitsApi.class);

    private final ObjectMapper objectMapper;
    private CommitsService commitsService;

    public CommitsApi(ObjectMapper objectMapper, CommitsService commitsService) {
        this.objectMapper = objectMapper;
        this.commitsService = commitsService;
    }

    @GetMapping
    public ResponseEntity<String> getCommits(@RequestParam @Valid CommitsEnum tipoDeCommit,
                                             @RequestParam @Valid String linkTask,
                                             @RequestParam @Valid String comentario) {

        return ResponseEntity.ok(commitsService.setCommit(tipoDeCommit.name().toLowerCase(Locale.ROOT), linkTask, comentario));
//        logger.info("Iniciando chamada para listagem da pauta com id {}", idPauta);
//        return pautaService.buscarPautaPorId(idPauta)
//                .map(PautaResponseMapper::mapResponsePauta)
//                .doOnSuccess(pautaResponse -> logger.info("Finalizando chamada de listagem da pauta {}", pautaResponse));

    }
}
