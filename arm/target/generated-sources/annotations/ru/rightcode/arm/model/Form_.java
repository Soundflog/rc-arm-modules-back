package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Form.class)
public abstract class Form_ {

	public static volatile ListAttribute<Form, FormQuestion> formQuestions;
	public static volatile SingularAttribute<Form, String> name;
	public static volatile SingularAttribute<Form, String> description;
	public static volatile SingularAttribute<Form, Scale> scale;
	public static volatile SingularAttribute<Form, Long> id;

	public static final String FORM_QUESTIONS = "formQuestions";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String SCALE = "scale";
	public static final String ID = "id";

}

