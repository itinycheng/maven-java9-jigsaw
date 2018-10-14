/**
 * Created by dobber on 31-12-16.
 */
module calculator.gui {
    exports nl.frisodobber.java9.jigsaw.calculator.gui to javafx.graphics;

    requires calculator.algorithm.add;
    requires calculator.algorithm.substract;
    requires calculator.algorithm.api;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    uses nl.frisodobber.java9.jigsaw.calculator.algorithm.api.Algorithm;
}
