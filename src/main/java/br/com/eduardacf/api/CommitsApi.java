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

    private CommitsService commitsService;

    public CommitsApi(CommitsService commitsService) {
        this.commitsService = commitsService;
    }

    @GetMapping
    public ResponseEntity<String> getCommand(@RequestParam @Valid CommitsEnum commitsType,
                                             @RequestParam @Valid String task,
                                             @RequestParam @Valid String comment) {

        return ResponseEntity.ok(commitsService.mountCommandCustom(commitsType.getCode(), task, comment));
    }

    @GetMapping("/comments")
    public ResponseEntity<String> getCommitsComment(@RequestParam @Valid CommitsEnum commitsType,
                                             @RequestParam @Valid String task,
                                             @RequestParam @Valid String comment) {

        return ResponseEntity.ok(commitsService.mountCommitsCustom(commitsType.getCode(), task, comment));
    }
}
