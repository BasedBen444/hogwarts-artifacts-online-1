package edu.tcu.cs.hogwartsartifactonline1.artifact.converter;

import edu.tcu.cs.hogwartsartifactonline1.artifact.Artifact;
import edu.tcu.cs.hogwartsartifactonline1.artifact.dto.ArtifactDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ArtifactDtoToArtifact implements Converter<ArtifactDto, Artifact> {

    @Override
    public Artifact convert(ArtifactDto source) {
        Artifact artifact = new Artifact();
        artifact.setId(source.id());
        artifact.setName(source.name());
        artifact.setDescription(source.description());
        artifact.setImageUrl(source.imageUrl());
        return artifact;
    }

}