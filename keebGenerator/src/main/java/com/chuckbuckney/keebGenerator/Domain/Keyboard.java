package com.chuckbuckney.keebGenerator.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "keyboards")
public class Keyboard {

    // fields for keyboard class
    private Case caseChoice;
    private Switch switchChoice;

    // Keyboard constructor
    public Keyboard(Case caseChoice, Switch switchChoice) {
        this.caseChoice = caseChoice;
        this.switchChoice = switchChoice;
    }

    public Case getCaseChoice() {
        return caseChoice;
    }

    public void setCaseChoice(Case caseChoice) {
        this.caseChoice = caseChoice;
    }

    public Switch getSwitchChoice() {
        return switchChoice;
    }

    public void setSwitchChoice(Switch switchChoice) {
        this.switchChoice = switchChoice;
    }
}
