package com.chuckbuckney.keebGenerator.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "keyboards")
public class Keyboard {

    // fields for keyboard class
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long caseChoice;

    private Long switchChoice;

    private Long pcbChoice;

    private Long keycapChoice;

    // Keyboard constructor


    public Keyboard(Long caseChoice, Long switchChoice, Long pcbChoice, Long keycapChoice) {
        this.caseChoice = caseChoice;
        this.switchChoice = switchChoice;
        this.pcbChoice = pcbChoice;
        this.keycapChoice = keycapChoice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCaseChoice() {
        return caseChoice;
    }

    public void setCaseChoice(Long caseChoice) {
        this.caseChoice = caseChoice;
    }

    public Long getSwitchChoice() {
        return switchChoice;
    }

    public void setSwitchChoice(Long switchChoice) {
        this.switchChoice = switchChoice;
    }

    public Long getPcbChoice() {
        return pcbChoice;
    }

    public void setPcbChoice(Long pcbChoice) {
        this.pcbChoice = pcbChoice;
    }

    public Long getKeycapChoice() {
        return keycapChoice;
    }

    public void setKeycapChoice(Long keycapChoice) {
        this.keycapChoice = keycapChoice;
    }
}
