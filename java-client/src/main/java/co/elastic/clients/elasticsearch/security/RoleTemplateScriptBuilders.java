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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.StoredScriptId;
import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link RoleTemplateScript} variants.
 */
public class RoleTemplateScriptBuilders {
	private RoleTemplateScriptBuilders() {
	}

	/**
	 * Creates a builder for the {@link StoredScriptId stored}
	 * {@code RoleTemplateScript} variant.
	 */
	public static StoredScriptId.Builder stored() {
		return new StoredScriptId.Builder();
	}

	/**
	 * Creates a builder for the {@link RoleTemplateInlineScript inline}
	 * {@code RoleTemplateScript} variant.
	 */
	public static RoleTemplateInlineScript.Builder inline() {
		return new RoleTemplateInlineScript.Builder();
	}

}
