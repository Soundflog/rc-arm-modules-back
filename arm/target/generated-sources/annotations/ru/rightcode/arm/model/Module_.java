package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Module.class)
public abstract class Module_ {

	public static volatile ListAttribute<Module, ModuleExercise> exercises;
	public static volatile SingularAttribute<Module, String> name;
	public static volatile SingularAttribute<Module, Long> id;
	public static volatile SingularAttribute<Module, RehabProgram> rehabProgram;
	public static volatile ListAttribute<Module, ModuleForm> forms;
	public static volatile SingularAttribute<Module, Instant> finishedAt;

	public static final String EXERCISES = "exercises";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String REHAB_PROGRAM = "rehabProgram";
	public static final String FORMS = "forms";
	public static final String FINISHED_AT = "finishedAt";

}

