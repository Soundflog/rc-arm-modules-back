package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ModuleForm.class)
public abstract class ModuleForm_ {

	public static volatile SingularAttribute<ModuleForm, BigDecimal> score;
	public static volatile SingularAttribute<ModuleForm, Form> form;
	public static volatile ListAttribute<ModuleForm, ModuleFormAnswer> moduleFormAnswers;
	public static volatile SingularAttribute<ModuleForm, Module> module;
	public static volatile SingularAttribute<ModuleForm, Long> id;
	public static volatile SingularAttribute<ModuleForm, Instant> finishedAt;

	public static final String SCORE = "score";
	public static final String FORM = "form";
	public static final String MODULE_FORM_ANSWERS = "moduleFormAnswers";
	public static final String MODULE = "module";
	public static final String ID = "id";
	public static final String FINISHED_AT = "finishedAt";

}

