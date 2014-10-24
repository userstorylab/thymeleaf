/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.engine.markup.resource;

import java.io.Reader;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public final class ReaderResource implements IResource {

    // Note this resource implementation is NOT serializable

    private final String name;
    private final Reader content;


    public ReaderResource(final String name, final Reader content) {
        super();
        // We will intentionally not use org.thymeleaf.util.Validate in order to make resource implementations
        // as free from other thymeleaf APIs as possible.
        if (content == null) {
            throw new IllegalArgumentException("Resource content cannot be null");
        }
        this.name = name;
        this.content = content;
    }


    public String getName() {
        return this.name;
    }


    public Reader getContent() {
        return this.content;
    }

}
