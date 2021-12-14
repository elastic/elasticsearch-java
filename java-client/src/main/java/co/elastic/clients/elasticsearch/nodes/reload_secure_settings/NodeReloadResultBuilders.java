/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.nodes.reload_secure_settings;

import co.elastic.clients.elasticsearch.nodes.Stats;

/**
 * Builders for {@link NodeReloadResult} variants.
 */
public class NodeReloadResultBuilders {
	private NodeReloadResultBuilders() {
	}

	/**
	 * Creates a builder for the {@link Stats stats} {@code NodeReloadResult}
	 * variant.
	 */
	public static Stats.Builder stats() {
		return new Stats.Builder();
	}

	/**
	 * Creates a builder for the {@link NodeReloadError error}
	 * {@code NodeReloadResult} variant.
	 */
	public static NodeReloadError.Builder error() {
		return new NodeReloadError.Builder();
	}

}
