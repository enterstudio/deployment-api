/*
* Copyright (c) 2017 HERE Europe B.V.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.here.deployment.mapper;

import org.mapstruct.Mapper;

/**
 * The Interface UpgradeStrategyMapper.
 */
@Mapper(componentModel = "spring")
public interface UpgradeStrategyMapper {
	
	/**
	 * Convert.
	 *
	 * @param container the container
	 * @return the mesosphere.dcos.client.model.v 2 . upgrade strategy
	 */
	mesosphere.dcos.client.model.v2.UpgradeStrategy convert(com.here.deployment.cloudconfig.model.dcos.UpgradeStrategy container);
}

