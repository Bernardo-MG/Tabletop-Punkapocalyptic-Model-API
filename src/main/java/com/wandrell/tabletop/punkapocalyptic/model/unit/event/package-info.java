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
/**
 * API for {@link com.wandrell.tabletop.punkapocalyptic.model.unit.Unit Unit}
 * related events.
 * <p>
 * The
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.event.UnitListener
 * UnitListener} takes care of those events affecting units, while the
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.event.GangListener
 * GangListener} does the same thing for gangs.
 * <p>
 * There are adapters for both of them, using them only the concrete method
 * required for each situation must be implemented.
 * <p>
 * Additionally, the
 * {@link com.wandrell.tabletop.punkapocalyptic.model.unit.event.AttributesListener
 * AttributesListener} allows reacting to attribute related events.
 */
package com.wandrell.tabletop.punkapocalyptic.model.unit.event;

