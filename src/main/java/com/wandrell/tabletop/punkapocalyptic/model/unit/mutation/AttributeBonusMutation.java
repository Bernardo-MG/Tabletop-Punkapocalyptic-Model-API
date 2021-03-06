/**
 * Copyright 2015 the original author or authors
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.wandrell.tabletop.punkapocalyptic.model.unit.mutation;

import com.wandrell.tabletop.punkapocalyptic.model.unit.stats.AttributesHolder;

/**
 * Interface for mutations which modify attributes.
 * <p>
 * These bonus should be applied always when the unit has that particular
 * mutation, and for as long as he has this mutation.
 * 
 * @author Bernardo Martínez Garrido
 */
public interface AttributeBonusMutation extends Mutation {

    /**
     * Returns the bonus to be applied to each attribute.
     * 
     * @return the bonus to be applied to the attributes
     */
    public AttributesHolder getAttributesBonus();

}
