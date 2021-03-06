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
package com.here.deployment.domain;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class DeploymentResponseSuccess.
 */
@JsonInclude(Include.NON_NULL)
public class DeploymentResponseSuccess extends DeploymentResponse {

	/** The app id. */
	protected String appId;
	
	/** The plugin responses. */
	protected List<PluginResponse> pluginResponses;
	
	/**
	 * Instantiates a new deployment response success.
	 */
	public DeploymentResponseSuccess() {
		super();
	}
	
	/**
	 * Instantiates a new deployment response success.
	 *
	 * @param appId the app id
	 */
	public DeploymentResponseSuccess(String appId) {
		this.appId = appId;
	}

	/**
	 * Gets the app id.
	 *
	 * @return the app id
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * Sets the app id.
	 *
	 * @param appId the new app id
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * Adds the plugin response.
	 *
	 * @param pluginResponse the plugin response
	 */
	public void addPluginResponse(PluginResponse pluginResponse) {
		if (this.pluginResponses == null) {
			pluginResponses = new ArrayList<>();
		}
		pluginResponses.add(pluginResponse);
	}

	/**
	 * Gets the plugin responses.
	 *
	 * @return the plugin responses
	 */
	public List<PluginResponse> getPluginResponses() {
		if (pluginResponses == null) {
			return null;
		} else {
			return new ArrayList<>(pluginResponses);
		}
	}
}
