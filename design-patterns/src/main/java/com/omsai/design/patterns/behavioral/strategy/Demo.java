package com.omsai.design.patterns.behavioral.strategy;

public class Demo {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("image.jpeg", new JpegCompressor(), new HighContrastFilter());
        imageStorage.store("image2.jpeg", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
