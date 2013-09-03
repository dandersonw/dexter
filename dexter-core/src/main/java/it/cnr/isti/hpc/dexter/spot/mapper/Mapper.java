/**
 *  Copyright 2012 Diego Ceccarelli
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package it.cnr.isti.hpc.dexter.spot.mapper;

import java.util.Set;

/**
 * Mapper given a spot returns several different versions of the spot.
 * 
 * @author Diego Ceccarelli, diego.ceccarelli@isti.cnr.it created on 20/lug/2012
 */
public interface Mapper {
	/**
	 * given a spot returns several different versions of the spot.
	 * 
	 * @param spot
	 *            the spot to be transformed in several versions
	 * @return a set containing the different versions of the spot.
	 */
	public Set<String> mapper(String spot);

}
