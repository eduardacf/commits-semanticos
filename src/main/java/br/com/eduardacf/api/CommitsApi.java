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
                                             @RequestParam @Valid String linkTask,
                                             @RequestParam @Valid String comment) {

        return ResponseEntity.ok(commitsService.mountCommand(commitsType.getCode(), linkTask, comment));
    }

    @GetMapping("/comments")
    public ResponseEntity<String> getCommitsComment(@RequestParam @Valid CommitsEnum commitsType,
                                             @RequestParam @Valid String linkTask,
                                             @RequestParam @Valid String comment) {

        return ResponseEntity.ok(commitsService.mountCommets(commitsType.getCode(), linkTask, comment));
    }
}
