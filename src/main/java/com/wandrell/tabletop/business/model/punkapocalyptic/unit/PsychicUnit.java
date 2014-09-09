/**
 * Copyright 2014 the original author or authors
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
package com.wandrell.tabletop.business.model.punkapocalyptic.unit;

import java.util.Collection;

import com.wandrell.tabletop.business.model.punkapocalyptic.mutation.PsychicPower;

/**
 * Represents a unit with psychic powers.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface PsychicUnit extends Unit {

    @Override
    public PsychicUnit createNewInstance();

    /**
     * Returns all the psychic powers the unit has.
     * 
     * @return all the unit's psychic powers
     */
    public Collection<PsychicPower> getPsychicPowers();

}