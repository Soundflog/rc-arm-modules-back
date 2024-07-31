package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ModuleFormAnswer.class)
public abstract class ModuleFormAnswer_ {

	public static volatile SingularAttribute<ModuleFormAnswer, Variant> variant;
	public static volatile SingularAttribute<ModuleFormAnswer, Long> id;
	public static volatile SingularAttribute<ModuleFormAnswer, ModuleForm> moduleForm;

	public static final String VARIANT = "variant";
	public static final String ID = "id";
	public static final String MODULE_FORM = "moduleForm";

}

