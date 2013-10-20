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
 * Copyright 2011, University of Manchester
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
package org.coode.owlapi.rdf.model;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.coode.owlapi.rdf.renderer.TripleComparator;
import org.semanticweb.owlapi.io.RDFNode;
import org.semanticweb.owlapi.io.RDFResource;
import org.semanticweb.owlapi.io.RDFResourceBlankNode;
import org.semanticweb.owlapi.io.RDFTriple;

/** Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 06-Dec-2006<br>
 * <br> */
public class RDFGraph {
    private Map<RDFResource, Set<RDFTriple>> triplesBySubject = new HashMap<RDFResource, Set<RDFTriple>>();
    private Set<RDFResourceBlankNode> rootAnonymousNodes = null;
    private Set<RDFTriple> triples = new HashSet<RDFTriple>();

    /** Determines if this graph is empty (i.e. whether or not it contains any
     * triples).
     * 
     * @return {@code true} if the graph contains triples, otherwise
     *         {@code false}
     * @since 3.5 */
    public boolean isEmpty() {
        return triples.isEmpty();
    }

    /** @param triple
     *            triple to add */
    public void addTriple(@Nonnull RDFTriple triple) {
        checkNotNull(triple, "triple cannot be null");
        // Reset the computation of root anon nodes
        rootAnonymousNodes = null;
        triples.add(triple);
        Set<RDFTriple> tripleSet = triplesBySubject.get(triple.getSubject());
        if (tripleSet == null) {
            tripleSet = new HashSet<RDFTriple>();
            triplesBySubject.put(triple.getSubject(), tripleSet);
        }
        tripleSet.add(triple);
    }

    /** @param subject
     * @param sort
     * @return sorted triples */
    @Nonnull
    public List<RDFTriple> getSortedTriplesForSubject(@Nonnull RDFNode subject,
            boolean sort) {
        List<RDFTriple> toReturn = new ArrayList<RDFTriple>();
        Set<RDFTriple> set = triplesBySubject.get(checkNotNull(subject,
                "subject cannot be null"));
        if (set != null) {
            toReturn.addAll(set);
        }
        if (sort) {
            Collections.sort(toReturn, new TripleComparator());
        }
        return toReturn;
    }

    /** @return root anonymous nodes */
    @Nonnull
    public Set<RDFResourceBlankNode> getRootAnonymousNodes() {
        if (rootAnonymousNodes == null) {
            rebuildAnonRoots();
        }
        return rootAnonymousNodes;
    }

    private void rebuildAnonRoots() {
        rootAnonymousNodes = new HashSet<RDFResourceBlankNode>();
        for (RDFTriple triple : triples) {
            if (triple.getSubject() instanceof RDFResourceBlankNode) {
                rootAnonymousNodes.add((RDFResourceBlankNode) triple.getSubject());
            }
        }
        for (RDFTriple triple : triples) {
            if (!triple.getObject().isLiteral()) {
                rootAnonymousNodes.remove(triple.getObject());
            }
            if (!triple.getSubject().isAnonymous()) {
                rootAnonymousNodes.remove(triple.getSubject());
            }
        }
    }

    /** @param w
     *            writer to write to
     * @throws IOException
     *             if exceptions happen */
    public void dumpTriples(@Nonnull Writer w) throws IOException {
        checkNotNull(w, "w cannot be null");
        for (Set<RDFTriple> set : triplesBySubject.values()) {
            for (RDFTriple triple : set) {
                w.write(triple.toString());
                w.write("\n");
            }
        }
        w.flush();
    }
}
