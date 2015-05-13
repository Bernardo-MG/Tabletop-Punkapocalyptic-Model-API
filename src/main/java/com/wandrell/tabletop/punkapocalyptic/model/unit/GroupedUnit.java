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
package com.wandrell.tabletop.punkapocalyptic.model.unit;

import com.wandrell.tabletop.valuebox.ValueBox;

/**
 * Interface for grouped units. These are the units which are used bundled,
 * working as a pack, like they were a single unit.
 * 
 * @author Bernardo Martínez Garrido
 * @version 0.1.0
 */
public interface GroupedUnit extends Unit {

    /**
     * Returns the group size.
     * 
     * @return the group size
     */
    public ValueBox getGroupSize();

}
