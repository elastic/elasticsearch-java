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

package co.elastic.clients.elasticsearch.search_application.put_behavioral_analytics;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: search_application.put_behavioral_analytics.AnalyticsAcknowledgeResponseBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#search_application.put_behavioral_analytics.AnalyticsAcknowledgeResponseBase">API
 *      specification</a>
 */

public abstract class AnalyticsAcknowledgeResponseBase extends AcknowledgedResponseBase {
	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected AnalyticsAcknowledgeResponseBase(AbstractBuilder<?> builder) {
		super(builder);

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	/**
	 * Required - The name of the analytics collection created or updated
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("name");
		generator.write(this.name);

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AcknowledgedResponseBase.AbstractBuilder<BuilderT> {
		private String name;

		/**
		 * Required - The name of the analytics collection created or updated
		 * <p>
		 * API name: {@code name}
		 */
		public final BuilderT name(String value) {
			this.name = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupAnalyticsAcknowledgeResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
