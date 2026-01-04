package com.omsai.design.patterns.behavioral.state;

public class Demo {

    public static void main(String[] args) {

        var canvas = new Canvas(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        var canvas2 = new Canvas(new BrushTool());
        canvas2.mouseDown();
        canvas2.mouseUp();
    }
}
