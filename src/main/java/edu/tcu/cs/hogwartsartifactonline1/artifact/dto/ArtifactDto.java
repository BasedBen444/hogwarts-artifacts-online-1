package edu.tcu.cs.hogwartsartifactonline1.artifact.dto;

import edu.tcu.cs.hogwartsartifactonline1.wizard.dto.WizardDto;

public record ArtifactDto(String id,
                          String name,
                          String description,
                          String imageUrl,
                          WizardDto owner) {
}