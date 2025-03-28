package edu.tcu.cs.hogwartsartifactonline1.artifact;

public class ArtifactNotFoundException extends RuntimeException {
    public ArtifactNotFoundException(String id) {
        super("Could not find artifact with Id " + id + " :(");
    }
}
