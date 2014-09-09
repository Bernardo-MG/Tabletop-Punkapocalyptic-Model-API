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

import com.wandrell.tabletop.business.model.punkapocalyptic.faction.Faction;
import com.wandrell.tabletop.business.model.punkapocalyptic.unit.event.BandListener;
import com.wandrell.tabletop.business.model.valuehandler.ValueHandler;
import com.wandrell.util.tag.NewInstantiable;

/**
 * Represents a band composed by a group of units, and all the other data
 * associated to it.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface Band extends NewInstantiable {

    /**
     * Adds a listener for band events.
     * 
     * @param listener
     *            the listener for band events to add
     */
    public void addBandListener(final BandListener listener);

    /**
     * Adds a unit to the band.
     * 
     * @param unit
     *            the unit to add
     */
    public void addUnit(final Unit unit);

    /**
     * Removes all the units from the band.
     */
    public void clearUnits();

    @Override
    public Band createNewInstance();

    /**
     * Returns the number of bullets globally assigned to the band.
     * 
     * @return the number of bullets globally assigned
     */
    public ValueHandler getBullets();

    /**
     * The band's faction.
     * 
     * @return the band's faction
     */
    public Faction getFaction();

    /**
     * The band units.
     * 
     * @return the band units
     */
    public Collection<Unit> getUnits();

    /**
     * Returns the band's valoration.
     * 
     * @return the band's valoration
     */
    public ValueHandler getValoration();

    /**
     * Removes a listener for band events.
     * 
     * @param listener
     *            the listener for band events to remove
     */
    public void removeBandListener(final BandListener listener);

    /**
     * Removes a unit from the band.
     * 
     * @param unit
     *            the unit to remove
     */
    public void removeUnit(Unit unit);

}