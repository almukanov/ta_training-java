package com.epam.training.student_ruslan_almukanov.clean_code.java.src.main.java.plane;
import com.epam.training.student_ruslan_almukanov.clean_code.java.src.main.java.model.ClassificationLevel;


public class ExperimentalPlane extends Plane {
    private final ClassificationLevel classificationLevel;
    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.classificationLevel = classificationLevel;
    }
    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}
