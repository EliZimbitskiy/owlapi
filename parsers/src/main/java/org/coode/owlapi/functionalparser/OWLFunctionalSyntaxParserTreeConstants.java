/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, The University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* Generated By:JavaCC: Do not edit this line. OWLFunctionalSyntaxParserTreeConstants.java Version 5.0 */
package org.coode.owlapi.functionalparser;

@SuppressWarnings("javadoc")
public interface OWLFunctionalSyntaxParserTreeConstants {
    public int JJTPARSE = 0;
    public int JJTONTOLOGY = 1;
    public int JJTPREFIX = 2;
    public int JJTIRI = 3;
    public int JJTFULLIRI = 4;
    public int JJTABBREVIATEDIRI = 5;
    public int JJTPREFIXNAME = 6;
    public int JJTCLASSEXPRESSION = 7;
    public int JJTCLASSIRI = 8;
    public int JJTCLASSEXPRESSIONSET = 9;
    public int JJTINDIVIDUALMINONESET = 10;
    public int JJTOBJECTUNIONOF = 11;
    public int JJTOBJECTINTERSECTIONOF = 12;
    public int JJTOBJECTCOMPLEMENTOF = 13;
    public int JJTOBJECTONEOF = 14;
    public int JJTOBJECTALLVALUESFROM = 15;
    public int JJTOBJECTSOMEVALUESFROM = 16;
    public int JJTOBJECTHASVALUE = 17;
    public int JJTOBJECTSELF = 18;
    public int JJTOBJECTMINCARDINALITY = 19;
    public int JJTOBJECTEXACTCARDINALITY = 20;
    public int JJTOBJECTMAXCARDINALITY = 21;
    public int JJTDATAALLVALUESFROM = 22;
    public int JJTDATASOMEVALUESFROM = 23;
    public int JJTDATAHASVALUE = 24;
    public int JJTDATAMINCARDINALITY = 25;
    public int JJTDATAEXACTCARDINALITY = 26;
    public int JJTDATAMAXCARDINALITY = 27;
    public int JJTCLASS = 28;
    public int JJTOBJECTPROPERTYEXPRESSION = 29;
    public int JJTINVERSEOBJECTPROPERTY = 30;
    public int JJTOBJECTPROPERTY = 31;
    public int JJTDATAPROPERTYEXPRESSION = 32;
    public int JJTDATAPROPERTYIRI = 33;
    public int JJTDATAPROPERTY = 34;
    public int JJTANNOTATIONPROPERTY = 35;
    public int JJTANNOTATIONPROPERTYIRI = 36;
    public int JJTNAMEDINDIVIDUAL = 37;
    public int JJTANONYMOUSINDIVIDUAL = 38;
    public int JJTDATATYPE = 39;
    public int JJTDATATYPEIRI = 40;
    public int JJTCARDINALITY = 41;
    public int JJTINTEGER = 42;
    public int JJTDATATYPEDEFINITIONAXIOM = 43;
    public int JJTDATARANGE = 44;
    public int JJTDATACOMPLEMENTOF = 45;
    public int JJTDATAONEOF = 46;
    public int JJTDATAUNIONOF = 47;
    public int JJTDATAINTERSECTIONOF = 48;
    public int JJTDATARANGERESTRICTION = 49;
    public int JJTDATARANGEFACETRESTRICTION = 50;
    public int JJTAXIOM = 51;
    public int JJTCLASSAXIOM = 52;
    public int JJTSUBCLASSOF = 53;
    public int JJTEQUIVALENTCLASSES = 54;
    public int JJTDISJOINTCLASSES = 55;
    public int JJTDISJOINTUNION = 56;
    public int JJTOBJECTPROPERTYAXIOM = 57;
    public int JJTSUBOBJECTPROPERTYCHAIN = 58;
    public int JJTSUBOBJECTPROPERTYOF = 59;
    public int JJTEQUIVALENTOBJECTPROPERTIES = 60;
    public int JJTDISJOINTOBJECTPROPERTIES = 61;
    public int JJTOBJECTPROPERTYSET = 62;
    public int JJTOBJECTPROPERTYRANGE = 63;
    public int JJTOBJECTPROPERTYDOMAIN = 64;
    public int JJTFUNCTIONALOBJECTPROPERTY = 65;
    public int JJTINVERSEOBJECTPROPERTIES = 66;
    public int JJTINVERSEFUNCTIONALOBJECTPROPERTY = 67;
    public int JJTSYMMETRICOBJECTPROPERTY = 68;
    public int JJTASYMMETRICOBJECTPROPERTY = 69;
    public int JJTREFLEXIVEOBJECTPROPERTY = 70;
    public int JJTIRREFLEXIVEOBJECTPROPERTY = 71;
    public int JJTTRANSITIVEOBJECTPROPERTY = 72;
    public int JJTDATAPROPERTYAXIOM = 73;
    public int JJTSUBDATAPROPERTYOF = 74;
    public int JJTEQUIVALENTDATAPROPERTIES = 75;
    public int JJTDISJOINTDATAPROPERTIES = 76;
    public int JJTDATAPROPERTYSET = 77;
    public int JJTDATAPROPERTYDOMAIN = 78;
    public int JJTDATAPROPERTYRANGE = 79;
    public int JJTFUNCTIONALDATAPROPERTY = 80;
    public int JJTINDIVIDUALAXIOM = 81;
    public int JJTINDIVIDUALSET = 82;
    public int JJTSAMEINDIVIDUALS = 83;
    public int JJTDIFFERENTINDIVIDUALS = 84;
    public int JJTCLASSASSERTION = 85;
    public int JJTOBJECTPROPERTYASSERTION = 86;
    public int JJTNEGATIVEOBJECTPROPERTYASSERTION = 87;
    public int JJTDATAPROPERTYASSERTION = 88;
    public int JJTNEGATIVEDATAPROPERTYASSERTION = 89;
    public int JJTINDIVIDUALIRI = 90;
    public int JJTINDIVIDUAL = 91;
    public int JJTOBJECTPROPERTYIRI = 92;
    public int JJTANNOTATIONAXIOM = 93;
    public int JJTANNOTATION = 94;
    public int JJTANNOTATIONSUBJECT = 95;
    public int JJTANNOTATIONVALUE = 96;
    public int JJTAXIOMANNOTATIONSET = 97;
    public int JJTIMPORTSDECLARATION = 98;
    public int JJTANNOTATIONASSERTION = 99;
    public int JJTSUBANNOTATIONPROPERTYOF = 100;
    public int JJTANNOTATIONPROPERTYDOMAIN = 101;
    public int JJTANNOTATIONPROPERTYRANGE = 102;
    public int JJTHASKEY = 103;
    public int JJTDECLARATION = 104;
    public int JJTENTITY = 105;
    public int JJTLITERAL = 106;
    public int JJTQUOTEDSTRING = 107;
    public int JJTLANGTAG = 108;
    public int JJTDLSAFERULE = 109;
    public int JJTATOM = 110;
    public int JJTCLASSATOM = 111;
    public int JJTDATARANGEATOM = 112;
    public int JJTOBJECTPROPERTYATOM = 113;
    public int JJTDATAPROPERTYATOM = 114;
    public int JJTBUILTINATOM = 115;
    public int JJTSAMEINDIVIDUALATOM = 116;
    public int JJTDIFFERENTINDIVIDUALSATOM = 117;
    public int JJTIARG = 118;
    public int JJTDARG = 119;
    public String[] jjtNodeName = { "parse", "Ontology", "Prefix", "IRI", "FullIRI",
            "AbbreviatedIRI", "PrefixName", "ClassExpression", "ClassIRI",
            "ClassExpressionSet", "IndividualMinOneSet", "ObjectUnionOf",
            "ObjectIntersectionOf", "ObjectComplementOf", "ObjectOneOf",
            "ObjectAllValuesFrom", "ObjectSomeValuesFrom", "ObjectHasValue",
            "ObjectSelf", "ObjectMinCardinality", "ObjectExactCardinality",
            "ObjectMaxCardinality", "DataAllValuesFrom", "DataSomeValuesFrom",
            "DataHasValue", "DataMinCardinality", "DataExactCardinality",
            "DataMaxCardinality", "Class", "ObjectPropertyExpression",
            "InverseObjectProperty", "ObjectProperty", "DataPropertyExpression",
            "DataPropertyIRI", "DataProperty", "AnnotationProperty",
            "AnnotationPropertyIRI", "NamedIndividual", "AnonymousIndividual",
            "Datatype", "DatatypeIRI", "Cardinality", "Integer",
            "DatatypeDefinitionAxiom", "DataRange", "DataComplementOf", "DataOneOf",
            "DataUnionOf", "DataIntersectionOf", "DataRangeRestriction",
            "DataRangeFacetRestriction", "Axiom", "ClassAxiom", "SubClassOf",
            "EquivalentClasses", "DisjointClasses", "DisjointUnion",
            "ObjectPropertyAxiom", "SubObjectPropertyChain", "SubObjectPropertyOf",
            "EquivalentObjectProperties", "DisjointObjectProperties",
            "ObjectPropertySet", "ObjectPropertyRange", "ObjectPropertyDomain",
            "FunctionalObjectProperty", "InverseObjectProperties",
            "InverseFunctionalObjectProperty", "SymmetricObjectProperty",
            "AsymmetricObjectProperty", "ReflexiveObjectProperty",
            "IrreflexiveObjectProperty", "TransitiveObjectProperty", "DataPropertyAxiom",
            "SubDataPropertyOf", "EquivalentDataProperties", "DisjointDataProperties",
            "DataPropertySet", "DataPropertyDomain", "DataPropertyRange",
            "FunctionalDataProperty", "IndividualAxiom", "IndividualSet",
            "SameIndividuals", "DifferentIndividuals", "ClassAssertion",
            "ObjectPropertyAssertion", "NegativeObjectPropertyAssertion",
            "DataPropertyAssertion", "NegativeDataPropertyAssertion", "IndividualIRI",
            "Individual", "ObjectPropertyIRI", "AnnotationAxiom", "Annotation",
            "AnnotationSubject", "AnnotationValue", "AxiomAnnotationSet",
            "ImportsDeclaration", "AnnotationAssertion", "SubAnnotationPropertyOf",
            "AnnotationPropertyDomain", "AnnotationPropertyRange", "HasKey",
            "Declaration", "Entity", "Literal", "QuotedString", "LangTag", "DLSafeRule",
            "Atom", "ClassAtom", "DataRangeAtom", "ObjectPropertyAtom",
            "DataPropertyAtom", "BuiltInAtom", "SameIndividualAtom",
            "DifferentIndividualsAtom", "IArg", "DArg", };
}
/*
 * JavaCC - OriginalChecksum=32c75f96bd8346ad7a2680024302ff35 (do not edit this
 * line)
 */
