package br.com.eduardacf.api;


import br.com.eduardacf.service.CommitsService;
import br.com.eduardacf.type.CommitsEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/commits")
public class CommitsApi {

    private final Logger logger = LoggerFactory.getLogger(CommitsApi.class);

    private CommitsService commitsService;

    public CommitsApi(CommitsService commitsService) {
        this.commitsService = commitsService;
    }
    @GetMapping("/customizable")
    public ResponseEntity<String> getCommandCustomizable(@RequestParam @Valid CommitsEnum commitsType,
                                             @RequestParam @Valid String task,
                                             @RequestParam @Valid String comment) {

        return ResponseEntity.ok(commitsService.mountCommandCustomizable(commitsType.getCode(), task, comment));
    }

    @GetMapping("/comments/customizable")
    public ResponseEntity<String> getCommitsCommentCustomizable(@RequestParam @Valid CommitsEnum commitsType,
                                                    @RequestParam @Valid String task,
                                                    @RequestParam @Valid String comment) {

        return ResponseEntity.ok(commitsService.mountCommitsCustomizable(commitsType.getCode(), task, comment));
    }

    @GetMapping
    public ResponseEntity<String> getCommand(@RequestParam @Valid CommitsEnum commitsType,
                                             @RequestParam @Valid String task,
                                             @RequestParam @Valid String comment) {

        return ResponseEntity.ok(commitsService.mountCommand(commitsType.getCode(), task, comment));
    }

    @GetMapping("/comments")
    public ResponseEntity<String> getCommitsComment(@RequestParam @Valid CommitsEnum commitsType,
                                                    @RequestParam @Valid String task,
                                                    @RequestParam @Valid String comment) {

        return ResponseEntity.ok(commitsService.mountCommits(commitsType.getCode(), task, comment));
    }
}
