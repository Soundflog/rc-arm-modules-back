package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ModuleExercise.class)
public abstract class ModuleExercise_ {

	public static volatile SingularAttribute<ModuleExercise, Module> module;
	public static volatile SingularAttribute<ModuleExercise, Exercise> exercise;
	public static volatile SingularAttribute<ModuleExercise, Block> block;
	public static volatile SingularAttribute<ModuleExercise, Long> id;
	public static volatile SingularAttribute<ModuleExercise, Instant> finishedAt;

	public static final String MODULE = "module";
	public static final String EXERCISE = "exercise";
	public static final String BLOCK = "block";
	public static final String ID = "id";
	public static final String FINISHED_AT = "finishedAt";

}

