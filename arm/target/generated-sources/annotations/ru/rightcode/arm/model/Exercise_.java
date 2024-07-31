package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Exercise.class)
public abstract class Exercise_ {

	public static volatile SingularAttribute<Exercise, String> videoUrl;
	public static volatile SingularAttribute<Exercise, ExerciseType> exerciseType;
	public static volatile SingularAttribute<Exercise, String> name;
	public static volatile SingularAttribute<Exercise, String> description;
	public static volatile SingularAttribute<Exercise, Long> id;

	public static final String VIDEO_URL = "videoUrl";
	public static final String EXERCISE_TYPE = "exerciseType";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

