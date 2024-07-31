package ru.rightcode.arm.model;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Question.class)
public abstract class Question_ {

	public static volatile ListAttribute<Question, FormQuestion> formQuestions;
	public static volatile SingularAttribute<Question, Long> id;
	public static volatile ListAttribute<Question, Variant> variants;
	public static volatile SingularAttribute<Question, String> content;

	public static final String FORM_QUESTIONS = "formQuestions";
	public static final String ID = "id";
	public static final String VARIANTS = "variants";
	public static final String CONTENT = "content";

}

