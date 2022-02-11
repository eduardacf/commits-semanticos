package br.com.eduardacf.service;

import org.springframework.stereotype.Service;


@Service
public class CommitsService {

    public String mountCommandCust(String commitsType,
                               String linkTask,
                               String comment) {
        return "git commit -m" + " \"" + verifyEmoji(commitsType) + " " + commitsType + ": " + comment + " - " + "see: " + linkTask + "\"";
    }

    public String mountCommets(String commitsType,
                               String linkTask,
                               String comment) {
        return " \"" + verifyEmoji(commitsType) + " " + commitsType + ": " + comment + " - " + "see: " + linkTask + "\"";
    }

    public String verifyEmoji(String commitsType) {
        String emojis;
        switch (commitsType) {
            case "fix":
                emojis = "\uD83D\uDC1B";
                break;
            case "feat":
                emojis = "✨";
                break;
            case "docs":
                emojis = "\uD83D\uDCDD";
                break;
            case "style":
                emojis = "\uD83C\uDFA8";
                break;
            case "refactor":
                emojis = "\uD83D\uDD28";
                break;
            case "build":
                emojis = "\uD83D\uDEA7";
                break;
            case "test":
                emojis = "✅";
                break;
            case "env":
                emojis = "\uD83D\uDCA5";
                break;
            default:
                emojis = "➕";
                break;
        }
        return emojis;

    }
}
