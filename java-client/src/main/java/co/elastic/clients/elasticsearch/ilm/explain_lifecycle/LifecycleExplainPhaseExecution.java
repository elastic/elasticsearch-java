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

package co.elastic.clients.elasticsearch.ilm.explain_lifecycle;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.explain_lifecycle.LifecycleExplainPhaseExecution

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ilm.explain_lifecycle.LifecycleExplainPhaseExecution">API
 *      specification</a>
 */
@JsonpDeserializable
public class LifecycleExplainPhaseExecution implements JsonpSerializable {
	private final String policy;

	private final long version;

	private final long modifiedDateInMillis;

	// ---------------------------------------------------------------------------------------------

	private LifecycleExplainPhaseExecution(Builder builder) {

		this.policy = ApiTypeHelper.requireNonNull(builder.policy, this, "policy");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.modifiedDateInMillis = ApiTypeHelper.requireNonNull(builder.modifiedDateInMillis, this,
				"modifiedDateInMillis");

	}

	public static LifecycleExplainPhaseExecution of(
			Function<Builder, ObjectBuilder<LifecycleExplainPhaseExecution>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final String policy() {
		return this.policy;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code modified_date_in_millis}
	 */
	public final long modifiedDateInMillis() {
		return this.modifiedDateInMillis;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("policy");
		generator.write(this.policy);

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("modified_date_in_millis");
		generator.write(this.modifiedDateInMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LifecycleExplainPhaseExecution}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<LifecycleExplainPhaseExecution> {
		private String policy;

		private Long version;

		private Long modifiedDateInMillis;

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(String value) {
			this.policy = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Required - API name: {@code modified_date_in_millis}
		 */
		public final Builder modifiedDateInMillis(long value) {
			this.modifiedDateInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LifecycleExplainPhaseExecution}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LifecycleExplainPhaseExecution build() {
			_checkSingleUse();

			return new LifecycleExplainPhaseExecution(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LifecycleExplainPhaseExecution}
	 */
	public static final JsonpDeserializer<LifecycleExplainPhaseExecution> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LifecycleExplainPhaseExecution::setupLifecycleExplainPhaseExecutionDeserializer);

	protected static void setupLifecycleExplainPhaseExecutionDeserializer(
			ObjectDeserializer<LifecycleExplainPhaseExecution.Builder> op) {

		op.add(Builder::policy, JsonpDeserializer.stringDeserializer(), "policy");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::modifiedDateInMillis, JsonpDeserializer.longDeserializer(), "modified_date_in_millis");

	}

}
